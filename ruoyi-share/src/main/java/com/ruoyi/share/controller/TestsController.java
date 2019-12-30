package com.ruoyi.share.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@CrossOrigin
@Controller
@RequestMapping("/ajax/test")
public class TestsController {
	private String prefix =  "share/test";
	private String prefixs = "monitor/job";
	//学生作业打卡接口

		@RequestMapping(value = "/test")
		public String  daka() {
			return prefix + "/add";
		}

}
