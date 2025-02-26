package com.onlinebookshop.shop.model;
 
public class Book {
 
	private int id;
	private String title;
	private double price;
	private int authorId;
	public Book(int id, String title, double price, int authorId) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.authorId = authorId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

}