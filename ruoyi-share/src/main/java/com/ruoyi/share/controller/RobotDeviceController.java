package com.ruoyi.share.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.share.domain.RobotDevice;
import com.ruoyi.share.domain.RobotDeviceApply;
import com.ruoyi.share.service.IRobotDeviceApplyService;
import com.ruoyi.share.service.IRobotDeviceService;
import com.ruoyi.share.service.impl.RobotDeviceApplyServiceImpl;
import com.ruoyi.share.util.Result;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 机器人设备Controller
 * 
 * @author ruoyi
 * @date 2019-12-31
 */
@Controller
@RequestMapping("/share/RobotDevice")
public class RobotDeviceController extends BaseController
{
    private String prefix = "share/RobotDevice";

    @Autowired
    private IRobotDeviceService robotDeviceService;
    
    @Autowired
    private IRobotDeviceApplyService  robotDeviceApplyService;

    @RequiresPermissions("share:RobotDevice:view")
    @GetMapping()
    public String RobotDevice()
    {
        return prefix + "/RobotDevice";
    }
    
  

    /**
     * 查询机器人设备列表
     */
    @RequiresPermissions("share:RobotDevice:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(RobotDevice robotDevice)
    {
        startPage();
        List<RobotDevice> list = robotDeviceService.selectRobotDeviceList(robotDevice);
        return getDataTable(list);
    }

    /**
     * 导出机器人设备列表
     */
    @RequiresPermissions("share:RobotDevice:export")
    @Log(title = "机器人设备", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(RobotDevice robotDevice){
        List<RobotDevice> list = robotDeviceService.selectRobotDeviceList(robotDevice);
        ExcelUtil<RobotDevice> util = new ExcelUtil<RobotDevice>(RobotDevice.class);
        return util.exportExcel(list, "RobotDevice");
    }

    /**
     * 新增机器人设备
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存机器人设备
     */
    @RequiresPermissions("share:RobotDevice:add")
    @Log(title = "机器人设备", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(RobotDevice robotDevice)
    {
        return toAjax(robotDeviceService.insertRobotDevice(robotDevice));
    }

    /**
     * 修改机器人设备
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        RobotDevice robotDevice = robotDeviceService.selectRobotDeviceById(id);
        mmap.put("robotDevice", robotDevice);
        return prefix + "/edit";
    }

    /**
     * 修改保存机器人设备
     */
    @RequiresPermissions("share:RobotDevice:edit")
    @Log(title = "机器人设备", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(RobotDevice robotDevice)
    {
        return toAjax(robotDeviceService.updateRobotDevice(robotDevice));
    }

    /**
     * 删除机器人设备
     */
    @RequiresPermissions("share:RobotDevice:remove")
    @Log(title = "机器人设备", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(robotDeviceService.deleteRobotDeviceByIds(ids));
    }
}
