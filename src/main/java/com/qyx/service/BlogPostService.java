package com.qyx.service;

import com.qyx.domain.BlogPost;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author Lv5电击
 * @Date 2020-04-12 15:14
 */
public interface BlogPostService {
	List<BlogPost> findAllPost();

	List<BlogPost> findPostByCategory(Integer cId, Integer page);

	Integer findPostByCategoryCount(Integer cId);

	int savePost(BlogPost blogPost);

	void deletePost(Integer id);

	void updateAutoIncrement(Integer id);
}
