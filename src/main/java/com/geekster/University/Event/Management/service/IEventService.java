package com.geekster.University.Event.Management.service;

import com.geekster.University.Event.Management.model.EventModel;

public interface IEventService {
    public void addEvent(EventModel eventModel);
    public void updateEvent(int eventId, EventModel eventModel);
    public void deleteEvent(int eventId);
    public EventModel allEventByEventId(int eventId);
}
