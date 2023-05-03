package com.example.bookStore.controller;

import com.example.bookStore.dto.BookOrderRequest;
import com.example.bookStore.model.Book;
import com.example.bookStore.model.Order;
import com.example.bookStore.service.BookService;
import com.example.bookStore.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookstore")
public class BookStoreController {
    private final OrderService orderService;
    private final BookService bookService;

    public BookStoreController(OrderService orderService, BookService bookService) {
        this.orderService = orderService;
        this.bookService = bookService;
    }

    @GetMapping("/AllBook")
    public List<Book> getBookList(){
        return bookService.getBookList();
    }

    @PostMapping
    public ResponseEntity<Order> putAnOrder(@RequestBody BookOrderRequest bookOrderRequest){
        Order order=orderService.putAnOrder(bookOrderRequest.getBookIdList(),bookOrderRequest.getUsername());
        return ResponseEntity.ok(order);
    }
}
