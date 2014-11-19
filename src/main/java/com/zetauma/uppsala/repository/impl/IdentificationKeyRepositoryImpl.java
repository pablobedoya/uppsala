package com.zetauma.uppsala.repository.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.zetauma.uppsala.model.IdentificationKey;
import com.zetauma.uppsala.repository.IdentificationKeyRepository;

@Repository
public class IdentificationKeyRepositoryImpl implements IdentificationKeyRepository {
	@Autowired
	private MongoTemplate mongoTemplate;
	
	private static final String COLLECTION_NAME = "identification_key";

	public void insertIdentificationKey(IdentificationKey idKey) {
		mongoTemplate.insert(idKey, COLLECTION_NAME);
	}

	public List<IdentificationKey> findAllIdentificationKeys(IdentificationKey idKey) {
		return mongoTemplate.findAll(IdentificationKey.class, COLLECTION_NAME);
	}
	
	public IdentificationKey findIdentificationKeyById(IdentificationKey idKey) {
		Criteria criteria = Criteria.where("id").is(idKey.getId());
		Query query = new Query(criteria);
		return mongoTemplate.findOne(query, IdentificationKey.class, COLLECTION_NAME);
	}

	public void updateIdentificationKey(IdentificationKey oldIdKey, IdentificationKey newIdKey) {
		Criteria criteria = Criteria.where("id").is(oldIdKey.getId());
		Query query = new Query(criteria);
		Update update = new Update();
		update.set("key", newIdKey.getKey());
		update.set("author", newIdKey.getAuthor());
		mongoTemplate.updateFirst(query, update, COLLECTION_NAME);
	}

	public void removeIdentificationKey(IdentificationKey idKey) {
		mongoTemplate.remove(idKey, COLLECTION_NAME);
	}
}
