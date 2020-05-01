package com.example.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
	
	private Category category;
	
}
