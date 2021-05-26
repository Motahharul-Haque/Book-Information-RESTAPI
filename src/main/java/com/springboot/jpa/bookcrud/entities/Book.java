package com.springboot.jpa.bookcrud.entities;

import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "books")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Book_Id")
	private int id;
	@Column(name = "title")
	private String title;
	@OneToOne(cascade = CascadeType.ALL)
	private Author author;
	@Column(name = "publisher")
	private String publisher;
	@Column(name = "price")
	private float price;
	@Column(name = "edition")
	private String edition;
	@Column(name = "isbn")
	private String isbn;
	@Column(name = "pages")
	private int pages;
	@Column(name = "country_Restrictions")
	@ElementCollection
	private List<String> country_Restrictions;
	@ElementCollection
	@Column(name = "ratings")
	private Map<String, Float> ratings;

	public Book() {
		super();

	}

	public Book(int id, String title, Author author, String publisher, float price, String edition, String isbn,
			int pages, List<String> country_Restrictions, Map<String, Float> ratings) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.edition = edition;
		this.isbn = isbn;
		this.pages = pages;
		this.country_Restrictions = country_Restrictions;
		this.ratings = ratings;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public List<String> getCountry_Restrictions() {
		return country_Restrictions;
	}

	public void setCountry_Restrictions(List<String> country_Restrictions) {
		this.country_Restrictions = country_Restrictions;
	}

	public Map<String, Float> getRatings() {
		return ratings;
	}

	public void setRatings(Map<String, Float> ratings) {
		this.ratings = ratings;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", publisher=" + publisher + ", price="
				+ price + ", edition=" + edition + ", isbn=" + isbn + ", pages=" + pages + ", country_Restrictions="
				+ country_Restrictions + ", ratings=" + ratings + "]";
	}

	

}
