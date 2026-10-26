
package com.example.demo.serivce;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Repo.BookRepo;
import com.example.demo.entity.Book;

@Service
public class BookService {

    private final BookRepo bookRepo;

    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public List<Book> getAll() {
        return bookRepo.findAll();
    }

    public Book getById(Long id) {
        return bookRepo.findById(id).orElse(null);
    }

    public Book createBook(Book book) {
        return bookRepo.save(book);
    }

    public Book updateBook(Book book, Long id) {
        if (!bookRepo.existsById(id)) {
            return null;
        }

        book.setId(id);
        return bookRepo.save(book);
    }

    public void removed(Long id) {
        bookRepo.deleteById(id);
    }
}
