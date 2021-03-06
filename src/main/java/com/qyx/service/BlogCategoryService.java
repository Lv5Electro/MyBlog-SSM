package com.qyx.service;

import com.qyx.domain.BlogCategory;

import java.util.List;

/**
 * @Author Lv5电击
 * @Date 2020-05-16 20:26
 */
public interface BlogCategoryService {
	List<BlogCategory> findAllCategory();

	int saveCategory(BlogCategory blogCategory);

	void deleteCategory(Integer id);
}
