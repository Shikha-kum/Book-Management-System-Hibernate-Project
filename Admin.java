package com.example.book.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Admin_id;
	 
	@Column(name= "Admin_Name",length=30)
	private String name;
	
	@Column(length= 20)
	private String phone_No; 
	
	@OneToMany(mappedBy="Admin", cascade=CascadeType.ALL)
	private List<Book> book = new ArrayList<Book>();

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(Long admin_id, String name, String phone_No, List<Book> book) {
		super();
		Admin_id = admin_id;
		this.name = name;
		this.phone_No = phone_No;
		this.book = book;
	}

	public Long getAdmin_id() {
		return Admin_id;
	}

	public void setAdmin_id(Long admin_id) {
		Admin_id = admin_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone_No() {
		return phone_No;
	}

	public void setPhone_No(String phone_No) {
		this.phone_No = phone_No;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Admin [Admin_id=" + Admin_id + ", name=" + name + ", phone_No=" + phone_No + ", book=" + book + "]";
	}
	
	
	
}
