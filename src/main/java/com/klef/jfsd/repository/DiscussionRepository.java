package com.klef.jfsd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.jfsd.model.Discussion;

public interface DiscussionRepository extends JpaRepository<Discussion, Long> {
    // Find discussions by user ID
    List<Discussion> findByUserId(Long userId);

    // Find discussions by topic ID
    List<Discussion> findByTopicId(Long topicId);
}

