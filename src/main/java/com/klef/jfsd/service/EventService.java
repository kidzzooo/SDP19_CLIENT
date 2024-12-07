package com.klef.jfsd.service;

import java.time.LocalDateTime;
import java.util.List;

import com.klef.jfsd.model.Event;

public interface EventService {
    Event saveEvent(Event event);
    Event getEventById(Long id);
    List<Event> getAllEvents();
    List<Event> getEventsByEducatorId(Long educatorId);
    List<Event> getEventsAfterDate(LocalDateTime date);
    void deleteEventById(Long id);
}

