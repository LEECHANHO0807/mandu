package com.mandu.cms.admin.structure.section.service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.mandu.cms.admin.structure.section.dao.AdminSectionDao;
import com.mandu.cms.admin.structure.section.domain.Section;

import com.mandu.cms.login.LoginVO;
import com.mandu.cms.login.EgovUserDetailsHelper;


@Service("adminSectionService")
public class SimpleAdminSectionService  implements AdminSectionService {

	
	@Resource(name="adminSectionDao")
	AdminSectionDao adminSectionDao;
	
	
	
	
	@Override
	public boolean sectionCheck(Section section) {
		
		Integer sectionCheckResult = adminSectionDao.sectionCheck(section);
		
		if (sectionCheckResult > 0) {
			
			return true;
		}
		
		
		return false;
	}	
	
	
	@Override
	public boolean sectionCreate(Section section) {
		
		int sectionCreateResult = adminSectionDao.sectionCreate(section);
		
		if (sectionCreateResult > 0) {
			
			return true;
		}
		
		
		return false;
	}


	@Override
	public boolean sectionCreate(Section section, HttpServletRequest httpServletRequest) {
		
		LoginVO loginVO = (LoginVO)EgovUserDetailsHelper.getAuthenticatedUser();
		
		section.setWriteId(loginVO.getUniqId());
		

		return sectionCreate(section);
	}
	
	
	@Override
	public Section sectionRead() {
		
		return sectionRead(null); 
	}
	
	
	@Override
	public Section sectionRead(Section section) {
		
		return adminSectionDao.sectionRead(section);
	}
	
	
	@Override
	public boolean sectionUpdate(Section section) {
		
		int sectionUpdateResult = adminSectionDao.sectionUpdate(section);
		
		if (sectionUpdateResult > 0) {
			
			return true;
		}
		
		
		return false; 
	}


	@Override
	public boolean sectionUpdate(Section section, HttpServletRequest httpServletRequest) {
		
		LoginVO loginVO = (LoginVO)EgovUserDetailsHelper.getAuthenticatedUser();
		
		section.setUpdateId(loginVO.getUniqId());
		

		return sectionUpdate(section);		
	}


	@Override
	public boolean sectionDelete(Section section) {
		
		int sectionDeleteResult = adminSectionDao.sectionDelete(section);
		
		if (sectionDeleteResult > 0) {
			
			return true;
		}
		
		
		return false; 
	}


	@Override
	public boolean sectionDelete(Section section, HttpServletRequest httpServletRequest) {
		
		LoginVO loginVO = (LoginVO)EgovUserDetailsHelper.getAuthenticatedUser();
		
		section.setUpdateId(loginVO.getUniqId());
		

		return sectionDelete(section);
	}
	
	
	@Override
	public boolean sectionDelete(String siteCode, HttpServletRequest httpServletRequest) {
		
		Section section = new Section();
		
		section.setSiteCode(siteCode);
		
		LoginVO loginVO = (LoginVO)EgovUserDetailsHelper.getAuthenticatedUser();
		
		section.setUpdateId(loginVO.getUniqId());
		

		return sectionDelete(section);
	}
	
}
