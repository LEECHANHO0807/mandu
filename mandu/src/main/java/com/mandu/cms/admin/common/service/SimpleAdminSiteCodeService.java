package com.mandu.cms.admin.common.service;


import org.springframework.stereotype.Service;

import com.mandu.cms.admin.common.domain.SiteExtension;



@Service("adminSiteCodeService")
public class SimpleAdminSiteCodeService implements AdminSiteCodeService<SiteExtension> {

	
	@Override
	public boolean setSiteCode(SiteExtension type, String siteCode) {

		try {
			type.setSiteCode(siteCode);
			
		} catch (Exception e) {
			
			return false;
		}
		
		
		return true;
	}
	
	
}
