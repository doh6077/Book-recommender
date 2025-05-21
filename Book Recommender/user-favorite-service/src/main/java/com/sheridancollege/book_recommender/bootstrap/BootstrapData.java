package com.sheridancollege.book_recommender.bootstrap;

import org.springframework.boot.CommandLineRunner;

import com.sheridancollege.book_recommender.domain.Book;
import com.sheridancollege.book_recommender.domain.repositories.BookRepository;

public class BootstrapData implements CommandLineRunner {

    private BookRepository firefighterRepo;
	@Override
	public void run(String... args) throws Exception {
		firefighterRepo.save(Book.builder().name("Book1").build());
        firefighterRepo.save(Book.builder().name("Book").build());
        firefighterRepo.save(Book.builder().name("Book").build());
		

		

	}

}
