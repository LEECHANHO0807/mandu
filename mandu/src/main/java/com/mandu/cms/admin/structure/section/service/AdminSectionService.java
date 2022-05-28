package com.mandu.cms.admin.structure.section.service;

import javax.servlet.http.HttpServletRequest;

import com.mandu.cms.admin.structure.section.domain.Section;


public interface AdminSectionService {
	
	
	// 부분 확인
	boolean sectionCheck(Section section);
	
	
	// 부분 읽기
	Section sectionRead();
	
	
	// 부분 등록
	boolean sectionCreate(Section section);	
	
	
	// 부분 등록
	boolean sectionCreate(Section section, HttpServletRequest httpServletRequest);
	
	
	// 부분 읽기
	Section sectionRead(Section section);
	
	
	// 부분 수정
	boolean sectionUpdate(Section section);
	
	
	// 부분 수정
	boolean sectionUpdate(Section section, HttpServletRequest httpServletRequest);
	

	// 부분 삭제
	boolean sectionDelete(Section section);
		
		
	// 부분 삭제
	boolean sectionDelete(Section section, HttpServletRequest httpServletRequest);

	
	// 부분 삭제
	boolean sectionDelete(String siteCode, HttpServletRequest httpServletRequest);
	
}
