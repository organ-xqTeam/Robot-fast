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
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.domain.Robottraincurriculum;
import com.ruoyi.service.IRobottraincurriculumService;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2020-01-08
 */
@Controller
@RequestMapping("/system/robottraincurriculum")
public class RobottraincurriculumController extends BaseController
{
    private String prefix = "system/robottraincurriculum";

    @Autowired
    private IRobottraincurriculumService robottraincurriculumService;

    @RequiresPermissions("system:robottraincurriculum:view")
    @GetMapping()
    public String robottraincurriculum()
    {
        return prefix + "/robottraincurriculum";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:robottraincurriculum:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Robottraincurriculum robottraincurriculum)
    {
        startPage();
        List<Robottraincurriculum> list = robottraincurriculumService.selectRobottraincurriculumList(robottraincurriculum);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:robottraincurriculum:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Robottraincurriculum robottraincurriculum)
    {
        List<Robottraincurriculum> list = robottraincurriculumService.selectRobottraincurriculumList(robottraincurriculum);
        ExcelUtil<Robottraincurriculum> util = new ExcelUtil<Robottraincurriculum>(Robottraincurriculum.class);
        return util.exportExcel(list, "robottraincurriculum");
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
    @RequiresPermissions("system:robottraincurriculum:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Robottraincurriculum robottraincurriculum)
    {
        return toAjax(robottraincurriculumService.insertRobottraincurriculum(robottraincurriculum));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Robottraincurriculum robottraincurriculum = robottraincurriculumService.selectRobottraincurriculumById(id);
        mmap.put("robottraincurriculum", robottraincurriculum);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("system:robottraincurriculum:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Robottraincurriculum robottraincurriculum)
    {
        return toAjax(robottraincurriculumService.updateRobottraincurriculum(robottraincurriculum));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:robottraincurriculum:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(robottraincurriculumService.deleteRobottraincurriculumByIds(ids));
    }
}
