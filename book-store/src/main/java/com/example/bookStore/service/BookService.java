package com.example.bookStore.service;

import com.example.bookStore.model.Book;
import com.example.bookStore.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public Optional<Book> findBookById(Integer bookId){
        return bookRepository.findById(bookId);
    }
    public List<Book> getBookList(){
        return bookRepository.findAll();
    }
}
