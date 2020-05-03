package com.example.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Goods {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private double price;
	
	private double discount;
	
	private int availableCount;
	
	private boolean isPost;
	
	private Date deliveryDate;
	
	private String description;
	
	@OneToOne
	private Category category;

	
	public Goods() {
		super();
		
	}


	public Goods(double price, double discount, int availableCount, boolean isPost, Date deliveryDate,
			String description, Category category) {
		super();
		this.price = price;
		this.discount = discount;
		this.availableCount = availableCount;
		this.isPost = isPost;
		this.deliveryDate = deliveryDate;
		this.description = description;
		this.category = category;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		this.discount = discount;
	}


	public int getAvailableCount() {
		return availableCount;
	}


	public void setAvailableCount(int availableCount) {
		this.availableCount = availableCount;
	}


	public boolean isPost() {
		return isPost;
	}


	public void setPost(boolean isPost) {
		this.isPost = isPost;
	}


	public Date getDeliveryDate() {
		return deliveryDate;
	}


	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}
	
	
	
	
}
