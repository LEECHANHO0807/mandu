package com.mandu.cms.user.meta.service;

import com.mandu.cms.admin.function.meta.domain.Meta;


public interface UserMetaService {
	

	Meta metaInformation();

	Meta metaInformation(Meta meta);
	
	Meta metaInformation(String siteCode);
	
}
