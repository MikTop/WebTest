package com.example.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="User_Order")
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@ManyToMany
	private List<Goods> listOfGoods;
	
	private long priceSummary;
	
	private float discountFromOrder;
	
	private float discountSummary;
	
	private Date dateAt;
	
	private Date deliveryDate;
	
	@OneToOne
	private DeliveryStatus status;
	
	
	

	public Order() {
		super();
		
	}
	
	

	public Order(List<Goods> listOfGoods, long priceSummary, float discountFromOrder, float discountSummary,
			Date dateAt, Date deliveryDate, DeliveryStatus status) {
		super();
		this.listOfGoods = listOfGoods;
		this.priceSummary = priceSummary;
		this.discountFromOrder = discountFromOrder;
		this.discountSummary = discountSummary;
		this.dateAt = dateAt;
		this.deliveryDate = deliveryDate;
		this.status = status;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public List<Goods> getListOfGoods() {
		return listOfGoods;
	}

	public void setListOfGoods(List<Goods> listOfGoods) {
		this.listOfGoods = listOfGoods;
	}

	public long getPriceSummary() {
		return priceSummary;
	}

	public void setPriceSummary(long priceSummary) {
		this.priceSummary = priceSummary;
	}

	public float getDiscountFromOrder() {
		return discountFromOrder;
	}

	public void setDiscountFromOrder(float discountFromOrder) {
		this.discountFromOrder = discountFromOrder;
	}

	public float getDiscountSummary() {
		return discountSummary;
	}

	public void setDiscountSummary(float discountSummary) {
		this.discountSummary = discountSummary;
	}

	public Date getDateAt() {
		return dateAt;
	}

	public void setDateAt(Date dateAt) {
		this.dateAt = dateAt;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public DeliveryStatus getStatus() {
		return status;
	}

	public void setStatus(DeliveryStatus status) {
		this.status = status;
	}
	
	
	
	
}
