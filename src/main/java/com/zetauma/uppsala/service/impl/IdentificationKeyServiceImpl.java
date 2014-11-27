package com.zetauma.uppsala.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zetauma.uppsala.model.IdentificationKey;
import com.zetauma.uppsala.repository.IdentificationKeyRepository;
import com.zetauma.uppsala.service.IdentificationKeyService;

@Service
public class IdentificationKeyServiceImpl implements IdentificationKeyService {
	@Autowired
	private IdentificationKeyRepository idKeyRepository;

	public IdentificationKeyRepository getIdentificationKeyRepository() {
		return idKeyRepository;
	}
	
	public void setIdentificationKeyRepository(IdentificationKeyRepository idKeyRepository) {
		this.idKeyRepository = idKeyRepository;
	}
	
	@Override
	public boolean insertIdentificationKey(IdentificationKey idKey) {
		idKeyRepository.insertIdentificationKey(idKey);
		return false;
	}

	@Override
	public List<IdentificationKey> getFindAllIdentificationKeys(IdentificationKey idKey) {
		return idKeyRepository.findAllIdentificationKeys(idKey);
	}

	@Override
	public IdentificationKey getFindIdentificationKeyById(BigDecimal id) {
		return idKeyRepository.findIdentificationKeyById(id);
	}

	@Override
	public boolean getUpdateIdentificationKey(IdentificationKey oldIdKey, IdentificationKey newIdKey) {
		idKeyRepository.updateIdentificationKey(oldIdKey, newIdKey);
		return false;
	}

	@Override
	public boolean getRemoveIdentificationKey(IdentificationKey idKey) {
		idKeyRepository.removeIdentificationKey(idKey);
		return false;
	}
}
