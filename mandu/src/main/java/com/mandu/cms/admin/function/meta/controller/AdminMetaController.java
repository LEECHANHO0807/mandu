package com.mandu.cms.admin.function.meta.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mandu.cms.admin.common.service.AdminSiteCodeService;
import com.mandu.cms.admin.function.meta.domain.Meta;
import com.mandu.cms.admin.function.meta.service.AdminMetaService;


@Controller
@RequestMapping(value="/admin")
public class AdminMetaController {
	
	
	@Resource(name="adminMetaService")
	private AdminMetaService adminMetaService;	
	
	
	@Resource(name="adminSiteCodeService")
	private AdminSiteCodeService<Meta> adminSiteCodeService;
	
	
	/*
	 * @Resource(name="logProcessService") private LogProcessService
	 * logProcessService;
	 */
	
	
	
	
	/**
	 * 메타 수정 화면<br>
	 * <br>
	 * @param siteCode 사이트 코드
	 * @param model org.springframework.ui.Model
	 * @return
	 * 메타 수정 화면.<br>
	 * 오류 발생 시,  오류 안내 화면.<br>
	 */
	@RequestMapping(value="/{siteCode}/function/meta/update", method=RequestMethod.GET)
	private String metaUpdate(
				@PathVariable("siteCode") String siteCode, 
				Model model
			) {
		
		Meta meta = new Meta();
		
		// 서비스 - 사이트 코드 설정
		adminSiteCodeService.setSiteCode(meta, siteCode);
		
		// 서비스 - 메타 읽기
		Meta metaRead = adminMetaService.metaRead(meta);
		
		model.addAttribute("metaRead", metaRead);
		
		
		return "/cms/admin/function/meta/adminMetaUpdate";
	}
	
	
	/**
	 * 메타 수정 처리<br>
	 * <br>
	 * @param siteCode 사이트_코드
	 * @param meta com.mandu.cms.admin.function.meta.domain.Meta
	 * @param httpServletRequest
	 * @param model org.springframework.ui.Model
	 * @return
	 * 메타 목록 화면.<br>
	 * 유효성 화인 실패 시, 메타 수정 화면.<br>
	 * 오류 발생 시, 오류 안내 화면.<br>
	 */
	@RequestMapping(value="/{siteCode}/function/meta/update", method=RequestMethod.POST)
	private String metaUpdate(
				@PathVariable("siteCode") String siteCode, 
				@ModelAttribute("meta") Meta meta, 
				HttpServletRequest httpServletRequest, 
				Model model
			) {
		
		// 서비스 - 사이트 코드 설정
		adminSiteCodeService.setSiteCode(meta, siteCode);
		
		
		// 서비스 - 메타 확인
		boolean metaCheckResult = adminMetaService.metaCheck(meta);
		
		if (metaCheckResult) {
			// 서비스 - 메타 수정
			adminMetaService.metaUpdate(meta, httpServletRequest);
			
			
			// 로그 프로세스
			//logProcessService.logProcessCreate("UPDATE", httpServletRequest);
			
		} else {
			// 서비스 - 메타 등록
			adminMetaService.metaCreate(meta, httpServletRequest);
			
			
			// 로그 프로세스
			//logProcessService.logProcessCreate("CREATE", httpServletRequest);
		}
		
		
		return "redirect:/admin/" + siteCode + "/function/meta/update";
	}
	
	
}