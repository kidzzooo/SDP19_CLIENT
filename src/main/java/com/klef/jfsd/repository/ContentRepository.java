package com.klef.jfsd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.jfsd.model.Content;

import jakarta.mail.internet.ContentType;

public interface ContentRepository extends JpaRepository<Content, Long> {
    // Find content by author
    List<Content> findByAuthor(String author);

    // Find content by content type
    List<Content> findByContentType(ContentType contentType);
}
