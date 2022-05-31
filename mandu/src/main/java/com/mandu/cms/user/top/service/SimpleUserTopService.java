package com.mandu.cms.user.top.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mandu.cms.admin.structure.menu.domain.Menu;
import com.mandu.cms.user.top.dao.UserTopDao;


@Service("userTopService")
public class SimpleUserTopService implements UserTopService {

	
	@Resource(name="userTopDao")
	private UserTopDao userTopDao;

	
	
	
	@Override
	public Menu topInformation(String menuLevel, String menuNo) {

		Menu menu = new Menu();
		
		menu.setMenuLevel(menuLevel);
		menu.setMenuNo(menuNo);

		
		if (menuLevel != null) {
			if (menuLevel.equals("1")) {
				
				return userTopDao.topFirstInformation(menu);
				
			} else if (menuLevel.equals("2")) {
				
				return userTopDao.topSecondInformation(menu);
				
			} else if (menuLevel.equals("3")) {
	
				return userTopDao.topThirdInformation(menu);
				
			} else if (menuLevel.equals("4")) {
	
				return userTopDao.topFourthInformation(menu);
				
			} 
		}
		
		
		return null;
	}
	
	
	@Override
	public Menu topInformation(String menuLevel, String menuNo, String siteCode) {
		
		Menu menu = new Menu();
		
		menu.setMenuLevel(menuLevel);
		menu.setMenuNo(menuNo);
		menu.setSiteCode(siteCode);

		
		if (menuLevel != null) {
			if (menuLevel.equals("1")) {
				
				return userTopDao.topFirstInformation(menu);
				
			} else if (menuLevel.equals("2")) {
				
				return userTopDao.topSecondInformation(menu);
				
			} else if (menuLevel.equals("3")) {
	
				return userTopDao.topThirdInformation(menu);
				
			} else if (menuLevel.equals("4")) {
	
				return userTopDao.topFourthInformation(menu);
				
			}
		}		
		
		return null;
	}


	@Override
	public Menu prevMenu(Menu menu) {
		Menu curMenu = new Menu();
		curMenu.setMenuLevel(menu.getMenuLevel());
		curMenu.setUpperMenuNo(menu.getUpperMenuNo());
		curMenu.setSiteCode(menu.getSiteCode());
		curMenu.setOrderNo(Integer.toString(Integer.parseInt(menu.getOrderNo())-1));
		
		return userTopDao.prevMenu(curMenu);
	}


	@Override
	public Menu nextMenu(Menu menu) {
		Menu curMenu = new Menu();
		
		curMenu.setMenuLevel(menu.getMenuLevel());
		curMenu.setUpperMenuNo(menu.getUpperMenuNo());
		curMenu.setSiteCode(menu.getSiteCode());
		curMenu.setOrderNo(Integer.toString(Integer.parseInt(menu.getOrderNo())+1));
		
		return userTopDao.nextMenu(curMenu);
	}
	
}