package com.example.practice.models;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class ProductDto {
	@NotEmpty(message="The name is required")
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	private String brand;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@NotEmpty(message="Category is notempty")
	private String category;
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Min(0)
	private double price;
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
	public MultipartFile getImageFieldName() {
		return ImageFieldName;
	}
	public void setImageFieldName(MultipartFile imageFieldName) {
		ImageFieldName = imageFieldName;
	}
	@Size(min=10,message="The description must be minimum 10 letters")
	@Size(max=2000,message="The description can be maximum 20000 letters")
	private String description;
	private MultipartFile ImageFieldName;	

}
