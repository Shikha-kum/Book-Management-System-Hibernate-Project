package com.example.book.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Book_id;
	
	@Column(name ="Book_Name", length =30)
	private String Name;
	
	@Column(name= "Author_Name", length = 30)
	private String AuthorName;
	
	private double Book_Price;
	
	@Column(name= "Book_Status",length= 30)
	private String status;
	
	@ManyToOne
	@JoinColumn(name="Admin_id")
	private Admin Admin;
	
	@ManyToOne
	@JoinColumn(name="Member_Id")
	private Member member;
	
	@OneToOne
	@JoinColumn(name="Record_Id")
	private Records record;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int book_id, String name, String authorName, double book_Price, String status,
			com.example.book.entity.Admin admin, Member member, Records record) {
		super();
		Book_id = book_id;
		Name = name;
		AuthorName = authorName;
		Book_Price = book_Price;
		this.status = status;
		Admin = admin;
		this.member = member;
		this.record = record;
	}

	public int getBook_id() {
		return Book_id;
	}

	public void setBook_id(int book_id) {
		Book_id = book_id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getAuthorName() {
		return AuthorName;
	}

	public void setAuthorName(String authorName) {
		AuthorName = authorName;
	}

	public double getBook_Price() {
		return Book_Price;
	}

	public void setBook_Price(double book_Price) {
		Book_Price = book_Price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Admin getAdmin() {
		return Admin;
	}

	public void setAdmin(Admin admin) {
		Admin = admin;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public Records getRecord() {
		return record;
	}

	public void setRecord(Records record) {
		this.record = record;
	}

	@Override
	public String toString() {
		return "Book [Book_id=" + Book_id + ", Name=" + Name + ", AuthorName=" + AuthorName + ", Book_Price="
				+ Book_Price + ", status=" + status + ", Admin=" + Admin + ", member=" + member + ", record=" + record
				+ "]";
	}
	
	
	

}
