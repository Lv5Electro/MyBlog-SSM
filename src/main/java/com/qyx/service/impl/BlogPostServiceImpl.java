package com.qyx.service.impl;

import com.qyx.dao.BlogPostDao;
import com.qyx.domain.BlogPost;
import com.qyx.service.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Lv5电击
 * @Date 2020-04-12 15:14
 */
@Service("blogPostService")
public class BlogPostServiceImpl implements BlogPostService {

	@Autowired
	private BlogPostDao blogPostDao;

	@Override
	public List<BlogPost> findAllPost() {
		List<BlogPost> blogPosts = blogPostDao.findAllPost();
		return blogPosts;
	}

	@Override
	public List<BlogPost> findPostByCategory(Integer cId, Integer page) {
		List<BlogPost> blogPosts = blogPostDao.findPostByCategory(cId, page);
		return blogPosts;
	}

	@Override
	public Integer findPostByCategoryCount(Integer cId) {
		Integer count = blogPostDao.findPostByCategoryCount(cId);
		return count;
	}

	@Override
	public int savePost(BlogPost blogPost) {
		int id = blogPostDao.savePost(blogPost);
		return id;
	}

	@Override
	public void deletePost(Integer id) {
		blogPostDao.deletePost(id);
	}

	@Override
	public void updateAutoIncrement(Integer id) {
		blogPostDao.updateAutoIncrement(id);
	}

}
