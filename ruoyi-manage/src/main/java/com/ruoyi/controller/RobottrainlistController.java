package com.ruoyi.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.domain.Robottrainlist;
import com.ruoyi.service.IRobottrainlistService;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2020-01-08
 */
@Controller
@RequestMapping("/system/robottrainlist")
public class RobottrainlistController extends BaseController
{
    private String prefix = "system/robottrainlist";

    @Autowired
    private IRobottrainlistService robottrainlistService;

    @RequiresPermissions("system:robottrainlist:view")
    @GetMapping()
    public String robottrainlist()
    {
        return prefix + "/robottrainlist";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:robottrainlist:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Robottrainlist robottrainlist)
    {
        startPage();
        List<Robottrainlist> list = robottrainlistService.selectRobottrainlistList(robottrainlist);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:robottrainlist:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Robottrainlist robottrainlist)
    {
        List<Robottrainlist> list = robottrainlistService.selectRobottrainlistList(robottrainlist);
        ExcelUtil<Robottrainlist> util = new ExcelUtil<Robottrainlist>(Robottrainlist.class);
        return util.exportExcel(list, "robottrainlist");
    }

    /**
     * 新增【请填写功能名称】
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存【请填写功能名称】
     */
    @RequiresPermissions("system:robottrainlist:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Robottrainlist robottrainlist)
    {
    	robottrainlist.setEnterdate(DateUtils.getTime());
        return toAjax(robottrainlistService.insertRobottrainlist(robottrainlist));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Robottrainlist robottrainlist = robottrainlistService.selectRobottrainlistById(id);
        mmap.put("robottrainlist", robottrainlist);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:robottrainlist:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Robottrainlist robottrainlist)
    {
        return toAjax(robottrainlistService.updateRobottrainlist(robottrainlist));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:robottrainlist:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(robottrainlistService.deleteRobottrainlistByIds(ids));
    }
}
