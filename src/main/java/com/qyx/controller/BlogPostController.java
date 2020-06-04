package com.qyx.controller;

import com.alibaba.fastjson.JSONObject;
import com.qyx.domain.BlogPost;
import com.qyx.service.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author Lv5电击
 * @Date 2020-04-12 15:12
 */
@RequestMapping("/blogPost")
// 包括了ResponseBody和Controller
@RestController
public class BlogPostController {

	@Autowired
	private BlogPostService blogPostService;


	@RequestMapping("/savePost")
	public BlogPost savePost(@RequestBody BlogPost blogPost) {
		int id = blogPostService.savePost(blogPost);
		System.out.println(blogPost.getpId());
		return blogPost;
	}


	@RequestMapping("/deletePost")
	public String deletePost(@RequestParam("id") Integer id) {
		blogPostService.deletePost(id);
		return "";
	}

	@RequestMapping(value = "/findAllPost", produces = "application/json; charset=utf-8", method = RequestMethod.GET)
	public String findAllPost() {
		List<BlogPost> blogPosts = blogPostService.findAllPost();
		System.out.println(blogPosts);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("blogPosts", blogPosts);
		String rs = jsonObject.toJSONString();
		return rs;
	}

	@RequestMapping(value = "/findPostByCategory", produces = "application/json; charset=utf-8", method = RequestMethod.GET)
	public String findPostByCategory(Integer cId, Integer page) {
		List<BlogPost> blogPosts = blogPostService.findPostByCategory(cId, page);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("blogPosts", blogPosts);
		String rs = jsonObject.toJSONString();
		return rs;
	}

	@RequestMapping(value = "/findPostByCategoryCount", produces = "application/json; charset=utf-8", method = RequestMethod.GET)
	public String findPostByCategoryCount(Integer cId) {
		Integer count = blogPostService.findPostByCategoryCount(cId);
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("count", count);
		String rs = jsonObject.toJSONString();
		return rs;
	}

}
