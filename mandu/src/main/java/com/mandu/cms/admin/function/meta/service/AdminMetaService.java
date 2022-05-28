package com.mandu.cms.admin.function.meta.service;

import javax.servlet.http.HttpServletRequest;

import com.mandu.cms.admin.function.meta.domain.Meta;


public interface AdminMetaService {
	
	
	// 메타 확인
	boolean metaCheck(Meta meta);
	
	
	// 메타 읽기
	Meta metaRead();
	
	
	// 메타 등록
	boolean metaCreate(Meta meta);	
	
	
	// 메타 등록
	boolean metaCreate(Meta meta, HttpServletRequest httpServletRequest);
	
	
	// 메타 읽기
	Meta metaRead(Meta meta);
	
	
	// 메타 수정
	boolean metaUpdate(Meta meta);
	
	
	// 메타 수정
	boolean metaUpdate(Meta meta, HttpServletRequest httpServletRequest);
	
	
}