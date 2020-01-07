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
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.share.domain.RobotShareType;
import com.ruoyi.share.service.IRobotShareTypeService;
import com.ruoyi.share.util.Result;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 共享类型Controller
 * 
 * @author ruoyi
 * @date 2020-01-03
 */
@Controller
@RequestMapping("/share/RobotShareType")
public class RobotShareTypeController extends BaseController
{
    private String prefix = "share/RobotShareType";

    @Autowired
    private IRobotShareTypeService robotShareTypeService;

    @RequiresPermissions("share:RobotShareType:view")
    @GetMapping()
    public String RobotShareType()
    {
        return prefix + "/RobotShareType";
    }
    
    //通过type的;类型获取type集合
    
    public Result getRobotShareTypeByTypeId(@RequestBody Map<String, Object> requestParams) {
    	Map<String, Object> parmMap = new HashMap<String, Object>();
    	RobotShareType robotShareType =new RobotShareType();
    	Object typeObj= requestParams.get("type");
    	if(typeObj!=null) {
    		robotShareType.setType(typeObj.toString());
    		
    	}
    	List<RobotShareType> robotShareTypeList= robotShareTypeService.selectRobotShareTypeList(robotShareType);
    	parmMap.put("robotShareTypeList", robotShareTypeList);
    	
    	return Result.success(parmMap);
    }

    /**
     * 查询共享类型列表
     */
    @RequiresPermissions("share:RobotShareType:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(RobotShareType robotShareType)
    {
        startPage();
        List<RobotShareType> list = robotShareTypeService.selectRobotShareTypeList(robotShareType);
        return getDataTable(list);
    }

    /**
     * 导出共享类型列表
     */
    @RequiresPermissions("share:RobotShareType:export")
    @Log(title = "共享类型", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(RobotShareType robotShareType)
    {
        List<RobotShareType> list = robotShareTypeService.selectRobotShareTypeList(robotShareType);
        ExcelUtil<RobotShareType> util = new ExcelUtil<RobotShareType>(RobotShareType.class);
        return util.exportExcel(list, "RobotShareType");
    }

    /**
     * 新增共享类型
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存共享类型
     */
    @RequiresPermissions("share:RobotShareType:add")
    @Log(title = "共享类型", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(RobotShareType robotShareType)
    {
        return toAjax(robotShareTypeService.insertRobotShareType(robotShareType));
    }

    /**
     * 修改共享类型
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        RobotShareType robotShareType = robotShareTypeService.selectRobotShareTypeById(id);
        mmap.put("robotShareType", robotShareType);
        return prefix + "/edit";
    }

    /**
     * 修改保存共享类型
     */
    @RequiresPermissions("share:RobotShareType:edit")
    @Log(title = "共享类型", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(RobotShareType robotShareType)
    {
        return toAjax(robotShareTypeService.updateRobotShareType(robotShareType));
    }

    /**
     * 删除共享类型
     */
    @RequiresPermissions("share:RobotShareType:remove")
    @Log(title = "共享类型", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(robotShareTypeService.deleteRobotShareTypeByIds(ids));
    }
}
