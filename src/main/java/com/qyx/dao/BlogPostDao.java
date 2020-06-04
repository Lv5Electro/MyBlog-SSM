package com.qyx.dao;

import com.qyx.domain.BlogPost;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author Lv5电击
 * @Date 2020-04-12 15:12
 */
public interface BlogPostDao {

	List<BlogPost> findAllPost();

	List<BlogPost> findPostByCategory(@Param("cId") Integer cId,@Param("page") Integer page);

	Integer findPostByCategoryCount(@Param("cId") Integer cId);

	int savePost(BlogPost blogPost);

	void deletePost(Integer id);

	void updateAutoIncrement(Integer id);
}
