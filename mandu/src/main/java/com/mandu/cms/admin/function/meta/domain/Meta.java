package com.mandu.cms.admin.function.meta.domain;

import java.io.Serializable;

import com.mandu.cms.admin.common.domain.BoardExtension;


public class Meta extends BoardExtension implements Serializable {
	
	
	private static final long serialVersionUID = 4466120478633968129L;
	
	
	/**
	 * 메타_제목
	 */
	private String metaTitle;
	
	/**
	 * 메타_이름 (Author)
	 */
	private String metaAuthor;
	
	/**
	 * 메타_키워드(Keywords)
	 */
	private String metaKeywords;
	
	/**
	 * 메타_설명 (og:description)
	 */
	private String metaDescription;
	
	/**
	 * 메타_URL (og:url)
	 */
	private String metaUrl;
	
	
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
	

	public String getMetaTitle() {
		return metaTitle;
	}

	public void setMetaTitle(String metaTitle) {
		this.metaTitle = metaTitle;
	}

	public String getMetaAuthor() {
		return metaAuthor;
	}

	public void setMetaAuthor(String metaAuthor) {
		this.metaAuthor = metaAuthor;
	}

	public String getMetaKeywords() {
		return metaKeywords;
	}

	public void setMetaKeywords(String metaKeywords) {
		this.metaKeywords = metaKeywords;
	}

	public String getMetaDescription() {
		return metaDescription;
	}

	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

	public String getMetaUrl() {
		return metaUrl;
	}

	public void setMetaUrl(String metaUrl) {
		this.metaUrl = metaUrl;
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