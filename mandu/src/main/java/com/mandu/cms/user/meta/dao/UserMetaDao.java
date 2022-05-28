package com.mandu.cms.user.meta.dao;

import org.springframework.stereotype.Repository;

import com.mandu.cms.abstracts.AbstractDAO;
import com.mandu.cms.admin.function.meta.domain.Meta;



@Repository("userMetaDao")
public class UserMetaDao extends AbstractDAO {
	
	
	public Meta metaInformation(Meta meta) {
		
		return selectOne("userMeta.metaInformation", meta);
	}

}
