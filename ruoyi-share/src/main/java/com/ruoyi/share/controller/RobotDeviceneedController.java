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
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.share.domain.RobotDevice;
import com.ruoyi.share.domain.RobotDeviceneed;
import com.ruoyi.share.service.IRobotDeviceneedService;
import com.ruoyi.share.util.Result;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 机器人需求Controller
 * 
 * @author ruoyi
 * @date 2020-01-02
 */
@Controller
@RequestMapping("/share/RobotDeviceneed")
public class RobotDeviceneedController extends BaseController
{
    private String prefix = "share/RobotDeviceneed";
    @Autowired
    private IRobotDeviceneedService robotDeviceneedService;
 
    @RequiresPermissions("share:RobotDeviceneed:view")
    @GetMapping()
    public String RobotDeviceneed()
    {
        return prefix + "/RobotDeviceneed";
    }

    /**
     * 查询机器人需求列表
     */
    @RequiresPermissions("share:RobotDeviceneed:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(RobotDeviceneed robotDeviceneed)
    {
        startPage();
        List<RobotDeviceneed> list = robotDeviceneedService.selectRobotDeviceneedList(robotDeviceneed);
        return getDataTable(list);
    }

    /**
     * 导出机器人需求列表
     */
    @RequiresPermissions("share:RobotDeviceneed:export")
    @Log(title = "机器人需求", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(RobotDeviceneed robotDeviceneed)
    {
        List<RobotDeviceneed> list = robotDeviceneedService.selectRobotDeviceneedList(robotDeviceneed);
        ExcelUtil<RobotDeviceneed> util = new ExcelUtil<RobotDeviceneed>(RobotDeviceneed.class);
        return util.exportExcel(list, "RobotDeviceneed");
    }

    /**
     * 新增机器人需求
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存机器人需求
     */
    @RequiresPermissions("share:RobotDeviceneed:add")
    @Log(title = "机器人需求", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(RobotDeviceneed robotDeviceneed)
    {
        return toAjax(robotDeviceneedService.insertRobotDeviceneed(robotDeviceneed));
    }

    /**
     * 修改机器人需求
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        RobotDeviceneed robotDeviceneed = robotDeviceneedService.selectRobotDeviceneedById(id);
        mmap.put("robotDeviceneed", robotDeviceneed);
        return prefix + "/edit";
    }

    /**
     * 修改保存机器人需求
     */
    @RequiresPermissions("share:RobotDeviceneed:edit")
    @Log(title = "机器人需求", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(RobotDeviceneed robotDeviceneed)
    {
        return toAjax(robotDeviceneedService.updateRobotDeviceneed(robotDeviceneed));
    }

    /**
     * 删除机器人需求
     */
    @RequiresPermissions("share:RobotDeviceneed:remove")
    @Log(title = "机器人需求", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(robotDeviceneedService.deleteRobotDeviceneedByIds(ids));
    }
}
