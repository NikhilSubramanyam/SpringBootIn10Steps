package com.nikhil.springboot.basic.SpringBootIn10Steps;

public class Books {
	
	long id;
	String title;
	String author;
	
	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public Books(long id, String title, String author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
	}

}
