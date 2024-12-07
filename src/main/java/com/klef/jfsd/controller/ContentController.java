package com.klef.jfsd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.model.Content;
import com.klef.jfsd.service.ContentService;

import jakarta.mail.internet.ContentType;

@CrossOrigin
@RestController
@RequestMapping("/api/contents")
public class ContentController {

    private final ContentService contentService;

    @Autowired
    public ContentController(ContentService contentService) {
        this.contentService = contentService;
    }

    @PostMapping
    public ResponseEntity<Content> createContent(@RequestBody Content content) {
        return ResponseEntity.ok(contentService.saveContent(content));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Content> getContentById(@PathVariable Long id) {
        return ResponseEntity.ok(contentService.getContentById(id));
    }

    @GetMapping
    public ResponseEntity<List<Content>> getAllContents() {
        return ResponseEntity.ok(contentService.getAllContent());
    }

    @GetMapping("/author/{author}")
    public ResponseEntity<List<Content>> getContentsByAuthor(@PathVariable String author) {
        return ResponseEntity.ok(contentService.getContentByAuthor(author));
    }

    @GetMapping("/type/{type}")
    public ResponseEntity<List<Content>> getContentsByType(@PathVariable ContentType type) {
        return ResponseEntity.ok(contentService.getContentByType(type));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContentById(@PathVariable Long id) {
        contentService.deleteContentById(id);
        return ResponseEntity.noContent().build();
    }
}
