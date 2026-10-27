package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.BookDto;
import com.example.demo.entity.Book;
import com.example.demo.serivce.BookService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping ("/Book")
public class BookController {
private final BookService bookService;
public BookController(BookService bookSerivce) {
	this.bookService=bookSerivce;
}
@GetMapping
public List<Book> getAll(){
	return bookService.getAll();
}
@GetMapping ("/{id}")
public Book getById(@PathVariable Long id) {
	return bookService.getById(id);	
}
@PutMapping ("/{id}")
public Book putBook(@PathVariable Long id, @RequestBody Book book) {
	return bookService.updateBook(book, id);	
}
@PostMapping
public Book addBook(@Valid @RequestBody BookDto bookDTO) {

    return bookService.createBook(bookDTO);
}
@DeleteMapping("/{id}")
public void removeBook(@PathVariable Long id) {
	bookService.removed(id);
}

}
