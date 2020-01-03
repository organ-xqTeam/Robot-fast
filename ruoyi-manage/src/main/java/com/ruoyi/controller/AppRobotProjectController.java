package com.ruoyi.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.github.pagehelper.PageHelper;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.domain.Robotcertification;
import com.ruoyi.domain.Robotproject;
import com.ruoyi.service.IRobotcertificationService;
import com.ruoyi.service.IRobotprojectService;

@CrossOrigin
@Controller
@RequestMapping("/ajax/app/appRobotProject")
public class AppRobotProjectController extends BaseController {

    @Autowired
    private IRobotprojectService robotprojectService;
    
    @Autowired
    private IRobotcertificationService robotcertificationService;
	
    //个人中心
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(int pageNum, int pageSize, String applyid)
    {
    	Robotproject robot = new Robotproject();
    	robot.setApplyid(applyid);
    	PageHelper.startPage(pageNum, pageSize, null);
        List<Robotproject> list = robotprojectService.selectRobotprojectList(robot);
        return getDataTable(list);
    }
    
    //页面
    @PostMapping("/certificationlist")
    @ResponseBody
    public TableDataInfo certificationlist(int pageNum, int pageSize, String type)
    {
    	Robotcertification certification = new Robotcertification();
    	certification.setType(type);
    	PageHelper.startPage(pageNum, pageSize, null);
        List<Robotcertification> list = robotcertificationService.selectRobotcertificationList(certification);
        return getDataTable(list);
    }
    
    //案例
    @PostMapping("/caselist")
    @ResponseBody
    public TableDataInfo caselist(int pageNum, int pageSize, String type)
    {
    	Robotproject robotProject = new Robotproject();
    	robotProject.setType1(type);
    	robotProject.setDeleteFlag("0");
    	robotProject.setApprovalstatus("2");
    	PageHelper.startPage(pageNum, pageSize, "approvaltime desc");
        List<Robotproject> list = robotprojectService.selectRobotprojectList(robotProject);
        return getDataTable(list);
    }
    
    //申请
    @PostMapping("/apply")
    @ResponseBody
    public AjaxResult apply(@RequestBody Robotproject robotproject)
    {
    	return toAjax(robotprojectService.insertRobotproject(robotproject));
    }
	
}
