package com.mandu.cms.admin.structure.menu.service;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.mandu.cms.admin.structure.menu.dao.AdminMenuDao;
import com.mandu.cms.admin.structure.menu.domain.Menu;

import com.mandu.cms.login.LoginVO;
import com.mandu.cms.login.EgovUserDetailsHelper;



@Service("adminMenuService")
public class SimpleAdminMenuService implements AdminMenuService {
	
	
	@Resource(name="adminMenuDao")
	private AdminMenuDao adminMenuDao;
	
	
	
	
	@Override
	public List<Menu> menuFirstList() {
		
		return adminMenuDao.menuFirstList(null);
	}
	
	
	@Override
	public List<Menu> menuFirstList(Menu menu) {
		
		return adminMenuDao.menuFirstList(menu);
	}
	
	
	@Override
	public List<Menu> menuSecondList() {
		
		return adminMenuDao.menuSecondList(null);
	}


	@Override
	public List<Menu> menuSecondList(Menu menu) {
		
		return adminMenuDao.menuSecondList(menu);
	}
	
	
	@Override
	public List<Menu> menuThirdList() {
		
		return adminMenuDao.menuThirdList(null);
	}	
	
	
	@Override
	public List<Menu> menuThirdList(Menu menu) {
		
		return adminMenuDao.menuThirdList(menu);
	}
	
	
	@Override
	public List<Menu> menuFourthList() {
		
		return adminMenuDao.menuFourthList(null);
	}


	@Override
	public List<Menu> menuFourthList(Menu menu) {
		
		return adminMenuDao.menuFourthList(menu);
	}
	

	@Override
	public String menuCreate(Menu menu) {
		
		if (menu.getUpperMenuNo() != null && menu.getUpperMenuNo().equals("")) {
			menu.setUpperMenuNo(null);
		}		

		if (menu.getMenuLevel() != null) {
			if (menu.getMenuLevel().equals("1")) {
				
				int menuFirstCreateResult = adminMenuDao.menuFirstCreate(menu);
				
				if (menuFirstCreateResult > 0) {
					
					return menu.getMenuNo();
				}
				
			} else if (menu.getMenuLevel().equals("2")) {
				
				int menuSecondCreateResult = adminMenuDao.menuSecondCreate(menu);
				
				if (menuSecondCreateResult > 0) {
					
					return menu.getMenuNo();
				}				
				
			} else if (menu.getMenuLevel().equals("3")) {
				
				int menuThirdCreateResult = adminMenuDao.menuThirdCreate(menu);
				
				if (menuThirdCreateResult > 0) {
					
					return menu.getMenuNo();
				}
				
			} else if (menu.getMenuLevel().equals("4")) {
				
				int menuFourthCreateResult = adminMenuDao.menuFourthCreate(menu);
				
				if (menuFourthCreateResult > 0) {
					
					return menu.getMenuNo();
				}				
			}
		}
		
		
		return null;
	}


	@Override
	public String menuCreate(Menu menu, HttpServletRequest httpServletRequest) {

		LoginVO loginVO = (LoginVO)EgovUserDetailsHelper.getAuthenticatedUser();
		
		menu.setWriteId(loginVO.getUniqId());
		
		
		return menuCreate(menu);
	}
	
	
	@Override
	public String menuCreate(String menuLevel, Menu menu, HttpServletRequest httpServletRequest) {
		
		LoginVO loginVO = (LoginVO)EgovUserDetailsHelper.getAuthenticatedUser();
		
		menu.setWriteId(loginVO.getUniqId());
		
		menu.setMenuLevel(menuLevel);
		
		
		return menuCreate(menu);
		
	}
	
	
	@Override
	public Menu menuRead(Menu menu) {

		if (menu.getMenuLevel() != null) {
			if (menu.getMenuLevel().equals("1")) {
				
				return  adminMenuDao.menuFirstRead(menu);
				
			} else if (menu.getMenuLevel().equals("2")) {
				
				return  adminMenuDao.menuSecondRead(menu);
				
			} else if (menu.getMenuLevel().equals("3")) {
				
				return  adminMenuDao.menuThirdRead(menu);
				
			} else if (menu.getMenuLevel().equals("4")) {
				
				return  adminMenuDao.menuFourthRead(menu);
			}
		}
		
		
		return null;
	}


	@Override
	public Menu menuRead(String menuLevel, String menuNo) {

		Menu menu = new Menu();
		
		menu.setMenuLevel(menuLevel);
		menu.setMenuNo(menuNo);
		
		
		return menuRead(menu);
	}
	

	@Override
	public boolean menuUpdate(Menu menu) {	
		
		if (menu.getUpperMenuNo() != null && menu.getUpperMenuNo().equals("")) {
			menu.setUpperMenuNo(null);
		}
		
		if (menu.getMenuLevel() != null) {
			if (menu.getMenuLevel().equals("1")) {
				int menuUpdateResult = adminMenuDao.menuFirstUpdate(menu);
				
				if (menuUpdateResult > 0) {
					
					return true;
				}
				
			} else if (menu.getMenuLevel().equals("2")) {
				int menuUpdateResult = adminMenuDao.menuSecondUpdate(menu);
				
				if (menuUpdateResult > 0) {
					
					return true;
				}
				
			} else if (menu.getMenuLevel().equals("3")) {
				int menuUpdateResult = adminMenuDao.menuThirdUpdate(menu);
				
				if (menuUpdateResult > 0) {
					
					return true;
				}
				
			} else if (menu.getMenuLevel().equals("4")) {
				int menuFourthUpdateResult = adminMenuDao.menuFourthUpdate(menu);
				
				if (menuFourthUpdateResult > 0) {
					
					return true;
				}
			}
		}
		
		
		return false;
	}


	@Override
	public boolean menuUpdate(Menu menu, HttpServletRequest httpServletRequest) {

		LoginVO loginVO = (LoginVO)EgovUserDetailsHelper.getAuthenticatedUser();
		
		menu.setUpdateId(loginVO.getUniqId());
		
		
		return menuUpdate(menu);
	}
	
	
	@Override
	public boolean menuUpdate(String menuLevel, Menu menu, HttpServletRequest httpServletRequest) {
	
		LoginVO loginVO = (LoginVO)EgovUserDetailsHelper.getAuthenticatedUser();
		
		menu.setUpdateId(loginVO.getUniqId());
		
		menu.setMenuLevel(menuLevel);
		
		
		return menuUpdate(menu);
	}

	
	@Override
	public boolean menuDelete(Menu menu) {
		
		if (menu.getMenuLevel() != null) {
			if (menu.getMenuLevel().equals("1")) {
				int menuFirstDeleteResult = adminMenuDao.menuFirstDelete(menu);
				
				if (menuFirstDeleteResult > 0) {
					
					return true;
				}
				
			} else if (menu.getMenuLevel().equals("2")) {
				int menuSecondDeleteResult = adminMenuDao.menuSecondDelete(menu);
				
				if (menuSecondDeleteResult > 0) {
					
					return true;
				}
				
			} else if (menu.getMenuLevel().equals("3")) {
				int menuThirdDeleteResult = adminMenuDao.menuThirdDelete(menu);
				
				if (menuThirdDeleteResult > 0) {
					
					return true;
				}
				
			} else if (menu.getMenuLevel().equals("4")) {
				int menuFourthDeleteResult = adminMenuDao.menuFourthDelete(menu);
				
				if (menuFourthDeleteResult > 0) {
					
					return true;
				}
			}
			
		}
		
		
		return false;
	}
	
	
	@Override
	public boolean menuDelete(Menu menu, HttpServletRequest httpServletRequest) {
		
		LoginVO loginVO = (LoginVO)EgovUserDetailsHelper.getAuthenticatedUser();
		
		menu.setUpdateId(loginVO.getUniqId());		
		
		
		return menuDelete(menu);
	}	
	

	@Override
	public boolean menuDelete(String menuLevel, String menuNo, HttpServletRequest httpServletRequest) {	
		
		Menu menu = new Menu();
		
		menu.setMenuLevel(menuLevel);
		menu.setMenuNo(menuNo);
		
		LoginVO loginVO = (LoginVO)EgovUserDetailsHelper.getAuthenticatedUser();
		
		menu.setUpdateId(loginVO.getUniqId());		
		
		
		return menuDelete(menu);
	}


	@Override
	public boolean menuUse(Menu menu) {
		
		int menuUseResult = adminMenuDao.menuUse(menu);
		
		if (menuUseResult > 0) {
			
			return true;
		}
		
		return false;
	}


	@Override
	public boolean menuUse(String menuLevel, String menuNo, String useYn) {

		Menu menu = new Menu();
		
		menu.setMenuLevel(menuLevel);
		menu.setMenuNo(menuNo);
		menu.setUseYn(useYn);
		
		
		return menuUse(menu);
	}


	@Override
	public boolean menuReset(Menu menu) {
		
		adminMenuDao.menuFirstReset(menu);
		adminMenuDao.menuSecondReset(menu);
		adminMenuDao.menuThirdReset(menu);
		
		
		return true;
	}


	@Override
	public boolean menuReset(String siteCode, HttpServletRequest httpServletRequest) {
		
		Menu menu = new Menu();
		
		menu.setSiteCode(siteCode);
		
		LoginVO loginVO = (LoginVO)EgovUserDetailsHelper.getAuthenticatedUser();
		
		menu.setUpdateId(loginVO.getUniqId());
		
		
		return menuReset(menu);
	}
	
	
}
