package com.klef.jfsd.service;

import java.util.List;

import com.klef.jfsd.model.Discussion;

public interface DiscussionService {
    Discussion saveDiscussion(Discussion discussion);
    Discussion getDiscussionById(Long id);
    List<Discussion> getAllDiscussions();
    List<Discussion> getDiscussionsByUserId(Long userId);
    List<Discussion> getDiscussionsByTopicId(Long topicId);
    void deleteDiscussionById(Long id);
}

