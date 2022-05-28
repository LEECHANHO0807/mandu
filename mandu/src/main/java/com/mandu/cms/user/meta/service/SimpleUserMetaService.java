package com.mandu.cms.user.meta.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mandu.cms.admin.function.meta.domain.Meta;
import com.mandu.cms.user.meta.dao.UserMetaDao;



@Service("userMetaService")
public class SimpleUserMetaService  implements UserMetaService {
	
	
	@Resource(name="userMetaDao")
	UserMetaDao userMetaDao;
	
	
	
	
	@Override
	public Meta metaInformation() {
		
		return userMetaDao.metaInformation(null); 
	}
	
	
	@Override
	public Meta metaInformation(Meta meta) {
		
		return userMetaDao.metaInformation(meta);
	}
	
	
	@Override
	public Meta metaInformation(String siteCode) {
		
		Meta meta = new Meta();
		
		meta.setSiteCode(siteCode);
		
		
		return metaInformation(meta);
	}
	
	
}