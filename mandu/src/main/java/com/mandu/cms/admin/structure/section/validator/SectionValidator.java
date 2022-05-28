package com.mandu.cms.admin.structure.section.validator;


import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.mandu.cms.admin.structure.section.domain.Section;


@Component
public class SectionValidator implements Validator {
	
	
	@Override
	public boolean supports(Class<?> clazz) {
		
		return clazz.isAssignableFrom(Section.class);
	}
	

	@Override
	public void validate(Object target, Errors errors) {
		
		Section section = (Section) target;
		
		
		// 헤더
		if ( (section.getSectionHeader() != null && !section.getSectionHeader().equals("") ) && section.getSectionHeader().getBytes().length > 2000000) {
			errors.rejectValue("sectionHeader", "cms.error.overflow", new Object[] {section.getSectionHeader().getBytes().length, 2000000}, null);
		}
		
		// 푸터
		if ( (section.getSectionFooter() != null && !section.getSectionFooter().equals("") ) && section.getSectionFooter().getBytes().length > 2000000) {
			errors.rejectValue("sectionFooter", "cms.error.overflow", new Object[] {section.getSectionFooter().getBytes().length, 2000000}, null);
		}

	}
	
	
}
