package com.mandu.cms.user.menu.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mandu.cms.abstracts.AbstractDAO;
import com.mandu.cms.admin.structure.menu.domain.Menu;



@Repository("userMenuDao")
public class UserMenuDao extends AbstractDAO {

	
	public List<Menu> menuFirstUserList(Menu menu) {
		
		return selectList("userMenu.menuFirstUserList", menu);
	}

	
	public List<Menu> menuSecondUserList(Menu menu) {
		
		return selectList("userMenu.menuSecondUserList", menu);
	}

	
	public List<Menu> menuThirdUserList(Menu menu) {
		
		return selectList("userMenu.menuThirdUserList", menu);
	}

	
	public List<Menu> menuFourthUserList(Menu menu) {
		
		return selectList("userMenu.menuFourthUserList", menu);
	}
	

	public Menu menuFirstRedirect(Menu menu) {
		
		return selectOne("userMenu.menuFirstRedirect", menu);
	}
	
	
	public Menu menuSecondRedirect(Menu menu) {

		return selectOne("userMenu.menuSecondRedirect", menu);
	}


	public Menu menuThirdRedirect(Menu menu) {
		
		return selectOne("userMenu.menuThirdRedirect", menu);
	}
	
	
	public List<Menu> menuSecondUserLeftList(Menu menu) {
		
		return selectList("userMenu.menuSecondUserLeftList", menu);
	}


	public List<Menu> menuThirdUserLeftList(Menu menu) {
		
		return selectList("userMenu.menuThirdUserLeftList", menu);
	}
	
	
	public List<Menu> menuFourthUserLeftList(Menu menu) {
		
		return selectList("userMenu.menuFourthUserLeftList", menu);
	}
	
	
}