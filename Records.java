package com.example.book.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Records {
	
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name = "Record_Id")
	    private Long recordid;

	    
	    @Column(name = "issue_date")
	    private LocalDate issueDate;

		
	    @Column(name = "return_date")
	    private LocalDate returnDate;

	    
	    @Column(name = "due_date")
	    private LocalDate dueDate;
	    
	    @OneToOne(mappedBy="record",cascade=CascadeType.ALL)
		private Book book;

		public Long getRecordid() {
			return recordid;
		}

		public void setRecordid(Long recordid) {
			this.recordid = recordid;
		}

		public LocalDate getIssueDate() {
			return issueDate;
		}

		public void setIssueDate(LocalDate issueDate) {
			this.issueDate = issueDate;
		}

		public LocalDate getReturnDate() {
			return returnDate;
		}

		public void setReturnDate(LocalDate returnDate) {
			this.returnDate = returnDate;
		}

		public LocalDate getDueDate() {
			return dueDate;
		}

		public void setDueDate(LocalDate dueDate) {
			this.dueDate = dueDate;
		}

		public Book getBook() {
			return book;
		}

		public void setBook(Book book) {
			this.book = book;
		}

		@Override
		public String toString() {
			return "Records [recordid=" + recordid + ", issueDate=" + issueDate + ", returnDate=" + returnDate
					+ ", dueDate=" + dueDate + ", book=" + book + "]";
		}
	    
	    

}
