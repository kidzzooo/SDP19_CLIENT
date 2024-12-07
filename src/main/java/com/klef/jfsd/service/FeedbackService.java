package com.klef.jfsd.service;

import java.util.List;

import com.klef.jfsd.model.Feedback;

public interface FeedbackService {
    Feedback saveFeedback(Feedback feedback);
    Feedback getFeedbackById(Long id);
    List<Feedback> getAllFeedback();
    List<Feedback> getFeedbackByUserId(Long userId);
    List<Feedback> getFeedbackByContentId(Long contentId);
    void deleteFeedbackById(Long id);
}

