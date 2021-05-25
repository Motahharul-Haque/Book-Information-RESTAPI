package com.springboot.jpa.bookcrud.service;

import java.util.List;

import com.springboot.jpa.bookcrud.entities.Book;

public interface BookServiceInterface {

	public List<Book> getAllBooks();

	public Book getBookById(int id);

	public Book addABook(Book book);

	public void updateABook(Book book, int id);

	public void deleteAllBooks();

	public void deleteABook(int id);

}
