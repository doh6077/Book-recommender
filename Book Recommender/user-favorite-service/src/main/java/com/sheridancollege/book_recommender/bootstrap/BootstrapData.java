package com.sheridancollege.book_recommender.bootstrap;

import org.springframework.boot.CommandLineRunner;

import com.sheridancollege.book_recommender.domain.Book;
import com.sheridancollege.book_recommender.domain.repositories.BookRepository;

public class BootstrapData implements CommandLineRunner {

    private BookRepository firefighterRepo;
	@Override
	public void run(String... args) throws Exception {
		firefighterRepo.save(Book.builder().title("Book1").author("author1").description("description1").build());
        firefighterRepo.save(Book.builder().title("Book2").author("author2").description("description1").build());
        firefighterRepo.save(Book.builder().title("Book3").author("author3").description("description1").build());
		

		

	}

}
