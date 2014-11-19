package com.zetauma.uppsala.service;

import java.util.List;

import com.zetauma.uppsala.model.IdentificationKey;

public interface IdentificationKeyService {
	public boolean insertIdentificationKey(IdentificationKey idKey);
	
	public List<IdentificationKey> findAllIdentificationKeys(IdentificationKey idKey);
	
	public IdentificationKey findIdentificationKeyById(IdentificationKey idKey);
	
	public boolean updateIdentificationKey(IdentificationKey oldIdKey, IdentificationKey newIdKey);
	
	public boolean removeIdentificationKey(IdentificationKey idKey);
}
