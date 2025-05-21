package com.sheridancollege.book_recommender.web.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sheridancollege.book_recommender.domain.Book;
import com.sheridancollege.book_recommender.services.BookService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.AllArgsConstructor;
import java.util.List;


@RestController
@AllArgsConstructor 
@RequestMapping("/api/books")
public class BookController {

    private BookService bookService;
    
	@GetMapping("")
	public List<Book> getBooks() {
		List<Book> books = bookService.findAll();
		return books; 
	}
	
	@GetMapping("/{id}")
	public Book getBookById(@PathVariable Long id) {
		Book Book = bookService.findById(id);
		return Book; 
		
	}
	
	@PostMapping
	public Book postBook(@RequestBody Book book) {
		book.setId(null);
		return bookService.save(book);
	}    

}
