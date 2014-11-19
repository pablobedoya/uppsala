package com.zetauma.uppsala.repository;

import java.util.List;

import com.zetauma.uppsala.model.IdentificationKey;

public interface IdentificationKeyRepository {
	public void insertIdentificationKey(IdentificationKey idKey);
	
	public List<IdentificationKey> findAllIdentificationKeys(IdentificationKey idKey);
	
	public IdentificationKey findIdentificationKeyById(IdentificationKey idKey);
	
	public void updateIdentificationKey(IdentificationKey oldIdKey, IdentificationKey newIdKey);
	
	public void removeIdentificationKey(IdentificationKey idKey);
}
