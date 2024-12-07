package com.klef.jfsd.service;

import java.util.List;

import com.klef.jfsd.model.Content;

import jakarta.mail.internet.ContentType;

public interface ContentService {
    Content saveContent(Content content);
    Content getContentById(Long id);
    List<Content> getAllContent();
    List<Content> getContentByAuthor(String author);
    List<Content> getContentByType(ContentType contentType);
    void deleteContentById(Long id);
}

