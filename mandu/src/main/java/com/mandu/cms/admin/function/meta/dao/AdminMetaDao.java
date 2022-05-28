package com.mandu.cms.admin.function.meta.dao;

import org.springframework.stereotype.Repository;

import com.mandu.cms.abstracts.AbstractDAO;
import com.mandu.cms.admin.function.meta.domain.Meta;



@Repository("adminMetaDao")
public class AdminMetaDao extends AbstractDAO {
	
	
	public Integer metaCheck(Meta meta) {
		
		return selectOne("adminMeta.metaCheck", meta);
	}
	
	
	public int metaCreate(Meta meta) {
		
		return insert("adminMeta.metaCreate", meta);
	}
	
	
	public Meta metaRead(Meta meta) {
		
		return selectOne("adminMeta.metaRead", meta);
	}
	
	
	public int metaUpdate(Meta meta) {
		
		return update("adminMeta.metaUpdate", meta);
	}
	
	
}