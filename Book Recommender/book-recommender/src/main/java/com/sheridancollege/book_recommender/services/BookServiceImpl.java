package com.sheridancollege.book_recommender.services;


import java.util.List;

import org.springframework.stereotype.Service;

import com.sheridancollege.book_recommender.domain.Book;
import com.sheridancollege.book_recommender.domain.repositories.BookRepository;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService{

    private BookRepository bookrepo; 

    @Override
	public List<Book> findAll(){
        return bookrepo.findAll();

    }

    @Override
	public Book findById(Long id){
        if (bookrepo.findById(id).isPresent())
            return bookrepo.findById(id).get();
        else
            return null;

    }

    @Override
	public Book save(Book book){
        return bookrepo.save(book);
    }
}
