package com.qyx.domain;

import java.io.Serializable;
import java.util.List;

/**
 * @Author Lv5电击
 * @Date 2020-05-16 20:21
 */
public class BlogCategory implements Serializable {
	private Integer cId;
	private String cName;
	private List<BlogPost> blogPosts;

	public Integer getcId() {
		return cId;
	}

	public void setcId(Integer cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public List<BlogPost> getBlogPosts() {
		return blogPosts;
	}

	public void setBlogPosts(List<BlogPost> blogPosts) {
		this.blogPosts = blogPosts;
	}

	@Override
	public String toString() {
		return "{" +
				"cId:" + cId +
				", cName:'" + cName + '\'' +
				", blogPosts:" + blogPosts +
				'}';
	}
}
