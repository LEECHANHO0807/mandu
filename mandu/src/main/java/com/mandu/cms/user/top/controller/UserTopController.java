package com.mandu.cms.user.top.controller;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mandu.cms.admin.structure.menu.domain.Menu;
import com.mandu.cms.user.top.service.UserTopService;


@Controller
public class UserTopController {
	
	
	@Resource(name="userTopService")
	private UserTopService userTopService;
	
	
	
	
	// 사용자 탑 목록
	@RequestMapping(value="{siteCode}/top/view", method=RequestMethod.GET)
	private String topView(
				@PathVariable("siteCode") String siteCode, 
				@RequestParam(value="menuLevel", required=false) String menuLevel, 
				@RequestParam(value="menuNo", required=false) String menuNo, 
				Model model
			) {
		
		Menu topInformation = userTopService.topInformation(menuLevel, menuNo, siteCode);
		Menu prevMenu = null;
		Menu nextMenu = null;
		
		if(menuNo != null && menuNo != "" && menuLevel != null && menuLevel != "")
		{
			prevMenu = userTopService.prevMenu(topInformation);
			nextMenu = userTopService.nextMenu(topInformation);
		}
		model.addAttribute("topInformation", topInformation);
		model.addAttribute("prevMenu", prevMenu);
		model.addAttribute("nextMenu", nextMenu);
		
		return "/cms/user/" + (siteCode != null && siteCode.equals("base") ? "base" : "site") + "/top/userTopView";
	}

}