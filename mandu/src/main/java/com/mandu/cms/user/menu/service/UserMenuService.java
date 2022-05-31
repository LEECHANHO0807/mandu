package com.mandu.cms.user.menu.service;

import java.util.List;

import com.mandu.cms.admin.structure.menu.domain.Menu;


public interface UserMenuService {
	
	
	/**
	 * 메뉴 목록 (사용자 - 레벨 1)<br>
	 * <br>
	 * @return
	 * 메뉴 목록 (사용자 - 레벨 1)
	 */
	List<Menu> menuFirstUserList();
	
	List<Menu> menuFirstUserList(Menu menu);
	
	List<Menu> menuFirstUserList(String siteCode);
	
	List<Menu> menuFirstUserList(String siteCode, boolean open);
	
	
	/**
	 * 메뉴 목록 (사용자 - 레벨 2)<br>
	 * <br>
	 * @return
	 * 메뉴 목록 (사용자 - 레벨 2)
	 */
	List<Menu> menuSecondUserList();
	
	List<Menu> menuSecondUserList(Menu menu);
	
	List<Menu> menuSecondUserList(String siteCode);
	
	List<Menu> menuSecondUserList(String siteCode, boolean open);
	
	
	/**
	 * 메뉴 목록 (사용자 - 레벨 3)<br>
	 * <br>
	 * @return
	 * 메뉴 목록 (사용자 - 레벨 3)
	 */
	List<Menu> menuThirdUserList();
	
	List<Menu> menuThirdUserList(Menu menu);
	
	List<Menu> menuThirdUserList(String siteCode);
	
	List<Menu> menuThirdUserList(String siteCode, boolean open);
	

	/**
	 * 메뉴 목록 (사용자 - 레벨 4)<br>
	 * <br>
	 * @return
	 * 메뉴 목록 (사용자 - 레벨 4)
	 */
	List<Menu> menuFourthUserList();
	
	List<Menu> menuFourthUserList(Menu menu);
	
	List<Menu> menuFourthUserList(String siteCode);
	
	List<Menu> menuFourthUserList(String siteCode, boolean open);	
	

	String menuRedirect(String menuLevel, String menuNo, String siteCode);
	

	List<Menu> menuSecondUserLeftList(String menuNo, String siteCode);
	
	List<Menu> menuThirdUserLeftList(String menuNo, String siteCode);
	
	List<Menu> menuFourthUserLeftList(String menuNo, String siteCode);
	
	
}