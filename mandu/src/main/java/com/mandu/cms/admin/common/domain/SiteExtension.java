package com.mandu.cms.admin.common.domain;

import java.io.Serializable;


public class SiteExtension implements Serializable {
	
	
	private static final long serialVersionUID = -6551701967939151174L;
	
	
	/**
	 * 회원 코드
	 */
	private String siteManagerCode;
	
	
	/**
	 * 회원 종류 코드
	 */
	private String siteManagerTypeCode;
	
	/**
	 * 회원 종류 제목
	 */
	private String siteManagerTypeTitle;
	
	/**
	 * 회원 종류 설명
	 */
	private String siteManagerTypeDescription;
	
	/**
	 * 권한 관리자 ID
	 */
	private String authManagerId;
	
	/**
	 * 권한 관리자 코드
	 */
	private String authManagerCode;
	
	/**
	 * 권한 관리자 이름
	 */
	private String authManagerName;
	
	/**
	 * 사이트 코드
	 */
	private String siteCode;
	
	/**
	 * 사이트 제목
	 */
	private String siteTitle;
	
	/**
	 * 사이트 설명 
	 */
	private String siteDescription;
	
	
	public String getSiteManagerCode() {
		return siteManagerCode;
	}

	public void setSiteManagerCode(String siteManagerCode) {
		this.siteManagerCode = siteManagerCode;
	}

	public String getSiteManagerTypeCode() {
		return siteManagerTypeCode;
	}

	public void setSiteManagerTypeCode(String siteManagerTypeCode) {
		this.siteManagerTypeCode = siteManagerTypeCode;
	}

	public String getSiteManagerTypeTitle() {
		return siteManagerTypeTitle;
	}

	public void setSiteManagerTypeTitle(String siteManagerTypeTitle) {
		this.siteManagerTypeTitle = siteManagerTypeTitle;
	}

	public String getSiteManagerTypeDescription() {
		return siteManagerTypeDescription;
	}

	public void setSiteManagerTypeDescription(String siteManagerTypeDescription) {
		this.siteManagerTypeDescription = siteManagerTypeDescription;
	}

	public String getAuthManagerId() {
		return authManagerId;
	}

	public void setAuthManagerId(String authManagerId) {
		this.authManagerId = authManagerId;
	}

	public String getAuthManagerCode() {
		return authManagerCode;
	}

	public void setAuthManagerCode(String authManagerCode) {
		this.authManagerCode = authManagerCode;
	}

	public String getAuthManagerName() {
		return authManagerName;
	}

	public void setAuthManagerName(String authManagerName) {
		this.authManagerName = authManagerName;
	}

	public String getSiteCode() {
		return siteCode;
	}

	public void setSiteCode(String siteCode) {
		this.siteCode = siteCode;
	}

	public String getSiteTitle() {
		return siteTitle;
	}

	public void setSiteTitle(String siteTitle) {
		this.siteTitle = siteTitle;
	}

	public String getSiteDescription() {
		return siteDescription;
	}

	public void setSiteDescription(String siteDescription) {
		this.siteDescription = siteDescription;
	}
	
	
}