package com.mandu.cms.user.top.dao;

import org.springframework.stereotype.Repository;

import com.mandu.cms.abstracts.AbstractDAO;
import com.mandu.cms.admin.structure.menu.domain.Menu;



@Repository("userTopDao")
public class UserTopDao extends AbstractDAO {

	
	public Menu topFirstInformation(Menu menu) {
		
		return selectOne("userTop.topFirstInformation", menu);
	}

	public Menu topSecondInformation(Menu menu) {
		
		return selectOne("userTop.topSecondInformation", menu);
	}

	public Menu topThirdInformation(Menu menu) {
		
		return selectOne("userTop.topThirdInformation", menu);
	}

	public Menu topFourthInformation(Menu menu) {
		
		return selectOne("userTop.topFourthInformation", menu);
	}
	
	public Menu prevMenu(Menu menu){
		return selectOne("userTop.prevNextMenu", menu);
	}
	
	public Menu nextMenu(Menu menu){
		return selectOne("userTop.prevNextMenu", menu);
	}
}