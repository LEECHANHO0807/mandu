package com.mandu.cms.admin.function.meta.service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.mandu.cms.admin.function.meta.dao.AdminMetaDao;
import com.mandu.cms.admin.function.meta.domain.Meta;

import com.mandu.cms.login.LoginVO;
import com.mandu.cms.login.EgovUserDetailsHelper;


@Service("adminMetaService")
public class SimpleAdminMetaService implements AdminMetaService {
	
	
	@Resource(name="adminMetaDao")
	AdminMetaDao adminMetaDao;
	
	
	
	
	@Override
	public boolean metaCheck(Meta meta) {
		
		Integer metaCheckResult = adminMetaDao.metaCheck(meta);
		
		if (metaCheckResult > 0) {
			
			return true;
		}
		
		
		return false;
	}	
	
	
	@Override
	public boolean metaCreate(Meta meta) {
		
		int metaCreateResult = adminMetaDao.metaCreate(meta);
		
		if (metaCreateResult > 0) {
			
			return true;
		}
		
		
		return false;
	}


	@Override
	public boolean metaCreate(Meta meta, HttpServletRequest httpServletRequest) {
		
		LoginVO loginVO = (LoginVO)EgovUserDetailsHelper.getAuthenticatedUser();
		
		meta.setWriteId(loginVO.getUniqId());
		

		return metaCreate(meta);
	}
	
	
	@Override
	public Meta metaRead() {
		
		return metaRead(null); 
	}
	
	
	@Override
	public Meta metaRead(Meta meta) {
		
		return adminMetaDao.metaRead(meta);
	}
	
	
	@Override
	public boolean metaUpdate(Meta meta) {
		
		int metaUpdateResult = adminMetaDao.metaUpdate(meta);
		
		if (metaUpdateResult > 0) {
			
			return true;
		}
		
		
		return false; 
	}


	@Override
	public boolean metaUpdate(Meta meta, HttpServletRequest httpServletRequest) {
		
		LoginVO loginVO = (LoginVO)EgovUserDetailsHelper.getAuthenticatedUser();
		
		meta.setUpdateId(loginVO.getUniqId());
		

		return metaUpdate(meta);		
	}
	
	
}