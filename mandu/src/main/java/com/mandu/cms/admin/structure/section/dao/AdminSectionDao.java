package com.mandu.cms.admin.structure.section.dao;

import org.springframework.stereotype.Repository;

import com.mandu.cms.abstracts.AbstractDAO;
import com.mandu.cms.admin.structure.section.domain.Section;


@Repository("adminSectionDao")
public class AdminSectionDao extends AbstractDAO {

	
	public Integer sectionCheck(Section section) {
		
		return selectOne("adminSection.sectionCheck", section);
	}
	
	
	public int sectionCreate(Section section) {
		
		return insert("adminSection.sectionCreate", section);
	}
	
	
	public Section sectionRead(Section section) {
		
		return selectOne("adminSection.sectionRead", section);
	}
	
	
	public int sectionUpdate(Section section) {
		
		return update("adminSection.sectionUpdate", section);
	}


	public int sectionDelete(Section section) {
		
		return delete("adminSection.sectionDelete", section);
	}

}
