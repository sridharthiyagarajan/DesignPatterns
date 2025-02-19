package com.learn.it.designpatterns.behavioural.iterator;

import java.util.Iterator;

public class IteratorMain {

	public static void main(String[] args) {

		BookList bookList = new BookList();
		bookList.addBook(new Book("Java"));
		bookList.addBook(new Book("AWS"));
		bookList.addBook(new Book("XML"));

		Iterator<Book> bookIterator = bookList.createIterator();

		while (bookIterator.hasNext()) {
			System.out.println(bookIterator.next());
		}
	}

}
