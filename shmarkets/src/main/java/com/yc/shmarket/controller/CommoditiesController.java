package com.yc.shmarket.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.annotation.Resource;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.google.gson.Gson;
import com.yc.shmarket.biz.CommoditiesBiz;
import com.yc.shmarket.biz.TypeBiz;
import com.yc.shmarket.pojo.Commodities;
import com.yc.shmarket.pojo.Type;
import com.yc.shmarket.util.FileUtils;
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

	@RequestMapping("/toUploadItem")
	public String toUploadItem() {
		return "upload-item";
	}

	// 商品上架			(这样的写法有问题，img文件夹中会有冗余的图片)
	@RequestMapping("/multipleImageUpload")
	@ResponseBody
	public Result multipleImageUpload(@RequestParam("uploadFiles") MultipartFile[] files,Commodities cmod,HttpServletRequest request/* RedirectAttributes attributes*/) {
		System.out.println("========商品========="+cmod);
		System.out.println("上传的图片数：" + files.length);
		Result result = new Result(0,"商品上架失败！");
		StringBuffer cpic=new StringBuffer();
		for (MultipartFile file : files) { // 循环保存文件
			if (file.getSize() / 1000 > 100) {
				result.setCode(0);
				result.setMsg("图片大小不能超过100KB");
			} else {
				// 判断上传文件格式
				String fileType = file.getContentType();
				if (fileType.equals("image/jpeg") || fileType.equals("image/png") || fileType.equals("image/jpeg")) {
					// 要上传的目标文件存放的路径
					final String localPath = request.getServletContext().getRealPath("/")+"img";
					// 上传后保存的文件名(需要防止图片重名导致的文件覆盖)
					// 获取文件名
					String fileName = file.getOriginalFilename();
					// 获取文件后缀名
					String suffixName = fileName.substring(fileName.lastIndexOf("."));
					// 重新生成文件名
					fileName =System.currentTimeMillis() + "" + new Random().nextInt() + fileName+suffixName;
					if (FileUtils.upload(file, localPath, fileName)) {
						result.setCode(1);
						result.setMsg("图片上传成功");// 前端根据是否存在该字段来判断上传是否成功
						cpic.append(";"+fileName);
					} else {
						result.setCode(0);
						result.setMsg("图片上传失败");
						return result;
					}
				} else {
					result.setCode(0);
					result.setMsg("图片格式不正确");
					return result;
				}
			}
		}
		//String userName=(String) request.getSession().getAttribute("userName");需要知道是谁上传的uid
		cmod.setCpic(cpic.toString());
		cmod.setUid(1);
		cmod.setCupDate(new Date());
		result=cBiz.uploadCmod( cmod);
		/*model.addAttribute("result", result);*/
		System.out.println("=商品上架============"+result.getMsg());
		//attributes.addFlashAttribute("result", result);//能且只能在重定向的 “页面” 获取param参数值。其原理就是放到session中，session在跳到页面后马上移除对象。
		return result;
	}
	@RequestMapping("/result")
	public String toTest(){
		return "result";
	}
}
