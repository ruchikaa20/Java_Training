package com.onlinebookshop.shop.model;
 
import java.util.Date;
 
public class Order {
	private int id;
	private int bookId;
	private int quantity;
	private Date orderDate;
	
	public Order() {
		super();
	}
	
	public Order(int id, int bookId, int quantity) {
		super();
		this.id = id;
		this.bookId = bookId;
		this.quantity = quantity;
	}
 
	public Order(int id, int bookId, int quantity, Date orderDate) {
		super();
		this.id = id;
		this.bookId = bookId;
		this.quantity = quantity;
		this.orderDate = orderDate;
	}
 
	public int getId() {
		return id;
	}
 
	public void setId(int id) {
		this.id = id;
	}
 
	public int getBookId() {
		return bookId;
	}
 
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
 
	public int getQuantity() {
		return quantity;
	}
 
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
 
	public Date getOrderDate() {
		return orderDate;
	}
 
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

 
}