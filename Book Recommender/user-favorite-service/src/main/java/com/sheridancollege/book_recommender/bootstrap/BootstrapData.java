package com.sheridancollege.book_recommender.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.sheridancollege.book_recommender.domain.Book;
import com.sheridancollege.book_recommender.domain.repositories.BookRepository;

@Component
public class BootstrapData implements CommandLineRunner {

    private final BookRepository bookRepository;

    public BootstrapData(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        bookRepository.save(Book.builder().title("Book1").author("author1").description("description1").build());
        bookRepository.save(Book.builder().title("Book2").author("author2").description("description1").build());
        bookRepository.save(Book.builder().title("Book3").author("author3").description("description1").build());
    }
}