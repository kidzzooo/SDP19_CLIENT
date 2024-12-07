package com.klef.jfsd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.model.Discussion;
import com.klef.jfsd.service.DiscussionService;

@RestController
@RequestMapping("/api/discussions")
public class DiscussionController {

    private final DiscussionService discussionService;

    @Autowired
    public DiscussionController(DiscussionService discussionService) {
        this.discussionService = discussionService;
    }

    @PostMapping
    public ResponseEntity<Discussion> createDiscussion(@RequestBody Discussion discussion) {
        return ResponseEntity.ok(discussionService.saveDiscussion(discussion));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Discussion> getDiscussionById(@PathVariable Long id) {
        return ResponseEntity.ok(discussionService.getDiscussionById(id));
    }

    @GetMapping
    public ResponseEntity<List<Discussion>> getAllDiscussions() {
        return ResponseEntity.ok(discussionService.getAllDiscussions());
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Discussion>> getDiscussionsByUserId(@PathVariable Long userId) {
        return ResponseEntity.ok(discussionService.getDiscussionsByUserId(userId));
    }

    @GetMapping("/topic/{topicId}")
    public ResponseEntity<List<Discussion>> getDiscussionsByTopicId(@PathVariable Long topicId) {
        return ResponseEntity.ok(discussionService.getDiscussionsByTopicId(topicId));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDiscussionById(@PathVariable Long id) {
        discussionService.deleteDiscussionById(id);
        return ResponseEntity.noContent().build();
    }
}

