package com.learn.it.designpatterns.behavioural.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookList {

	private List<Book> bookList;

	public BookList() {
		this.bookList = new ArrayList<Book>();
	}

	public void addBook(Book book) {
		this.bookList.add(book);
	}

	public List<Book> getBooks() {
		return this.bookList;
	}

	public BookListIterator createIterator() {
		return new BookListIterator(getBooks());
	}

	private class BookListIterator implements Iterator<Book> {

		private List<Book> books;

		private int position;

		public BookListIterator(List<Book> books) {
			this.books = books;
		}

		@Override
		public boolean hasNext() {
			return position < books.size();
		}

		@Override
		public Book next() {
			return books.get(position++);
		}

	}

}
