package com.qyx.controller;

import com.alibaba.fastjson.JSONObject;
import com.qyx.domain.BlogCategory;
import com.qyx.service.BlogCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author Lv5电击
 * @Date 2020-04-12 15:12
 */
@Controller
@RequestMapping("/blogCategory")
@ResponseBody
public class BlogCategoryController {

	@Autowired
	private BlogCategoryService blogCategoryService;


	@RequestMapping("/saveCategory")
	public BlogCategory saveCategory(@RequestBody BlogCategory blogCategory) {
		int id = blogCategoryService.saveCategory(blogCategory);
		System.out.println(blogCategory.getcId());
		return blogCategory;
	}

	// produces:指定返回类型
	@RequestMapping(value = "/findAllCategory", produces = "application/json; charset=utf-8", method = RequestMethod.GET)
	public String findAllCategory() {
		System.out.println("调用了findAllCategory");
		List<BlogCategory> blogCategories = blogCategoryService.findAllCategory();
		for (BlogCategory blogCategory : blogCategories) {
			System.out.println(blogCategory);
		}
		if (blogCategories.size() == 0) {
			System.out.println("数据为空或者查询失败");
			return "";
		}
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("blogCategories", blogCategories);
		String rs = jsonObject.toJSONString();
		return rs;
	}
}
