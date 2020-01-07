package com.ruoyi.share.controller;

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
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.share.domain.RobotSharePic;
import com.ruoyi.share.service.IRobotSharePicService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 共享图片Controller
 * 
 * @author ruoyi
 * @date 2020-01-03
 */
@Controller
@RequestMapping("/share/RobotSharePic")
public class RobotSharePicController extends BaseController
{
    private String prefix = "share/RobotSharePic";

    @Autowired
    private IRobotSharePicService robotSharePicService;

    @RequiresPermissions("share:RobotSharePic:view")
    @GetMapping()
    public String RobotSharePic()
    {
        return prefix + "/RobotSharePic";
    }

    /**
     * 查询共享图片列表
     */
    @RequiresPermissions("share:RobotSharePic:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(RobotSharePic robotSharePic)
    {
        startPage();
        List<RobotSharePic> list = robotSharePicService.selectRobotSharePicList(robotSharePic);
        return getDataTable(list);
    }

    /**
     * 导出共享图片列表
     */
    @RequiresPermissions("share:RobotSharePic:export")
    @Log(title = "共享图片", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(RobotSharePic robotSharePic)
    {
        List<RobotSharePic> list = robotSharePicService.selectRobotSharePicList(robotSharePic);
        ExcelUtil<RobotSharePic> util = new ExcelUtil<RobotSharePic>(RobotSharePic.class);
        return util.exportExcel(list, "RobotSharePic");
    }

    /**
     * 新增共享图片
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存共享图片
     */
    @RequiresPermissions("share:RobotSharePic:add")
    @Log(title = "共享图片", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(RobotSharePic robotSharePic)
    {
        return toAjax(robotSharePicService.insertRobotSharePic(robotSharePic));
    }

    /**
     * 修改共享图片
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        RobotSharePic robotSharePic = robotSharePicService.selectRobotSharePicById(id);
        mmap.put("robotSharePic", robotSharePic);
        return prefix + "/edit";
    }

    /**
     * 修改保存共享图片
     */
    @RequiresPermissions("share:RobotSharePic:edit")
    @Log(title = "共享图片", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(RobotSharePic robotSharePic)
    {
        return toAjax(robotSharePicService.updateRobotSharePic(robotSharePic));
    }

    /**
     * 删除共享图片
     */
    @RequiresPermissions("share:RobotSharePic:remove")
    @Log(title = "共享图片", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(robotSharePicService.deleteRobotSharePicByIds(ids));
    }
}
