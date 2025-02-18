package com.learn.it.designpatterns.iterator;

public class Book {

	private String title;

	public Book(String title) {
		this.title = title;
	}

	public String getTitle() {
		return this.title;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}

}
