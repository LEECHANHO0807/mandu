package com.mandu.cms.user.header.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mandu.cms.admin.common.service.AdminSiteCodeService;
import com.mandu.cms.admin.structure.section.domain.Section;
import com.mandu.cms.admin.structure.section.service.AdminSectionService;


@Controller
public class UserHeaderController {

	
	@Resource(name="adminSectionService")
	private AdminSectionService adminSectionService;
	
	
	@Resource(name="adminSiteCodeService")
	private AdminSiteCodeService<Section> adminSiteCodeService;
	
	
	
	
	// 사용자 헤더
	@RequestMapping(value="{siteCode}/header/view", method=RequestMethod.GET)
	private String headerView(
				@PathVariable("siteCode") String siteCode, 
				Model model
			) {
		
		Section section = new Section();
		
		// 서비스 - 사이트 코드 설정
		adminSiteCodeService.setSiteCode(section, siteCode);
		
		section = adminSectionService.sectionRead(section);
		
		model.addAttribute("section", section);
		
		
		return "/cms/user/" + (siteCode != null && siteCode.equals("base") ? "base" : "site") + "/header/userHeaderView";
	}
	
	
}