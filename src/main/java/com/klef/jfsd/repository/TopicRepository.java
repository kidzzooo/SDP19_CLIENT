package com.klef.jfsd.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.jfsd.model.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long> {
    // Find topics containing a specific keyword in the title
    List<Topic> findByTitleContaining(String keyword);
}
