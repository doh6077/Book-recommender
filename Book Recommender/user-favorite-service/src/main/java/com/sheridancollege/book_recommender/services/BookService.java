package com.sheridancollege.book_recommender.services;

import java.util.List;


import com.sheridancollege.book_recommender.domain.Book;

public interface BookService {
	public List<Book> findAll();
	public Book findById(Long id); 
	public Book save(Book book);
}
