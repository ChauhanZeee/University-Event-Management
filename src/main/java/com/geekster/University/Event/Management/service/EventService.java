package com.geekster.University.Event.Management.service;

import com.geekster.University.Event.Management.model.EventModel;
import com.geekster.University.Event.Management.model.StudentModel;
import com.geekster.University.Event.Management.repository.IEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService implements IEventService {
    @Autowired
    private IEventRepository eventRepository;
    @Override
    public void addEvent(EventModel eventModel){
        eventRepository.save(eventModel);
    }
    @Override
    public void updateEvent(int eventId, EventModel eventModel){
        EventModel model = eventRepository.findById(eventId).get();
        eventRepository.save(model);
    }
    @Override
    public void deleteEvent(int eventId){
        eventRepository.deleteById(eventId);
    }
    @Override
    public EventModel allEventByEventId(int eventId){
        return eventRepository.findById(eventId).get();
    }
}
