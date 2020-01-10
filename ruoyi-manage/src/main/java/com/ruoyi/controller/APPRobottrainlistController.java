package com.ruoyi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.domain.Robottraincurriculum;
import com.ruoyi.domain.Robottrainlist;
import com.ruoyi.service.IRobottraincurriculumService;
import com.ruoyi.service.IRobottrainlistService;

@CrossOrigin
@Controller
@RequestMapping("/ajax/app/appRobotTrainList")
public class APPRobottrainlistController extends BaseController {

    @Autowired
    private IRobottrainlistService robottrainlistService;
    
    @Autowired
    private IRobottraincurriculumService robottraincurriculumService;

    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(int pageNum, int pageSize)
    {
    	Robottrainlist trian = new Robottrainlist();
    	PageHelper.startPage(pageNum, pageSize, null);
        List<Robottrainlist> list = robottrainlistService.selectRobottrainlistList(trian);
        return getDataTable(list);
    }
    
    @PostMapping("/curriculumlist")
    @ResponseBody
    public TableDataInfo curriculumlist(int pageNum, int pageSize)
    {
    	Robottraincurriculum curriculum = new Robottraincurriculum();
    	PageHelper.startPage(pageNum, pageSize, null);
        List<Robottraincurriculum> list = robottraincurriculumService.selectRobottraincurriculumList(curriculum);
        return getDataTable(list);
    }
    
}
