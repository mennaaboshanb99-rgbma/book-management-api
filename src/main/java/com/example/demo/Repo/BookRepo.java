package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;

import com.example.demo.entity.Book;

public interface BookRepo extends JpaRepository<Book, Long> {

}
