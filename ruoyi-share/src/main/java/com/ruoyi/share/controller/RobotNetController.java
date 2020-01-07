package com.ruoyi.share.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.share.domain.RobotDevice;
import com.ruoyi.share.domain.RobotDeviceApply;
import com.ruoyi.share.domain.RobotDeviceneed;
import com.ruoyi.share.domain.RobotNeedSubmit;
import com.ruoyi.share.domain.RobotShareInformation;
import com.ruoyi.share.domain.RobotSharePic;
import com.ruoyi.share.domain.RobotShareType;
import com.ruoyi.share.service.IRobotDeviceApplyService;
import com.ruoyi.share.service.IRobotDeviceService;
import com.ruoyi.share.service.IRobotDeviceneedService;
import com.ruoyi.share.service.IRobotNeedSubmitService;
import com.ruoyi.share.service.IRobotShareInformationService;
import com.ruoyi.share.service.IRobotSharePicService;
import com.ruoyi.share.service.IRobotShareTypeService;
import com.ruoyi.share.util.Result;

@Controller
@CrossOrigin
@RequestMapping("/ajax/share/RobotNet")
public class RobotNetController extends BaseController {
	@Autowired
	private IRobotDeviceApplyService robotDeviceApplyService;
	@Autowired
	private IRobotDeviceService robotDeviceService;
	@Autowired
	private IRobotDeviceneedService robotDeviceneedService;
	@Autowired
	private IRobotNeedSubmitService robotNeedSubmitService;
	@Autowired
	private IRobotShareTypeService robotShareTypeService;
	@Autowired
	private IRobotSharePicService robotSharePicService;
	
    @Autowired
    private IRobotShareInformationService robotShareInformationService;
    
    //得到共享资讯详情通过id
    @RequestMapping("/getRobotShareInformationById")
   	@ResponseBody
   	public Result getRobotShareInformationById(@RequestBody Map<String, Object> requestParams) {
    	Map<String, Object> parmMap = new HashMap<String, Object>();
    	String id= requestParams.get("id").toString();
    	RobotShareInformation robotShareInformation=   robotShareInformationService.selectRobotShareInformationById(Long.valueOf(id) );
    	parmMap.put("robotShareInformation", robotShareInformation);
    	return Result.success(parmMap);
    }
	//首页start
	//得到共享首页的共享资讯的轮播图等信息
    @RequestMapping("/getRobotShareInformationList")
	@ResponseBody
	public TableDataInfo getRobotShareInformationList(@RequestBody Map<String, Object> requestParams) {
		Object pageNum = requestParams.get("pageNum");
		Object pageSize = requestParams.get("pageSize");
		// RobotDevice robotDevice
		// startPage();
		PageHelper.startPage(Integer.valueOf(pageNum.toString()), Integer.valueOf(pageSize.toString()));
		RobotShareInformation robotShareInformation =new RobotShareInformation();
	 	List<RobotShareInformation > list= robotShareInformationService.selectRobotShareInformationList(robotShareInformation);
	 	return getDataTable(list);
	}
	//最新需求
	@RequestMapping("/getNewDeviceneedList")
	@ResponseBody
	public  TableDataInfo getNewDeviceneedList(@RequestBody Map<String, Object> requestParams) {
		RobotDeviceneed robotDeviceneed =new RobotDeviceneed();
		Object pageNum = requestParams.get("pageNum");
		Object pageSize = requestParams.get("pageSize");
		Object name = requestParams.get("name");
		Object type = requestParams.get("type");
		PageHelper.startPage(Integer.valueOf(pageNum.toString()), Integer.valueOf(pageSize.toString()));
		if(name!=null) {
			robotDeviceneed.setName(name.toString());
		}
		if(type!=null) {
			robotDeviceneed.setType(type.toString());;
		}
		List<RobotDeviceneed> list =robotDeviceneedService.selectRobotDeviceneedList(robotDeviceneed);
		return getDataTable(list);
	}
	
	//热门设备
	@RequestMapping("/getHotDeviceList")
	@ResponseBody
	public  TableDataInfo getHotDeviceList(@RequestBody Map<String, Object> requestParams) {
		RobotDevice robotDevice =new RobotDevice();
		Object pageNum = requestParams.get("pageNum");
		Object pageSize = requestParams.get("pageSize");
		Object name = requestParams.get("name");
		Object type = requestParams.get("type");
		PageHelper.startPage(Integer.valueOf(pageNum.toString()), Integer.valueOf(pageSize.toString()));
		if(name!=null) {
			robotDevice.setName(name.toString());
		}
		if(type!=null) {
			robotDevice.setType(type.toString());;
		}
		List<RobotDevice> list= robotDeviceService.selectRobotDeviceList(robotDevice);
		return getDataTable(list);
	}
	
	
	//得到共享首页轮播图
	@RequestMapping("/getrobotSharePicList")
	@ResponseBody
	public TableDataInfo getrobotSharePicList(@RequestBody Map<String, Object> requestParams) {
		Object pageNum = requestParams.get("pageNum");
		Object pageSize = requestParams.get("pageSize");
		// RobotDevice robotDevice
		// startPage();
		PageHelper.startPage(Integer.valueOf(pageNum.toString()), Integer.valueOf(pageSize.toString()));
		RobotSharePic robotSharePic =new RobotSharePic();
		List<RobotSharePic> list = robotSharePicService.selectRobotSharePicList(robotSharePic);
		return getDataTable(list);
	}
	
	// 通过type的;类型获取type集合
	@RequestMapping("/getRobotShareTypeByTypeId")
	@ResponseBody
	public Result getRobotShareTypeByTypeId(@RequestBody Map<String, Object> requestParams) {
		Map<String, Object> parmMap = new HashMap<String, Object>();
		RobotShareType robotShareType = new RobotShareType();
		Object typeObj = requestParams.get("type");
		if (typeObj != null) {
			robotShareType.setType(typeObj.toString());

		}
		List<RobotShareType> robotShareTypeList = robotShareTypeService.selectRobotShareTypeList(robotShareType);
		parmMap.put("robotShareTypeList", robotShareTypeList);

		return Result.success(parmMap);
	}
	
	//首页 end

	// 提交设备申请接口
	@RequestMapping("/tijiaoRobotDeviceApply")
	@ResponseBody
	public Result tijiaoRobotDeviceApply(@RequestBody RobotDeviceApply robotDeviceApply) {
		/*
		 * @Excel(name = "申请名称") private String applyName;
		 * 
		 * private String companyInfo;
		 * 
		 * @Excel(name = "联系电话") private String phone;
		 * 
		 * @Excel(name = "其他说明") private String explainContent;
		 * 
		 * @Excel(name = "申请表的id") private Long deviceId;
		 * 
		 * @Excel(name = "用户id") private Long userId;
		 */
		robotDeviceApplyService.insertRobotDeviceApply(robotDeviceApply);
		return Result.success(true);
	}

	// 设备详情接口
	@RequestMapping("/shareShowDetail")
	@ResponseBody
	public Result shareShowDetail(@RequestBody Map<String, Object> requestParams) {
		Map<String, Object> parmMap = new HashMap<String, Object>();
		String id = requestParams.get("id").toString();
		RobotDevice robotDevice = robotDeviceService.selectRobotDeviceById(Long.valueOf(id));
		parmMap.put("robotDevice", robotDevice);
		return Result.success(parmMap);
	}

	// 展示主页的接口
	@RequestMapping("/shareShow")
	@ResponseBody
	public TableDataInfo shareShow(@RequestBody Map<String, Object> requestParams) {
		Object name = requestParams.get("name");
		Object type = requestParams.get("type");
		Object brand = requestParams.get("brand");
		Object model = requestParams.get("model");
		Object area = requestParams.get("area");
		Object pageNum = requestParams.get("pageNum");
		Object pageSize = requestParams.get("pageSize");
		// RobotDevice robotDevice
		// startPage();
		PageHelper.startPage(Integer.valueOf(pageNum.toString()), Integer.valueOf(pageSize.toString()));
		RobotDevice robotDevice = new RobotDevice();
		if (name != null) {
			robotDevice.setName(name.toString());
		}
		if (type != null) {
			robotDevice.setType(type.toString());
		}
		if (brand != null) {
			robotDevice.setBrand(brand.toString());
		}
		if (model != null) {
			robotDevice.setModel(model.toString());
		}
		if (area != null) {
			robotDevice.setArea(area.toString());

		}
		List<RobotDevice> list = robotDeviceService.selectRobotDeviceList(robotDevice);
		return getDataTable(list);
	}

	// 需求详情的展示
	@RequestMapping("/deviceneedXiangqingShow")
	@ResponseBody
	public Result deviceneedXiangqingShow(@RequestBody Map<String, Object> requestParams) {
		Map<String, Object> parmMap = new HashMap<String, Object>();
		String id = requestParams.get("id").toString();
		/*
		 * RobotDeviceneed robotDeviceneed =new RobotDeviceneed();
		 * robotDeviceneed.setId(Long.valueOf(id));
		 */
		RobotDeviceneed robotDeviceneed = robotDeviceneedService.selectRobotDeviceneedById(Long.valueOf(id));
		parmMap.put("robotDeviceneed", robotDeviceneed);
		return Result.success(parmMap);
		// return null;
	}

	// 展示需求列表接口
	@RequestMapping("/deviceneedShow")
	@ResponseBody
	public TableDataInfo deviceneedShow(@RequestBody Map<String, Object> requestParams) {
		Object name = requestParams.get("name");
		Object type = requestParams.get("type");
		Object brand = requestParams.get("brand");
		Object model = requestParams.get("model");
		Object area = requestParams.get("area");
		Object pageNum = requestParams.get("pageNum");
		Object pageSize = requestParams.get("pageSize");
		// RobotDevice robotDevice
		// startPage();
		PageHelper.startPage(Integer.valueOf(pageNum.toString()), Integer.valueOf(pageSize.toString()));
		RobotDeviceneed robotDeviceneed = new RobotDeviceneed();
		if (name != null) {
			robotDeviceneed.setName(name.toString());
		}
		if (type != null) {
			robotDeviceneed.setType(type.toString());
		}
		if (brand != null) {
			robotDeviceneed.setBrand(brand.toString());
		}
		if (model != null) {
			robotDeviceneed.setModel(model.toString());
		}
		if (area != null) {
			robotDeviceneed.setArea(area.toString());

		}
		List<RobotDeviceneed> list = robotDeviceneedService.selectRobotDeviceneedList(robotDeviceneed);
		return getDataTable(list);
	}

	// 提交需求信息接口
	@RequestMapping("/submitRobotNeed")
	@ResponseBody
	public Result submitRobotNeed(@RequestBody RobotNeedSubmit robotNeedSubmit) {
		/*
		 * private Long id;
		 * 
		 * @Excel(name = "设备名称") private String name;
		 * 
		 * @Excel(name = "截止时间", width = 30, dateFormat = "yyyy-MM-dd") private Date
		 * endDate endDateStr;
		 * 
		 * @Excel(name = "设备型号") private String modelNumber ;
		 * 
		 * @Excel(name = "预算") private String budgetMoney;
		 * 
		 * @Excel(name = "其他说明") private String contentInfo;
		 * 
		 * @Excel(name = "图片路径或id") private String picpath;
		 * 
		 */
		robotNeedSubmitService.insertRobotNeedSubmit(robotNeedSubmit);
		return Result.success(true);
	}

}
