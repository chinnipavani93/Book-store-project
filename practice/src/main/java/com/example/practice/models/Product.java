package com.example.practice.models;

import java.util.*; 

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
//models
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
//@Table(name="product")

public class Product {
	public Product( String name, String brand, String category , double price , String description ,Date createdAt ,String imageFieldName) {
		super();
		this.name = name;
		this.brand=brand;
		this.category=category;
		this.price = price;
		this.description = description;
		this.createdAt=createdAt;
		this.imageFieldName=imageFieldName;
		
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setImageFieldName(String imageFieldName) {
		this.imageFieldName = imageFieldName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public String getImageFieldName() {
		return imageFieldName;
	}
	public void setImageFieldname(String imageFieldName) {
		this.imageFieldName = imageFieldName;
	}

	
	private String name;
	private String brand;
	private String category;
	private double price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String description;	
	private Date createdAt;
	private String imageFieldName;

}
