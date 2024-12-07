package com.klef.jfsd.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.jfsd.model.Event;

public interface EventRepository extends JpaRepository<Event, Long> {
    // Find events created by a specific educator
    List<Event> findByEducatorId(Long educatorId);

    // Find events after a specific date
    List<Event> findByEventDateAfter(LocalDateTime date);
}
