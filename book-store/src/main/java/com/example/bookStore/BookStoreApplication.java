package com.example.bookStore;

import com.example.bookStore.model.Book;
import com.example.bookStore.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BookStoreApplication implements CommandLineRunner {
	private final BookRepository bookRepository;

	public BookStoreApplication(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book book1=Book.builder()
				.name("Arxali Canavar")
				.author("Elxan Elatli")
				.price(12.0)
				.stock(10).build();

		Book book2=Book.builder()
				.name("A")
				.author("Qaraqan")
				.price(10.0)
				.stock(8).build();

		Book book3=Book.builder()
				.name("War and Peace")
				.author("Leo Tolstoy")
				.price(15.5)
				.stock(5).build();

		bookRepository.saveAll(Arrays.asList(book1,book2,book3));

	}
}
