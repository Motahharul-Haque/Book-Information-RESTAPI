package com.springboot.jpa.bookcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.jpa.bookcrud.entities.Book;
import com.springboot.jpa.bookcrud.service.BookServiceInterface;

@RestController
public class BookController {

	@Autowired
	private BookServiceInterface bookServiceInterface;

	@GetMapping("/books")
	public List<Book> getBooks() {
		return bookServiceInterface.getAllBooks();
	}

	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable("id") int id) {
		return bookServiceInterface.getBookById(id);
	}

	@PostMapping("/books")
	public Book addBook(@RequestBody Book book) {
		return bookServiceInterface.addABook(book);
	}

	@PutMapping("/books/{id}")
	public void updateBook(@RequestBody Book book, @PathVariable("id") int id) {
		System.out.println("I'm here..");
		bookServiceInterface.updateABook(book, id);
	}

	@DeleteMapping("/books")
	public void deleteBooks() {
		bookServiceInterface.deleteAllBooks();
	}

	@DeleteMapping("/books/{id}")
	public void deleteBook(@PathVariable("id") int id) {
		bookServiceInterface.deleteABook(id);
	}

}
