package com.jshop.entity;

// Generated 2012-8-22 20:51:22 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * SiteNavigationT generated by hbm2java
 */
public class SiteNavigationT implements java.io.Serializable {

	private String snid;
	private String isTargetBlank;
	private String isVisible;
	private String name;
	private String position;
	private Date createtime;
	private String creatorid;
	private String htmlPath;
	private int sort;
	private String sign;

	public SiteNavigationT() {
	}

	public SiteNavigationT(String snid, String isTargetBlank, String isVisible,
			String name, String position, Date createtime, String creatorid,
			String htmlPath, int sort, String sign) {
		this.snid = snid;
		this.isTargetBlank = isTargetBlank;
		this.isVisible = isVisible;
		this.name = name;
		this.position = position;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.htmlPath = htmlPath;
		this.sort = sort;
		this.sign = sign;
	}

	public String getSnid() {
		return this.snid;
	}

	public void setSnid(String snid) {
		this.snid = snid;
	}

	public String getIsTargetBlank() {
		return this.isTargetBlank;
	}

	public void setIsTargetBlank(String isTargetBlank) {
		this.isTargetBlank = isTargetBlank;
	}

	public String getIsVisible() {
		return this.isVisible;
	}

	public void setIsVisible(String isVisible) {
		this.isVisible = isVisible;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	public String getHtmlPath() {
		return this.htmlPath;
	}

	public void setHtmlPath(String htmlPath) {
		this.htmlPath = htmlPath;
	}

	public int getSort() {
		return this.sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public String getSign() {
		return this.sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

}
