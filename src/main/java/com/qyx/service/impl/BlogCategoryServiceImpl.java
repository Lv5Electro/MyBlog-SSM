package com.qyx.service.impl;

import com.qyx.dao.BlogCategoryDao;
import com.qyx.domain.BlogCategory;
import com.qyx.service.BlogCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Lv5电击
 * @Date 2020-05-16 20:26
 */
@Service("blogCategoryService")
public class BlogCategoryServiceImpl implements BlogCategoryService {

	@Autowired
	private BlogCategoryDao blogCategoryDao;

	@Override
	public List<BlogCategory> findAllCategory() {
		return blogCategoryDao.findAllCategory();
	}

	@Override
	public int saveCategory(BlogCategory blogCategory) {
		return blogCategoryDao.saveCategory(blogCategory);
	}

	@Override
	public void deleteCategory(Integer id) {
		blogCategoryDao.deleteCategory(id);
	}
}
