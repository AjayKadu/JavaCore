package com.sunbeam;

import java.util.Objects;

public class Book implements Comparable<Book> {
       
	private int id;
	private String book;
	private String subject;
	private double price;
	
	public Book(int id, String book, String subject, double price) {
		this.id = id;
		this.book = book;
		this.subject = subject;
		this.price = price;
	}
	
	public Book() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", book=" + book + ", subject=" + subject + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Book o) {
		int diff = this.id-o.id;
		return diff;
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(id);
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return id == other.id;
	}
	
	
	
	
	
}
