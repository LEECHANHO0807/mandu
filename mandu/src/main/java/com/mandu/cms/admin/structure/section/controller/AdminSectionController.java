package com.mandu.cms.admin.structure.section.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mandu.cms.admin.common.service.AdminSiteCodeService;
import com.mandu.cms.admin.structure.section.domain.Section;
import com.mandu.cms.admin.structure.section.service.AdminSectionService;
import com.mandu.cms.admin.structure.section.validator.SectionValidator;



@Controller
@RequestMapping(value="/admin")
public class AdminSectionController {
	
	
	@Resource(name="adminSectionService")
	private AdminSectionService adminSectionService;	
	
	
	@Resource(name="adminSiteCodeService")
	private AdminSiteCodeService<Section> adminSiteCodeService;
	
	
	/*
	 * @Resource(name="logProcessService") private LogProcessService
	 * logProcessService;
	 */
	
	
	@Autowired
	private SectionValidator sectionValidator;
	
	
	
	
	@RequestMapping(value="/{siteCode}/structure/section/update", method=RequestMethod.GET)
	private String sectionUpdate(
				@PathVariable("siteCode") String siteCode, 
				Model model
			) {
		
		Section section = new Section();
		
		// 서비스 - 사이트 코드 설정
		adminSiteCodeService.setSiteCode(section, siteCode);
		
		// 서비스 - 부분 읽기
		Section sectionRead = adminSectionService.sectionRead(section);
		
		model.addAttribute("sectionRead", sectionRead);
		
		
		return "/cms/admin/structure/section/adminSectionUpdate";
	}
	
	
	@RequestMapping(value="/{siteCode}/structure/section/update", method=RequestMethod.POST)
	private String sectionUpdate(
				@PathVariable("siteCode") String siteCode, 
				@ModelAttribute("section") Section section, 
				BindingResult bindingResult,
				HttpServletRequest httpServletRequest, 
				Model model
			) {
		
		// 서비스 - 사이트 코드 설정
		adminSiteCodeService.setSiteCode(section, siteCode);
		
		
		// 유효성 확인
		sectionValidator.validate(section, bindingResult);
		
		if (bindingResult.hasErrors()) {
			
			model.addAttribute("sectionRead", section);
			
			
			return "/cms/admin/structure/section/adminSectionUpdate";
		}
		
		
		// 서비스 - 부분 확인
		boolean sectionCheckResult = adminSectionService.sectionCheck(section);
		
		if (sectionCheckResult) {
			// 서비스 - 부분 수정
			adminSectionService.sectionUpdate(section, httpServletRequest);
			
			
			// 로그 프로세스
			//logProcessService.logProcessCreate("UPDATE", httpServletRequest);
			
		} else {
			// 서비스 - 부분 등록
			adminSectionService.sectionCreate(section, httpServletRequest);
			
			
			// 로그 프로세스
			//logProcessService.logProcessCreate("CREATE", httpServletRequest);
		}
		
		
		return "redirect:/admin/" + siteCode + "/structure/section/update";
	}

}
