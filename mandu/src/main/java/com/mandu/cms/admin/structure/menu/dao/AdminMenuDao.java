package com.mandu.cms.admin.structure.menu.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.mandu.cms.abstracts.AbstractDAO;
import com.mandu.cms.admin.structure.menu.domain.Menu;




@Repository("adminMenuDao")
public class AdminMenuDao extends AbstractDAO {
	
	
	public List<Menu> menuFirstList(Menu menu) {
		
		return selectList("adminMenu.menuFirstList", menu);
	}


	public List<Menu> menuSecondList(Menu menu) {
		
		return selectList("adminMenu.menuSecondList", menu);
	}


	public List<Menu> menuThirdList(Menu menu) {
		
		return selectList("adminMenu.menuThirdList", menu);
	}
	
	
	public List<Menu> menuFourthList(Menu menu) {
		
		return selectList("adminMenu.menuFourthList", menu);
	}
	
	
	public int menuFirstCreate(Menu menu) {
		
		return insert("adminMenu.menuFirstCreate", menu);
	}


	public int menuSecondCreate(Menu menu) {
		
		return insert("adminMenu.menuSecondCreate", menu);
	}


	public int menuThirdCreate(Menu menu) {
		
		return insert("adminMenu.menuThirdCreate", menu);
	}
	
	
	public int menuFourthCreate(Menu menu) {
		
		return insert("adminMenu.menuFourthCreate", menu);
	}
	

	public Menu menuFirstRead(Menu menu) {
		
		return selectOne("adminMenu.menuFirstRead", menu);
	}


	public Menu menuSecondRead(Menu menu) {
		
		return selectOne("adminMenu.menuSecondRead", menu);
	}


	public Menu menuThirdRead(Menu menu) {
		
		return selectOne("adminMenu.menuThirdRead", menu);
	}
	
	
	public Menu menuFourthRead(Menu menu) {
		
		return selectOne("adminMenu.menuFourthRead", menu);
	}
	
		
	public int menuFirstUpdate(Menu menu) {
		
		return update("adminMenu.menuFirstUpdate", menu);
	}


	public int menuSecondUpdate(Menu menu) {
		
		return update("adminMenu.menuSecondUpdate", menu);
	}


	public int menuThirdUpdate(Menu menu) {
		
		return update("adminMenu.menuThirdUpdate", menu);
	}
	
	
	public int menuFourthUpdate(Menu menu) {
		
		return update("adminMenu.menuFourthUpdate", menu);
	}
	
	
	public int menuFirstDelete(Menu menu) {
		
		return delete("adminMenu.menuFirstDelete", menu);
	}
	
	public int menuSecondDelete(Menu menu) {
		
		return delete("adminMenu.menuSecondDelete", menu);
	}
	
	
	public int menuThirdDelete(Menu menu) {
		
		return delete("adminMenu.menuThirdDelete", menu);
	}
	
	
	public int menuFourthDelete(Menu menu) {
		
		return delete("adminMenu.menuFourthDelete", menu);
	}
	
	
	public int menuUse(Menu menu) {
		
		return update("adminMenu.menuUse", menu);
	}
	
	
	public int menuFirstReset(Menu menu) {
		
		return update("adminMenu.menuFirstReset", menu);
	}


	public int menuSecondReset(Menu menu) {
		
		return update("adminMenu.menuSecondReset", menu);
	}


	public int menuThirdReset(Menu menu) {
		
		return update("adminMenu.menuThirdReset", menu);
	}
	
	
	public int menufOURTHReset(Menu menu) {
		
		return update("adminMenu.menuFourthReset", menu);
	}
	
	
}