package com.ruoyi.controller;

import java.util.List;
import java.util.Map;

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
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.domain.Robotproject;
import com.ruoyi.service.IRobotprojectService;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2019-12-30
 */
@Controller
@RequestMapping("/system/robotproject")
public class RobotprojectController extends BaseController
{
    private String prefix = "system/robotproject";

    @Autowired
    private IRobotprojectService robotprojectService;

    @RequiresPermissions("system:robotproject:view")
    @GetMapping()
    public String robotproject()
    {
        return prefix + "/robotproject";
    }
    
    @GetMapping("/approval/{id}")
    public String approval(@PathVariable("id") Long id, ModelMap mmap)
    {
    	Robotproject robotproject = robotprojectService.selectRobotprojectById(id);
        mmap.put("robotproject", robotproject);
    	return prefix + "/approval";
    }
    @GetMapping("/approval3/{id}")
    public String approval3(@PathVariable("id") Long id, ModelMap mmap)
    {
    	Robotproject robotproject = robotprojectService.selectRobotprojectById(id);
        mmap.put("robotproject", robotproject);
    	return prefix + "/approval3";
    }
    @GetMapping("/approval4/{id}")
    public String approval4(@PathVariable("id") Long id, ModelMap mmap)
    {
    	Robotproject robotproject = robotprojectService.selectRobotprojectById(id);
        mmap.put("robotproject", robotproject);
    	return prefix + "/approval4";
    }
    
    @GetMapping("/count")
    public String count()
    {
        return prefix + "/count";
    }
    
    @GetMapping("/selectcount")
    @ResponseBody
    public List<Robotproject> selectcount()
    {
    	List<Robotproject> list = robotprojectService.selectCount();
        return list;
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:robotproject:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Robotproject robotproject)
    {
        startPage();
        List<Robotproject> list = robotprojectService.selectRobotprojectList(robotproject);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:robotproject:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Robotproject robotproject)
    {
        List<Robotproject> list = robotprojectService.selectRobotprojectList(robotproject);
        ExcelUtil<Robotproject> util = new ExcelUtil<Robotproject>(Robotproject.class);
        return util.exportExcel(list, "robotproject");
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
    @RequiresPermissions("system:robotproject:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Robotproject robotproject)
    {
        return toAjax(robotprojectService.insertRobotproject(robotproject));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Robotproject robotproject = robotprojectService.selectRobotprojectById(id);
        mmap.put("robotproject", robotproject);
        return prefix + "/edit";
    }
    
    /**
     * 项目文档修改
     */
    @GetMapping("/projectfile/{id}")
    public String projectfile(@PathVariable("id") Long id, ModelMap mmap)
    {
        Robotproject robotproject = robotprojectService.selectRobotprojectById(id);
        mmap.put("projectfile", robotproject);
        return prefix + "/projectfile";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:robotproject:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Robotproject robotproject)
    {
        return toAjax(robotprojectService.updateRobotproject(robotproject));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:robotproject:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(robotprojectService.deleteRobotprojectByIds(ids));
    }
}
