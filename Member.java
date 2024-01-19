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
public class Member {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Member_Id;
	
	@Column(name= "FirstName", length= 30)
	private String first_Name;
	
	@Column(name= "LastName", length= 30)
	private String last_Name;
	
	@Column(length=50)
	private String email;
	
	@Column(length= 20)
	private String Phone_no;
	
	@Column(length= 60)
	private String Address;
	
	@OneToMany(mappedBy = "member",cascade=CascadeType.ALL)
	private  List<Book> book = new ArrayList<Book>();

	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Member(int member_Id, String first_Name, String last_Name, String email, String phone_no, String address,
			List<Book> book) {
		super();
		Member_Id = member_Id;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.email = email;
		Phone_no = phone_no;
		Address = address;
		this.book = book;
	}

	public int getMember_Id() {
		return Member_Id;
	}

	public void setMember_Id(int member_Id) {
		Member_Id = member_Id;
	}

	public String getFirst_Name() {
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone_no() {
		return Phone_no;
	}

	public void setPhone_no(String phone_no) {
		Phone_no = phone_no;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public List<Book> getBook() {
		return book;
	}

	public void setBook(List<Book> book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Member [Member_Id=" + Member_Id + ", first_Name=" + first_Name + ", last_Name=" + last_Name + ", email="
				+ email + ", Phone_no=" + Phone_no + ", Address=" + Address + ", book=" + book + "]";
	}
	


}
