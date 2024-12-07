package com.klef.jfsd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.model.Discussion;
import com.klef.jfsd.repository.DiscussionRepository;

@Service
public class DiscussionServiceImpl implements DiscussionService {

    private final DiscussionRepository discussionRepository;

    @Autowired
    public DiscussionServiceImpl(DiscussionRepository discussionRepository) {
        this.discussionRepository = discussionRepository;
    }

    @Override
    public Discussion saveDiscussion(Discussion discussion) {
        return discussionRepository.save(discussion);
    }

    @Override
    public Discussion getDiscussionById(Long id) {
        return discussionRepository.findById(id).orElseThrow(() -> new RuntimeException("Discussion not found"));
    }

    @Override
    public List<Discussion> getAllDiscussions() {
        return discussionRepository.findAll();
    }

    @Override
    public List<Discussion> getDiscussionsByUserId(Long userId) {
        return discussionRepository.findByUserId(userId);
    }

    @Override
    public List<Discussion> getDiscussionsByTopicId(Long topicId) {
        return discussionRepository.findByTopicId(topicId);
    }

    @Override
    public void deleteDiscussionById(Long id) {
        discussionRepository.deleteById(id);
    }
}

