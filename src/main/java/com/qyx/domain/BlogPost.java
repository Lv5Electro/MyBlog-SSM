package com.qyx.domain;

import java.io.Serializable;

/**
 * @Author Lv5电击
 * @Date 2020-04-12 15:13
 */
public class BlogPost implements Serializable {
	private Integer pId;
	private Integer cId;
	private String pTitle;
	private String pContent;
	private String pTime;


	public Integer getcId() {
		return cId;
	}

	public void setcId(Integer cId) {
		this.cId = cId;
	}

	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}

	public String getpTitle() {
		return pTitle;
	}

	public void setpTitle(String pTitle) {
		this.pTitle = pTitle;
	}

	public String getpContent() {
		return pContent;
	}

	public void setpContent(String pContent) {
		this.pContent = pContent;
	}

	public String getpTime() {
		return pTime;
	}

	public void setpTime(String pTime) {
		this.pTime = pTime;
	}

	@Override
	public String toString() {
		return "{" +
				"pId:" + pId +
				", cId:" + cId +
				", pTitle:'" + pTitle + '\'' +
				", pContent:'" + pContent + '\'' +
				", pTime:'" + pTime + '\'' +
				'}';
	}
}
