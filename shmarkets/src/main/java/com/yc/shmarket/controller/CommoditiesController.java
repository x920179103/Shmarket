package com.yc.shmarket.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.yc.shmarket.biz.CommoditiesBiz;
import com.yc.shmarket.biz.TypeBiz;
import com.yc.shmarket.pojo.Commodities;
import com.yc.shmarket.pojo.Type;
import com.yc.shmarket.util.Result;

@Controller
public class CommoditiesController {

	@Resource
	private CommoditiesBiz cBiz;
	@Resource
	private TypeBiz tBiz;

	// 分类。执行所有代码前执行，并且将返回值放入Model
	@ModelAttribute("typeList")
	public List<Type> init() {
		return tBiz.queryAllType();
	}

	@RequestMapping("/toIndex")
	public String toIndex(@RequestParam(defaultValue = "1") int page, Model model) {
		model.addAttribute("commodities", new Commodities());
		model.addAttribute("result", cBiz.queryAll(page));// 商品列表
		return "index";
	}

	@GetMapping("/hotWords")
	@ResponseBody
	public List<Commodities> hotWords(Commodities cmod) {
		return cBiz.hotWords(cmod);
	}

	@RequestMapping("/search")
	@ResponseBody
	public Result search(@RequestParam(defaultValue = "1") int page, Model model, Commodities cmod) {
		System.out.println("====名称：" + cmod.getCname() + "=====id：" + cmod.getTid());
		if (cmod.getCname() != null && cmod.getCname() != "") {
			return cBiz.search(page, cmod);// 商品列表
		} else {
			return cBiz.queryAll(page);
		}
	}
}
