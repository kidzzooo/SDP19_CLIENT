package com.klef.jfsd.service;

import java.util.List;

import com.klef.jfsd.model.Topic;

public interface TopicService {
    Topic saveTopic(Topic topic);
    Topic getTopicById(Long id);
    List<Topic> getAllTopics();
    List<Topic> getTopicsByTitle(String keyword);
    void deleteTopicById(Long id);
}

