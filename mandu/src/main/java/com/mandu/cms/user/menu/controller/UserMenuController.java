package com.mandu.cms.user.menu.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mandu.cms.admin.structure.menu.domain.Menu;
import com.mandu.cms.user.menu.service.UserMenuService;
import com.mandu.cms.user.top.service.UserTopService;


@Controller
public class UserMenuController {
	
	
	@Resource(name="userMenuService")
	private UserMenuService userMenuService;
	
	
	@Resource(name="userTopService")
	private UserTopService userTopService;
	
	
	
	
	// 사용자 메뉴 목록
	@RequestMapping(value="/{siteCode}/menu/view", method=RequestMethod.GET)
	private String menuView(
				@PathVariable("siteCode") String siteCode,
				@RequestParam(value="menuLevel", required=false) String menuLevel, 
				@RequestParam(value="menuNo", required=false) String menuNo, 
				Model model
			) {
		
		if (menuLevel != null && !menuLevel.equals("") && menuNo != null && !menuNo.equals("")) {
			Menu topInformation = userTopService.topInformation(menuLevel, menuNo, siteCode);
			
			model.addAttribute("topInformation", topInformation);
		}
		
		
		// 서비스 - 메뉴 목록 (레벨 1)
		List<Menu> menuList1 = userMenuService.menuFirstUserList(siteCode, true);
		
		model.addAttribute("menuList1", menuList1);
		
		
		// 서비스 - 메뉴 목록 (레벨 2)
		List<Menu> menuList2 = userMenuService.menuSecondUserList(siteCode, true);
		
		model.addAttribute("menuList2", menuList2);
		
		
		// 서비스 - 메뉴 목록 (레벨 3)
		List<Menu> menuList3 = userMenuService.menuThirdUserList(siteCode, true);
		
		model.addAttribute("menuList3", menuList3);
		
		
		// 서비스 - 메뉴 목록 (레벨 4)
		List<Menu> menuList4 = userMenuService.menuFourthUserList(siteCode, true);
		
		model.addAttribute("menuList4", menuList4);
		
		
		return "/cms/user/" + (siteCode != null && siteCode.equals("base") ? "base" : "site") + "/menu/userMenuView";
	}
	
	
	// 사용자 메뉴 베이스
	@RequestMapping(value="/{siteCode}/menu/baseView", method=RequestMethod.GET)
	private String menuBaseView(
				@PathVariable("siteCode") String siteCode, 
				@RequestParam(value="menuLevel", required=false) String menuLevel, 
				@RequestParam(value="menuNo", required=false) String menuNo,
				Model model
			) {
		
		
		// 서비스 - 메뉴 리다이렉트
		String menuRedirect = userMenuService.menuRedirect(menuLevel, menuNo, siteCode);
		
		if (menuRedirect != null) {
			if (menuRedirect.substring(0, 5).equals("LINK|")) {
				
				return "redirect:/" + siteCode + "/menu/linkView?" 
						+ "linkUrl=" + menuRedirect.substring(menuRedirect.indexOf("|") + 1, menuRedirect.lastIndexOf("|")) 
						+ "&linkType=" + menuRedirect.substring(menuRedirect.lastIndexOf("|") + 1);
				
			} else {
				
				return "redirect:" + menuRedirect;
			}
						
		}
		
		
		return "redirect:/" + siteCode + "/error/menu/view";
	}
	
	
	// 사용자 메뉴 베이스
	@RequestMapping(value="/{siteCode}/menu/linkView", method=RequestMethod.GET)
	private String menuLinkView(
			@PathVariable("siteCode") String siteCode,
			Model model
		) {
		
		
		return "/cms/user/" + (siteCode != null && siteCode.equals("base") ? "base" : "site") + "/menu/userMenuLinkView";
	}
		

}