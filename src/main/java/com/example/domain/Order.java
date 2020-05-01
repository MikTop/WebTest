package com.example.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Order {

	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private List<Goods> listOfGoods;
	
	private long priceSummary;
	
	private float discountFromOrder;
	
	private float discountSummary;
	
	private Date dateAt;
	
	private Date deliveryDate;
	
	private DeliveryStatus status;
	
}
