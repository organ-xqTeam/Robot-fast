package com.ruoyi.share.controller;

import java.util.Date;
import java.util.List;
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

import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.share.domain.RobotNeedSubmit;
import com.ruoyi.share.service.IRobotNeedSubmitService;
import com.ruoyi.share.util.Result;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 需求信息Controller
 * 
 * @author ruoyi
 * @date 2020-01-02
 */
@Controller
@RequestMapping("/share/RobotNeedSubmit")
public class RobotNeedSubmitController extends BaseController
{
    private String prefix = "share/RobotNeedSubmit";

    @Autowired
    private IRobotNeedSubmitService robotNeedSubmitService;
    
    
    //提交需求信息接口
    @RequestMapping("/submitRobotNeed")
    @ResponseBody
    public  Result submitRobotNeed(@RequestBody RobotNeedSubmit robotNeedSubmit ) {
    	/* private Long id;
    	    @Excel(name = "设备名称")
    	    private String name;
    	    @Excel(name = "截止时间", width = 30, dateFormat = "yyyy-MM-dd")
    	    private Date endDate endDateStr;
    	    @Excel(name = "设备型号")
    	    private String modelNumber ;
    	    @Excel(name = "预算")
    	    private String budgetMoney;
    	    @Excel(name = "其他说明")
    	    private String contentInfo;

    	    @Excel(name = "图片路径或id")
    	    private String picpath;
    	    
    	    */
    	robotNeedSubmitService.insertRobotNeedSubmit(robotNeedSubmit);
    	return  Result.success(true);
    }

    @RequiresPermissions("share:RobotNeedSubmit:view")
    @GetMapping()
    public String RobotNeedSubmit()
    {
        return prefix + "/RobotNeedSubmit";
    }

    /**
     * 查询需求信息列表
     */
    @RequiresPermissions("share:RobotNeedSubmit:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(RobotNeedSubmit robotNeedSubmit)
    {
        startPage();
        List<RobotNeedSubmit> list = robotNeedSubmitService.selectRobotNeedSubmitList(robotNeedSubmit);
        return getDataTable(list);
    }

    /**
     * 导出需求信息列表
     */
    @RequiresPermissions("share:RobotNeedSubmit:export")
    @Log(title = "需求信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(RobotNeedSubmit robotNeedSubmit)
    {
        List<RobotNeedSubmit> list = robotNeedSubmitService.selectRobotNeedSubmitList(robotNeedSubmit);
        ExcelUtil<RobotNeedSubmit> util = new ExcelUtil<RobotNeedSubmit>(RobotNeedSubmit.class);
        return util.exportExcel(list, "RobotNeedSubmit");
    }

    /**
     * 新增需求信息
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存需求信息
     */
    @RequiresPermissions("share:RobotNeedSubmit:add")
    @Log(title = "需求信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(RobotNeedSubmit robotNeedSubmit)
    {
        return toAjax(robotNeedSubmitService.insertRobotNeedSubmit(robotNeedSubmit));
    }

    /**
     * 修改需求信息
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        RobotNeedSubmit robotNeedSubmit = robotNeedSubmitService.selectRobotNeedSubmitById(id);
        mmap.put("robotNeedSubmit", robotNeedSubmit);
        return prefix + "/edit";
    }

    /**
     * 修改保存需求信息
     */
    @RequiresPermissions("share:RobotNeedSubmit:edit")
    @Log(title = "需求信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(RobotNeedSubmit robotNeedSubmit)
    {
        return toAjax(robotNeedSubmitService.updateRobotNeedSubmit(robotNeedSubmit));
    }

    /**
     * 删除需求信息
     */
    @RequiresPermissions("share:RobotNeedSubmit:remove")
    @Log(title = "需求信息", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(robotNeedSubmitService.deleteRobotNeedSubmitByIds(ids));
    }
}
