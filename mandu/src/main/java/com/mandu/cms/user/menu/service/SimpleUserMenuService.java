package com.mandu.cms.user.menu.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mandu.cms.admin.structure.menu.domain.Menu;
import com.mandu.cms.user.menu.dao.UserMenuDao;



@Service("userMenuService")
public class SimpleUserMenuService implements UserMenuService {

	
	@Resource(name="userMenuDao")
	private UserMenuDao userMenuDao;
	
	
	
	
	@Override
	public List<Menu> menuFirstUserList() {
		
		return userMenuDao.menuFirstUserList(null);
	}

	
	@Override
	public List<Menu> menuFirstUserList(Menu menu) {
		
		return userMenuDao.menuFirstUserList(menu);
	}
		
	
	@Override
	public List<Menu> menuFirstUserList(String siteCode) {
		
		Menu menu = new Menu();
		
		menu.setSiteCode(siteCode);
		
		
		return menuFirstUserList(menu);
	}
	
	
	@Override
	public List<Menu> menuFirstUserList(String siteCode, boolean open) {
		
		Menu menu = new Menu();
		
		menu.setSiteCode(siteCode);
		
		if (open) {
			menu.setOpenYn("Y");
			
		} else {
			menu.setOpenYn("N");
		}
		
		
		return menuFirstUserList(menu);
	}
	
	
	@Override
	public List<Menu> menuSecondUserList() {
		
		return userMenuDao.menuSecondUserList(null);
	}

	
	@Override
	public List<Menu> menuSecondUserList(Menu menu) {
		
		return userMenuDao.menuSecondUserList(menu);
	}
	
	
	@Override
	public List<Menu> menuSecondUserList(String siteCode) {
		
		Menu menu = new Menu();
		
		menu.setSiteCode(siteCode);
		
		
		return menuSecondUserList(menu);
	}
	
	
	@Override
	public List<Menu> menuSecondUserList(String siteCode, boolean open) {
		
		Menu menu = new Menu();
		
		menu.setSiteCode(siteCode);
		
		if (open) {
			menu.setOpenYn("Y");
			
		} else {
			menu.setOpenYn("N");
		}
		
		
		return menuSecondUserList(menu);
	}
	
	
	@Override
	public List<Menu> menuThirdUserList() {
		
		return userMenuDao.menuThirdUserList(null);
	}
	
	
	@Override
	public List<Menu> menuThirdUserList(Menu menu) {
		
		return userMenuDao.menuThirdUserList(menu);
	}	
	

	@Override
	public List<Menu> menuThirdUserList(String siteCode) {
		
		Menu menu = new Menu();
		
		menu.setSiteCode(siteCode);
		
		
		return menuThirdUserList(menu);
	}


	@Override
	public List<Menu> menuThirdUserList(String siteCode, boolean open) {
		
		Menu menu = new Menu();
		
		menu.setSiteCode(siteCode);
		
		if (open) {
			menu.setOpenYn("Y");
			
		} else {
			menu.setOpenYn("N");
		}
		
		
		return menuThirdUserList(menu);
	}
	
	
	@Override
	public List<Menu> menuFourthUserList() {
		
		return userMenuDao.menuFourthUserList(null);
	}


	@Override
	public List<Menu> menuFourthUserList(Menu menu) {
		
		return userMenuDao.menuFourthUserList(menu);
	}


	@Override
	public List<Menu> menuFourthUserList(String siteCode) {
		
		Menu menu = new Menu();
		
		menu.setSiteCode(siteCode);
		
		
		return menuFourthUserList(menu);
	}


	@Override
	public List<Menu> menuFourthUserList(String siteCode, boolean open) {
		
		Menu menu = new Menu();
		
		menu.setSiteCode(siteCode);
		
		if (open) {
			menu.setOpenYn("Y");
			
		} else {
			menu.setOpenYn("N");
		}
		
		
		return menuFourthUserList(menu);
	}	
	

	@Override
	public String menuRedirect(String menuLevel, String menuNo, String siteCode) {
		
		Menu menu = new Menu();
		
		menu.setMenuLevel(menuLevel);
		menu.setMenuNo(menuNo);
		menu.setSiteCode(siteCode);

		Menu menuRedirect = null;
		
		if (menuLevel != null && !menuLevel.equals("")) {
			if (menuLevel.equals("1")) {
				menuRedirect = userMenuDao.menuFirstRedirect(menu);
				
			} else if (menuLevel.equals("2")) {
				menuRedirect = userMenuDao.menuSecondRedirect(menu);
				
			} else if (menuLevel.equals("3")) {
				menuRedirect = userMenuDao.menuThirdRedirect(menu);
			}
		}
		
		String returnUrl = null;
		
		if (menuRedirect != null) {
			if (menuRedirect.getType() != null && menuRedirect.getType().equals("BASE")) {
				returnUrl = "/" + siteCode + "/menu/baseView"
						+ "?"
						+ "menuLevel=" + menuRedirect.getMenuLevel() + "&" 
						+ "menuNo=" + menuRedirect.getMenuNo();
				
			} else if (menuRedirect.getType() != null && menuRedirect.getType().equals("BOARD")) {
				returnUrl = "/" + siteCode + "/board/list"
						+ "?"
						+ "boardManagementNo=" + menuRedirect.getReferenceNo() + "&" 
						+ "menuLevel=" + menuRedirect.getMenuLevel() + "&" 
						+ "menuNo=" + menuRedirect.getMenuNo();
				
			} else if (menuRedirect.getType() != null && menuRedirect.getType().equals("SCHEDULE")) {
				returnUrl = "/" + siteCode + "/schedule/list"
						+ "?"
						+ "scheduleManagementNo=" + menuRedirect.getReferenceNo() + "&" 
						+ "menuLevel=" + menuRedirect.getMenuLevel() + "&" 
						+ "menuNo=" + menuRedirect.getMenuNo();
				
			} else if (menuRedirect.getType() != null && menuRedirect.getType().equals("CONTENTS")) {
				returnUrl = "/" + siteCode + "/contents/view"
						+ "?"
						+ "contentsNo=" + menuRedirect.getReferenceNo() + "&" 
						+ "menuLevel=" + menuRedirect.getMenuLevel() + "&" 
						+ "menuNo=" + menuRedirect.getMenuNo();
				
			} else if (menuRedirect.getType() != null && menuRedirect.getType().equals("LINK")) {
				returnUrl = "LINK|" + menuRedirect.getLinkUrl() + "|" + menuRedirect.getLinkType();
				
			} else if (menuRedirect.getType() != null && menuRedirect.getType().equals("CUSTOM")) {
				returnUrl = menuRedirect.getCustomUrl()
						+ "?"
						+ "menuLevel=" + menuRedirect.getMenuLevel() + "&" 
						+ "menuNo=" + menuRedirect.getMenuNo();
			}
		}
		
		
		return returnUrl;
	}


	@Override
	public List<Menu> menuSecondUserLeftList(String menuNo, String siteCode) {
		
		Menu menu = new Menu();
		
		menu.setMenuNo(menuNo);
		menu.setSiteCode(siteCode);
		
		
		return userMenuDao.menuSecondUserLeftList(menu);
	}


	@Override
	public List<Menu> menuThirdUserLeftList(String menuNo, String siteCode) {
		
		Menu menu = new Menu();
		
		menu.setMenuNo(menuNo);
		menu.setSiteCode(siteCode);		
		
		
		return userMenuDao.menuThirdUserLeftList(menu);
	}


	@Override
	public List<Menu> menuFourthUserLeftList(String menuNo, String siteCode) {
		
		Menu menu = new Menu();
		
		menu.setMenuNo(menuNo);
		menu.setSiteCode(siteCode);		
		
		
		return userMenuDao.menuFourthUserLeftList(menu);
	}
	
	
}
