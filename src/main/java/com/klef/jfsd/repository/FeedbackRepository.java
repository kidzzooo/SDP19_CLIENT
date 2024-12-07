package com.klef.jfsd.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.jfsd.model.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    // Find feedback by user ID
    List<Feedback> findByUserId(Long userId);

    // Find feedback for a specific content
    List<Feedback> findByContentId(Long contentId);
}

