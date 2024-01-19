package com.example.book.BookManagementSystems;

import java.time.LocalDate;
import java.time.Month;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.example.book.entity.Admin;
import com.example.book.entity.Book;
import com.example.book.entity.Member;
import com.example.book.entity.Records;


public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		try 
		{
         
        Admin admin= new Admin();
        admin.setName("Nandkishore chaubey");
        admin.setPhone_No("8834567823");
        
        Admin admin1= new Admin();
        admin1.setName("Bishwajit Biswas");
        admin1.setPhone_No("9934567823");
        
        Admin admin2= new Admin();
        admin2.setName("Anirudh Roy");
        admin2.setPhone_No("9524567823");
        
        
        
        Member member= new Member();
        member.setFirst_Name("Sweeta");
        member.setLast_Name("Kumari");
        member.setEmail("Sweeta10@gmal.com");
        member.setPhone_no("93408976231");
        member.setAddress("Bidhan Nagar");
        
        Member member1= new Member();
        member1.setFirst_Name("Priya");
        member1.setLast_Name("Mondal");
        member1.setEmail("Priya23@gmal.com");
        member1.setPhone_no("9440573424");
        member1.setAddress("Kalikapur");
        
        Member member2= new Member();
        member2.setFirst_Name("Rahul");
        member2.setLast_Name("Dubey");
        member2.setEmail("Rahul12@gmal.com");
        member2.setPhone_no("9330457865");
        member2.setAddress("Ruby");
        
        Member member3= new Member();
        member3.setFirst_Name("Roshni");
        member3.setLast_Name("Kumari");
        member3.setEmail("Roshni33@gmal.com");
        member3.setPhone_no("9120573424");
        member3.setAddress("Topsia");
        
        Member member4= new Member();
        member4.setFirst_Name("Shreya");
        member4.setLast_Name("Raha");
        member4.setEmail("Shreya@gmal.com");
        member4.setPhone_no("9470056644");
        member4.setAddress("Parkstreet");
        
        Member member5= new Member();
        member5.setFirst_Name("Priti");
        member5.setLast_Name("Mondal");
        member5.setEmail("Priti23@gmal.com");
        member5.setPhone_no("8440573424");
        member5.setAddress("Topsia");
        
        Member member6= new Member();
        member6.setFirst_Name("Amit");
        member6.setLast_Name("Roy");
        member6.setEmail("AmitRoy@gmal.com");
        member6.setPhone_no("9760573424");
        member6.setAddress("Gandhi Nagar");
        
        
        
        
        
        
        Book book = new Book();
        Records record = new Records();
        record.setIssueDate(LocalDate.of(2024,Month.JANUARY,1));
        record.setDueDate(LocalDate.of(2024,Month.FEBRUARY,5));
        record.setReturnDate(LocalDate.of(2024,Month.JANUARY,2));
        book.setName("Python Programming");
        book.setAuthorName("Reema Thareja");
        book.setBook_Price(500);
        book.setStatus("Available");
        book.setMember(member);
        book.setRecord(record);
        book.setAdmin(admin);
        
      
        Book book1 = new Book();
        Records record1 = new Records();
        record1.setIssueDate(LocalDate.of(2023,Month.DECEMBER,2));
        record1.setDueDate(LocalDate.of(2024,Month.JANUARY,20));
        record1.setReturnDate(LocalDate.of(2024,Month.JANUARY,10)); 
        book1.setName("C Programming");
        book1.setAuthorName("Ajay mittal");
        book1.setBook_Price(400);
        book1.setStatus(" Available");
        book1.setMember(member1);
        book1.setRecord(record1);
        book1.setAdmin(admin);
        
        
        Book book2 = new Book();
        Records record2 = new Records();
        record2.setIssueDate(LocalDate.of(2023,Month.DECEMBER,10));
        record2.setDueDate(LocalDate.of(2024,Month.JANUARY,31));
        record2.setReturnDate(LocalDate.of(2024,Month.JANUARY,25));     
        book2.setName("Human Anatomy");
        book2.setAuthorName("Dr.Ashvini kumar Dwivedi");
        book2.setBook_Price(550);
        book2.setStatus("Available");
        book2.setMember(member2);
        book2.setRecord(record2);
        book2.setAdmin(admin1);
        
        Book book3 = new Book();
        Records record3 = new Records();
        record3.setIssueDate(LocalDate.of(2024,Month.JANUARY,6));
        record3.setDueDate(LocalDate.of(2024,Month.FEBRUARY,28));
        record3.setReturnDate(LocalDate.of(2024,Month.MARCH,2));
        book3.setName("Monsoon");
        book3.setAuthorName("Abhay k");
        book3.setBook_Price(350);
        book3.setStatus("Not Available");
        book3.setMember(member3);
        book3.setRecord(record3);
        book3.setAdmin(admin2);
        
        Book book4 = new Book();
        Records record4 = new Records();
        record4.setIssueDate(LocalDate.of(2024,Month.JANUARY,17));
        record4.setDueDate(LocalDate.of(2024,Month.FEBRUARY,28));
        record4.setReturnDate(LocalDate.of(2024,Month.FEBRUARY,27));
        book4.setName("Build Don't Talk");
        book4.setAuthorName("Raj Shamani");
        book4.setBook_Price(500);
        book4.setStatus("Available");
        book4.setMember(member4);
        book4.setRecord(record4);
        book4.setAdmin(admin1);
        
        
        Book book5 = new Book();
        Records record5 = new Records();
        record5.setIssueDate(LocalDate.of(2023,Month.OCTOBER,17));
        record5.setDueDate(LocalDate.of(2023,Month.DECEMBER,28));
        record5.setReturnDate(LocalDate.of(2024,Month.JANUARY,2));
        book5.setName("Believe in Yourself");
        book5.setAuthorName("Dr Joshep Murphy");
        book5.setBook_Price(600);
        book5.setStatus("Not Available");
        book5.setMember(member4);
        book5.setRecord(record5);
        book5.setAdmin(admin2);
        
        
        
        
        
        member.getBook().add(book);
        member1.getBook().add(book1);
        member2.getBook().add(book2);
        member3.getBook().add(book4);
        member4.getBook().add(book4);
        member3.getBook().add(book3);
        member5.getBook().add(book5);
        member4.getBook().add(book5);        
        
        session.save(member);
        session.save(record);
        session.save(admin);
        session.save(member1);
        session.save(record1);
        session.save(admin1);
        session.save(member2);
        session.save(record2);
        session.save(admin1);
        session.save(member3);
        session.save(record3);
        session.save(admin2);
        session.save(member4);
        session.save(record4);
        session.save(admin2);
        session.save(member5);
        session.save(record5);
        
        
        
        
        session.getTransaction().commit();
        }
        finally 
        {
        	session.close();
        	sessionFactory.close();
        }
        
        
        
        
        
    }
 }
