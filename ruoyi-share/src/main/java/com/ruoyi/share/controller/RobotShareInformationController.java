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
import com.ruoyi.share.domain.RobotShareInformation;
import com.ruoyi.share.service.IRobotShareInformationService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 共享资讯Controller
 * 
 * @author ruoyi
 * @date 2020-01-03
 */
@Controller
@RequestMapping("/share/RobotShareInformation")
public class RobotShareInformationController extends BaseController
{
    private String prefix = "share/RobotShareInformation";

    @Autowired
    private IRobotShareInformationService robotShareInformationService;

    @RequiresPermissions("share:RobotShareInformation:view")
    @GetMapping()
    public String RobotShareInformation()
    {
        return prefix + "/RobotShareInformation";
    }

    /**
     * 查询共享资讯列表
     */
    @RequiresPermissions("share:RobotShareInformation:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(RobotShareInformation robotShareInformation)
    {
        startPage();
        List<RobotShareInformation> list = robotShareInformationService.selectRobotShareInformationList(robotShareInformation);
        return getDataTable(list);
    }

    /**
     * 导出共享资讯列表
     */
    @RequiresPermissions("share:RobotShareInformation:export")
    @Log(title = "共享资讯", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(RobotShareInformation robotShareInformation)
    {
        List<RobotShareInformation> list = robotShareInformationService.selectRobotShareInformationList(robotShareInformation);
        ExcelUtil<RobotShareInformation> util = new ExcelUtil<RobotShareInformation>(RobotShareInformation.class);
        return util.exportExcel(list, "RobotShareInformation");
    }

    /**
     * 新增共享资讯
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存共享资讯
     */
    @RequiresPermissions("share:RobotShareInformation:add")
    @Log(title = "共享资讯", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(RobotShareInformation robotShareInformation)
    {
        return toAjax(robotShareInformationService.insertRobotShareInformation(robotShareInformation));
    }

    /**
     * 修改共享资讯
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        RobotShareInformation robotShareInformation = robotShareInformationService.selectRobotShareInformationById(id);
        mmap.put("robotShareInformation", robotShareInformation);
        return prefix + "/edit";
    }

    /**
     * 修改保存共享资讯
     */
    @RequiresPermissions("share:RobotShareInformation:edit")
    @Log(title = "共享资讯", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(RobotShareInformation robotShareInformation)
    {
        return toAjax(robotShareInformationService.updateRobotShareInformation(robotShareInformation));
    }

    /**
     * 删除共享资讯
     */
    @RequiresPermissions("share:RobotShareInformation:remove")
    @Log(title = "共享资讯", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(robotShareInformationService.deleteRobotShareInformationByIds(ids));
    }
}
