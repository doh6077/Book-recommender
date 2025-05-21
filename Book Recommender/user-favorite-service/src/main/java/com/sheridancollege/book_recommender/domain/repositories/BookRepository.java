package com.sheridancollege.book_recommender.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sheridancollege.book_recommender.domain.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
