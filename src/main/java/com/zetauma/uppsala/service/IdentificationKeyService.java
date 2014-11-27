package com.zetauma.uppsala.service;

import java.math.BigDecimal;
import java.util.List;

import com.zetauma.uppsala.model.IdentificationKey;

public interface IdentificationKeyService {
	public boolean insertIdentificationKey(IdentificationKey idKey);
	
	public List<IdentificationKey> getFindAllIdentificationKeys(IdentificationKey idKey);
	
	public IdentificationKey getFindIdentificationKeyById(BigDecimal id);
	
	public boolean getUpdateIdentificationKey(IdentificationKey oldIdKey, IdentificationKey newIdKey);
	
	public boolean getRemoveIdentificationKey(IdentificationKey idKey);
}
