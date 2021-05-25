package com.springboot.jpa.bookcrud.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.jpa.bookcrud.entities.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

	public Book findById(int id);
}
