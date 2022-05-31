package com.mandu.cms.user.top.service;

import com.mandu.cms.admin.structure.menu.domain.Menu;

public interface UserTopService {

	
	Menu topInformation(String menuLevel, String menuNo);
	
	Menu topInformation(String menuLevel, String menuNo, String siteCode);
	
	Menu prevMenu(Menu menu);

	Menu nextMenu(Menu menu);
}
