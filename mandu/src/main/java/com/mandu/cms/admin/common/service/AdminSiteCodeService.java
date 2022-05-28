package com.mandu.cms.admin.common.service;

import com.mandu.cms.admin.common.domain.SiteExtension;


public interface AdminSiteCodeService<T extends SiteExtension> {

	
	boolean setSiteCode(T type, String siteCode);
	
	
}