package com.hrms.entity;

import java.io.Serializable;

public class Dictionary implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String classification;
	private String item;
	private String value;
	private String editable;
	
	
	public Dictionary() {
	}
	public Dictionary(int id, String classification, String item, String value, String editable) {
		this.id = id;
		this.classification = classification;
		this.item = item;
		this.value = value;
		this.editable = editable;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getEditable() {
		return editable;
	}
	public void setEditable(String editable) {
		this.editable = editable;
	}
	
	

}
