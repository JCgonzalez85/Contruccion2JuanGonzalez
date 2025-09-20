package app.domain.model;

import java.sql.Date;

public class ClinicalOrder {
	private long id; 
	private String orderNumber;
	private Patient document;
	private Date date;
	private User doctors;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public Patient getDocument() {
		return document;
	}
	public void setDocument(Patient document) {
		this.document = document;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public User getDoctors() {
		return doctors;
	}
	public void setDoctors(User doctors) {
		this.doctors = doctors;
	}
	
	
}
