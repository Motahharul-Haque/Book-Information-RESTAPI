package com.springboot.jpa.bookcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.jpa.bookcrud.dao.BookRepository;
import com.springboot.jpa.bookcrud.entities.Book;

@Service
public class BookService implements BookServiceInterface {

	@Autowired
	private BookRepository bookRepository;

	@Override
	public List<Book> getAllBooks() {
		return (List<Book>) bookRepository.findAll();
	}

	@Override
	public Book getBookById(int id) {

		return bookRepository.findById(id);
	}

	@Override
	public Book addABook(Book book) {
		Book bk = null;
		try {
			bk = bookRepository.save(book);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bk;
	}

	@Override
	public void updateABook(Book book, int id) {
		/*
		 * Book bk = bookRepository.findById(id); System.out.println("statted..."); if
		 * (bk.getId() == id) { System.out.println("updating");
		 * bk.setTitle(book.getTitle()); bk.setAuthor(book.getAuthor());
		 * bk.setPublisher(book.getPublisher()); bk.setPrice(book.getPrice());
		 * bk.setEdition(book.getEdition()); bk.setIsbn(book.getIsbn());
		 * bk.setPages(book.getPages());
		 * bk.setCountry_Restrictions(book.getCountry_Restrictions());
		 * bk.setRatings(book.getRatings()); bookRepository.save(bk); return book;
		 * 
		 * } else {
		 * 
		 * return null; }
		 */
		System.out.println("Ending");
		book.setId(id);
		bookRepository.save(book);
		
	}

	@Override
	public void deleteAllBooks() {

		bookRepository.deleteAll();
	}

	@Override
	public void deleteABook(int id) {
		bookRepository.deleteById(id);

	}
}
