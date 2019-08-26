package com.yc.shmarket.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yc.shmarket.biz.CommoditiesBiz;

@Controller
public class CommoditiesController {

	@Resource
	private CommoditiesBiz cBiz;
	
	@RequestMapping("/toIndex")
	public String toIndex(Model model){
		model.addAttribute("commodList", cBiz.queryAll());
		return "index";
	}
}
