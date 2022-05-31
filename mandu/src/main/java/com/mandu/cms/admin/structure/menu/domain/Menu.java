package com.mandu.cms.admin.structure.menu.domain;

import java.io.Serializable;

import com.mandu.cms.admin.common.domain.BoardExtension;


public class Menu extends BoardExtension implements Serializable {
	

	private static final long serialVersionUID = -7745273234911570219L;

	
	/**
	 * 메뉴_번호
	 */
	private String menuNo;
	
	/**
	 * 상위_번호
	 */
	private String upperMenuNo;
	
	/**
	 * 종류 (BASE : 기반, BOARD : 게시판, CONTENTS : 컨텐츠, LINK : 링크 주소, CUSTOM : 사용자 정의)
	 */
	private String type;
	
	/**
	 * 참조_번호 (CMS_CONTENTS.CONTENTS_NO / CMS_BOARD_MANAGEMENT.BOARD_MANAGEMENT_NO)
	 */
	private String referenceNo;
	
	/**
	 * 링크_종류 (SELF : 현재 창, BLANK : 새 창)
	 */
	private String linkType;
	
	/**
	 * 링크_URL
	 */
	private String linkUrl;
	
	/**
	 * 사용자 정의_URL
	 */
	private String customUrl;
	
	/**
	 * 제목
	 */
	private String title;
	
	/**
	 * 설명
	 */
	private String description;
	
	/**
	 * 코드
	 */
	private String code;
	
	/**
	 * 경로
	 */
	private String path;
	
	/**
	 * 메뉴_레벨
	 */
	private String menuLevel;
	
	/**
	 * 순서_번호
	 */
	private String orderNo;
	
	/**
	 * 담당자
	 */
	private String master;
	
	/**
	 * 부_담당자
	 */
	private String subMaster;
	
	/**
	 * 검색_여부 (Y : 검색 허용, N : 검색 허용 안함)
	 */
	private String searchYn;
	
	/**
	 * 사용_여부 (Y : 사용, N : 사용 안 함)
	 */
	private String useYn;
	
	/**
	 * 사용_여부 (Y : 사용, N : 사용 안 함)
	 */
	private String openYn;
	
	/**
	 * 삭제_여부 (Y : 삭제, N : 삭제 안 됨)
	 */
	private String deleteYn;
	
	/**
	 * 작성_ID
	 */
	private String writeId;
	
	/**
	 * 작성_일자
	 */
	private String writeDate;
	
	/**
	 * 수정_ID
	 */
	private String updateId;
	
	/**
	 * 수정_일자
	 */
	private String updateDate;
	
	
	public String getMenuNo() {
		return menuNo;
	}

	public void setMenuNo(String menuNo) {
		this.menuNo = menuNo;
	}

	public String getUpperMenuNo() {
		return upperMenuNo;
	}

	public void setUpperMenuNo(String upperMenuNo) {
		this.upperMenuNo = upperMenuNo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getReferenceNo() {
		return referenceNo;
	}

	public void setReferenceNo(String referenceNo) {
		this.referenceNo = referenceNo;
	}

	public String getLinkType() {
		return linkType;
	}

	public void setLinkType(String linkType) {
		this.linkType = linkType;
	}

	public String getLinkUrl() {
		return linkUrl;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public String getCustomUrl() {
		return customUrl;
	}

	public void setCustomUrl(String customUrl) {
		this.customUrl = customUrl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getMenuLevel() {
		return menuLevel;
	}

	public void setMenuLevel(String menuLevel) {
		this.menuLevel = menuLevel;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getMaster() {
		return master;
	}

	public void setMaster(String master) {
		this.master = master;
	}

	public String getSubMaster() {
		return subMaster;
	}

	public void setSubMaster(String subMaster) {
		this.subMaster = subMaster;
	}

	public String getSearchYn() {
		return searchYn;
	}

	public void setSearchYn(String searchYn) {
		this.searchYn = searchYn;
	}

	public String getUseYn() {
		return useYn;
	}

	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}

	public String getOpenYn() {
		return openYn;
	}

	public void setOpenYn(String openYn) {
		this.openYn = openYn;
	}

	public String getDeleteYn() {
		return deleteYn;
	}

	public void setDeleteYn(String deleteYn) {
		this.deleteYn = deleteYn;
	}

	public String getWriteId() {
		return writeId;
	}

	public void setWriteId(String writeId) {
		this.writeId = writeId;
	}

	public String getWriteDate() {
		return writeDate;
	}

	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}

	public String getUpdateId() {
		return updateId;
	}

	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}
	
	
}