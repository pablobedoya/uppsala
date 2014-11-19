package com.zetauma.uppsala.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class IdentificationKey {

	@Id
	private BigDecimal id;
	private String key;
	private String author;

	public IdentificationKey() {
	}

	public IdentificationKey(BigDecimal id, String key, String author) {
		this.id = id;
		this.key = key;
		this.author = author;
	}

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
