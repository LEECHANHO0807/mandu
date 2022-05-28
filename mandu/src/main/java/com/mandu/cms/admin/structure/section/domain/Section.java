package com.mandu.cms.admin.structure.section.domain;

import java.io.Serializable;

import com.mandu.cms.admin.common.domain.BoardExtension;


public class Section extends BoardExtension implements Serializable {
	
	
	private static final long serialVersionUID = -259695936292899527L;
	
	
	
	
	/**
	 * 부분_상단(헤더)
	 */
	private String sectionHeader;
	
	/**
	 * 부분_하단(푸터)
	 */
	private String sectionFooter;
	
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
	
	
	public String getSectionHeader() {
		return sectionHeader;
	}

	public void setSectionHeader(String sectionHeader) {
		this.sectionHeader = sectionHeader;
	}

	public String getSectionFooter() {
		return sectionFooter;
	}

	public void setSectionFooter(String sectionFooter) {
		this.sectionFooter = sectionFooter;
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
