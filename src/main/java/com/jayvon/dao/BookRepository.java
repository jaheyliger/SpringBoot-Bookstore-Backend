package com.jayvon.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jayvon.springbootlibrary.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    
}
