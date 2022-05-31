package com.mandu.cms.admin.structure.menu.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.mandu.cms.admin.structure.menu.domain.Menu;


public interface AdminMenuService {
	
	
	/**
	 * 메뉴 목록 (레벨 1)<br>
	 * <br>
	 * @return
	 * 메뉴 목록 (레벨 1)<br>
	 */
	List<Menu> menuFirstList();
	
	
	/**
	 * 메뉴 목록 (레벨 1)<br>
	 * <br> 
	 * @param menu com.mandu.cms.admin.structure.menu.domain.Menu
	 * @return
	 * 메뉴 목록 (레벨 1)<br>
	 */
	List<Menu> menuFirstList(Menu menu);

	
	/**
	 * 메뉴 목록 (레벨 2)<br>
	 * <br>
	 * @return
	 * 메뉴 목록 (레벨 2)<br>
	 */
	List<Menu> menuSecondList();
	
	
	/**
	 * 메뉴 목록 (레벨 2)<br>
	 * <br>
	 * @param menu com.mandu.cms.admin.structure.menu.domain.Menu
	 * @return
	 * 메뉴 목록 (레벨 2)<br>
	 */
	List<Menu> menuSecondList(Menu menu);


	/**
	 * 메뉴 목록 (레벨 3)<br>
	 * <br>
	 * @return
	 * 메뉴 목록 (레벨 3)<br>
	 */
	List<Menu> menuThirdList();
	

	/**
	 * 메뉴 목록 (레벨 3)<br>
	 * <br>
	 * @param menu com.mandu.cms.admin.structure.menu.domain.Menu
	 * @return
	 * 메뉴 목록 (레벨 3)<br>
	 */
	List<Menu> menuThirdList(Menu menu);
	
	
	/**
	 * 메뉴 목록 (레벨 4)<br>
	 * <br>
	 * @return
	 * 메뉴 목록 (레벨 4)<br>
	 */
	List<Menu> menuFourthList();
	
	
	/**
	 * 메뉴 목록 (레벨 4)<br>
	 * <br> 
	 * @param menu com.mandu.cms.admin.structure.menu.domain.Menu
	 * @return
	 */
	List<Menu> menuFourthList(Menu menu);
	
	
	/**
	 * 메뉴 등록<br>
	 * <br>
	 * @param menu com.mandu.cms.admin.system.menu.domain.Menu
	 * @return
	 * 메뉴 번호 (CMS_MENU_FIRST.MENU_NO / CMS_MENU_SECOND.MENU_NO / CMS_MENU_THIRD.MENU_NO)
	 */
	String menuCreate(Menu menu);
	
	
	/**
	 * 메뉴 등록<br>
	 * <br>
	 * '작성 ID'를 설정 하여 메뉴 등록.<br>
	 * <br>
	 * @param menu com.mandu.cms.admin.system.menu.domain.Menu
	 * @param httpServletRequest javax.servlet.http.HttpServletRequest
	 * @return
	 * 메뉴 번호 (CMS_MENU_FIRST.MENU_NO / CMS_MENU_SECOND.MENU_NO / CMS_MENU_THIRD.MENU_NO / CMS_MENU_FOURTH.MENU_NO)
	 */
	String menuCreate(Menu menu, HttpServletRequest httpServletRequest);
	
	
	/**
	 * 메뉴 등록<br>
	 * <br>
	 * '메뉴 레벨'을 참조하여 메뉴 등록.<br>
	 * '등록 ID'를 설정 하여 메뉴 등록.<br>
	 * <br>
	 * @param menuLevel 메뉴 레벨 (1 : 메뉴 레벨 1, 2 : 메뉴 레벨 2, 3 : 메뉴 레벨 3, 4 : 메뉴 레벨 4)
	 * @param menu com.mandu.cms.admin.system.menu.domain.Menu
	 * @param httpServletRequest httpServletRequest javax.servlet.http.HttpServletRequest
	 * @return
	 * 메뉴 번호 (CMS_MENU_FIRST.MENU_NO / CMS_MENU_SECOND.MENU_NO / CMS_MENU_THIRD.MENU_NO / CMS_MENU_FOURTH.MENU_NO)
	 */
	String menuCreate(String menuLevel, Menu menu, HttpServletRequest httpServletRequest);
	
	
	/**
	 * 메뉴 읽기<br>
	 * <br>
	 * @param menu com.mandu.cms.admin.system.menu.domain.Menu
	 * @return
	 * 메뉴 데이터
	 */
	Menu menuRead(Menu menu);
	

	/**
	 * 메뉴 읽기<br>
	 * <br>
	 * '메뉴 레벨'과 '메뉴 번호'를 참조하여 메뉴 데이터 조회.<br>
	 * <br>
	 * @param menuLevel 메뉴 레벨 (1 : 메뉴 레벨 1, 2 : 메뉴 레벨 2, 3 : 메뉴 레벨 3, 4 : 메뉴 레벨 4)
	 * @param menuNo 메뉴 번호 (CMS_MENU_FIRST.MENU_NO / CMS_MENU_SECOND.MENU_NO / CMS_MENU_THIRD.MENU_NO / CMS_MENU_FOURTH.MENU_NO)
	 * @return
	 * 메뉴 데이터
	 */
	Menu menuRead(String menuLevel, String menuNo);

	
	/**
	 * 메뉴 수정<br>
	 * <br>
	 * @param menu com.mandu.cms.admin.system.menu.domain.Menu
	 * @return
	 * 메뉴 수정 결과 (true : 성공, false : 실패)
	 */
	boolean menuUpdate(Menu menu);
	
	
	/**
	 * 메뉴 수정<br>
	 * <br>
	 * '수정 ID'를 설정 하여 메뉴 수정.<br>
	 * <br>
	 * @param menu com.mandu.cms.admin.system.menu.domain.Menu
	 * @param httpServletRequest javax.servlet.http.HttpServletRequest
	 * @return
	 * 메뉴 수정 결과 (true : 성공, false : 실패)
	 */
	boolean menuUpdate(Menu menu, HttpServletRequest httpServletRequest);

	
	/**
	 * 메뉴 수정<br>
	 * <br>
	 * '메뉴 레벨'을 참조하여 메뉴 수정.<br>
	 * '수정 ID'를 설정 하여 메뉴 수정.<br>
	 * <br>
	 * @param menuLevel 메뉴 레벨 (1 : 메뉴 레벨 1, 2 : 메뉴 레벨 2, 3 : 메뉴 레벨 3, 4 : 메뉴 레벨 4)
	 * @param menu com.mandu.cms.admin.system.menu.domain.Menu
	 * @param httpServletRequest httpServletRequest javax.servlet.http.HttpServletRequest
	 * @return
	 * 메뉴 수정 결과 (true : 성공, false : 실패)
	 */
	boolean menuUpdate(String menuLevel, Menu menu, HttpServletRequest httpServletRequest);
	
	
	/**
	 * 메뉴 삭제<br>
	 * <br>
	 * @param menu com.mandu.cms.admin.system.menu.domain.Menu
	 * @return
	 * 메뉴 삭제 결과 (true : 성공, false : 실패)
	 */
	boolean menuDelete(Menu menu);
	
	
	/**
	 * 메뉴 삭제<br>
	 * <br>
	 * @param menu com.mandu.cms.admin.system.menu.domain.Menu
	 * @param httpServletRequest javax.servlet.http.HttpServletRequest
	 * @return
	 * 메뉴 삭제 결과 (true : 성공, false : 실패)
	 */
	boolean menuDelete(Menu menu, HttpServletRequest httpServletRequest);
	
	
	/**
	 * 메뉴 삭제<br>
	 * <br>
	 * '메뉴 레벨'과 '메뉴 번호'를 구분하여 메뉴를 삭제.<br>
	 * <br>
	 * @param menuLevel 메뉴 레벨 (1 : 메뉴 레벨 1, 2 : 메뉴 레벨 2, 3 : 메뉴 레벨 3, 4 : 메뉴 레벨 4)
	 * @param menuNo 메뉴 번호 (CMS_MENU_FIRST.MENU_NO / CMS_MENU_SECOND.MENU_NO / CMS_MENU_THIRD.MENU_NO / CMS_MENU_FOURTH.MENU_NO)
	 * @param httpServletRequest javax.servlet.http.HttpServletRequest
	 * @return
	 * 메뉴 삭제 결과 (true : 성공, false : 실패)
	 */
	boolean menuDelete(String menuLevel, String menuNo, HttpServletRequest httpServletRequest);
	
	
	/**
	 * 메뉴 사용 설정<br>
	 * <br>
	 * @param menu com.mandu.cms.admin.system.menu.domain.Menu
	 * @return
	 * 메뉴 사용 설정 결과 (true : 성공, false : 실패)
	 */
	boolean menuUse(Menu menu);
	
	
	/**
	 * 메뉴 사용 설정<br>
	 * <br>
	 * '메뉴 레벨'과 '메뉴 번호'를 참조하여 '사용 여부'를 설정.<br>
	 * <br>
	 * @param menuLevel 메뉴 레벨 (1 : 메뉴 레벨 1, 2 : 메뉴 레벨 2, 3 : 메뉴 레벨 3, 4 : 메뉴 레벨 4)
	 * @param menuNo 메뉴 번호 (CMS_MENI.MENU_NO)
	 * @param useYn 사용 여부 (Y : 사용, N : 사용 안 함)
	 * @return
	 * 메뉴 사용 설정 결과 (true : 성공, false : 실패)
	 */
	boolean menuUse(String menuLevel, String menuNo, String useYn);
	
	
	/**
	 * 메뉴 초기화<br>
	 * <br> 
	 * @param menu com.mandu.cms.admin.system.menu.domain.Menu
	 * @return
	 * 메뉴 초기화 결과 (true : 성공, false : 실패)
	 */
	boolean menuReset(Menu menu);
	
	
	/**
	 * 메뉴 초기화<br>
	 * <br>
	 * '사이트 코드'를 참조하여 모든 메뉴를 초기화.<br>
	 * <br>
	 * @param siteCode siteCode 사이트 코드 (CMS_SITE.CODE)
	 * @param httpServletRequest javax.servlet.http.HttpServletRequest
	 * @return
	 * 메뉴 초기화 결과 (true : 성공, false : 실패)
	 */
	boolean menuReset(String siteCode, HttpServletRequest httpServletRequest);
	

}
