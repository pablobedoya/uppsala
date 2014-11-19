package com.zetauma.uppsala.service.impl;

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
	
	public boolean insertIdentificationKey(IdentificationKey idKey) {
		// TODO Auto-generated method stub
		idKeyRepository.insertIdentificationKey(idKey);
		return false;
	}

	public List<IdentificationKey> findAllIdentificationKeys(IdentificationKey idKey) {
		return idKeyRepository.findAllIdentificationKeys(idKey);
	}

	public IdentificationKey findIdentificationKeyById(IdentificationKey idKey) {
		return idKeyRepository.findIdentificationKeyById(idKey);
	}

	public boolean updateIdentificationKey(IdentificationKey oldIdKey, IdentificationKey newIdKey) {
		// TODO Auto-generated method stub
		idKeyRepository.updateIdentificationKey(oldIdKey, newIdKey);
		return false;
	}

	public boolean removeIdentificationKey(IdentificationKey idKey) {
		// TODO Auto-generated method stub
		idKeyRepository.removeIdentificationKey(idKey);
		return false;
	}
}
