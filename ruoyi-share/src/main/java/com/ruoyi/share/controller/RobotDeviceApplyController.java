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
import com.ruoyi.share.domain.RobotDeviceApply;
import com.ruoyi.share.service.IRobotDeviceApplyService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 机器设备申请Controller
 * 
 * @author ruoyi
 * @date 2020-01-02
 */
@Controller
@RequestMapping("/share/RobotDeviceApply")
public class RobotDeviceApplyController extends BaseController
{
    private String prefix = "share/RobotDeviceApply";

    @Autowired
    private IRobotDeviceApplyService robotDeviceApplyService;

    @RequiresPermissions("share:RobotDeviceApply:view")
    @GetMapping()
    public String RobotDeviceApply()
    {
        return prefix + "/RobotDeviceApply";
    }

    /**
     * 查询机器设备申请列表
     */
    @RequiresPermissions("share:RobotDeviceApply:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(RobotDeviceApply robotDeviceApply)
    {
        startPage();
        List<RobotDeviceApply> list = robotDeviceApplyService.selectRobotDeviceApplyList(robotDeviceApply);
        return getDataTable(list);
    }

    /**
     * 导出机器设备申请列表
     */
    @RequiresPermissions("share:RobotDeviceApply:export")
    @Log(title = "机器设备申请", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(RobotDeviceApply robotDeviceApply)
    {
        List<RobotDeviceApply> list = robotDeviceApplyService.selectRobotDeviceApplyList(robotDeviceApply);
        ExcelUtil<RobotDeviceApply> util = new ExcelUtil<RobotDeviceApply>(RobotDeviceApply.class);
        return util.exportExcel(list, "RobotDeviceApply");
    }

    /**
     * 新增机器设备申请
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存机器设备申请
     */
    @RequiresPermissions("share:RobotDeviceApply:add")
    @Log(title = "机器设备申请", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(RobotDeviceApply robotDeviceApply)
    {
        return toAjax(robotDeviceApplyService.insertRobotDeviceApply(robotDeviceApply));
    }

    /**
     * 修改机器设备申请
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        RobotDeviceApply robotDeviceApply = robotDeviceApplyService.selectRobotDeviceApplyById(id);
        mmap.put("robotDeviceApply", robotDeviceApply);
        return prefix + "/edit";
    }

    /**
     * 修改保存机器设备申请
     */
    @RequiresPermissions("share:RobotDeviceApply:edit")
    @Log(title = "机器设备申请", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(RobotDeviceApply robotDeviceApply)
    {
        return toAjax(robotDeviceApplyService.updateRobotDeviceApply(robotDeviceApply));
    }

    /**
     * 删除机器设备申请
     */
    @RequiresPermissions("share:RobotDeviceApply:remove")
    @Log(title = "机器设备申请", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(robotDeviceApplyService.deleteRobotDeviceApplyByIds(ids));
    }
}
