package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}