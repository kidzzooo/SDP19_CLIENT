package com.klef.jfsd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.model.Content;
import com.klef.jfsd.repository.ContentRepository;

import jakarta.mail.internet.ContentType;

@Service
public class ContentServiceImpl implements ContentService {

    private final ContentRepository contentRepository;

    @Autowired
    public ContentServiceImpl(ContentRepository contentRepository) {
        this.contentRepository = contentRepository;
    }

    @Override
    public Content saveContent(Content content) {
        return contentRepository.save(content);
    }

    @Override
    public Content getContentById(Long id) {
        return contentRepository.findById(id).orElseThrow(() -> new RuntimeException("Content not found"));
    }

    @Override
    public List<Content> getAllContent() {
        return contentRepository.findAll();
    }

    @Override
    public List<Content> getContentByAuthor(String author) {
        return contentRepository.findByAuthor(author);
    }

    @Override
    public List<Content> getContentByType(ContentType contentType) {
        return contentRepository.findByContentType(contentType);
    }

    @Override
    public void deleteContentById(Long id) {
        contentRepository.deleteById(id);
    }
}
