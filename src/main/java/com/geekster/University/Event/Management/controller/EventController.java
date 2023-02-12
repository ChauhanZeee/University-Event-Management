package com.geekster.University.Event.Management.controller;

import com.geekster.University.Event.Management.model.EventModel;
import com.geekster.University.Event.Management.service.IEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2/eventModel")
public class EventController {
    @Autowired
    private IEventService eventService;

    @PostMapping("/add/event")
    public void addEvent(@RequestBody EventModel eventModel){
        eventService.addEvent(eventModel);
    }
    @PutMapping("/update/event/by/eventId/{eventId}")
    public void updateEvent(@PathVariable int eventId, @RequestBody EventModel eventModel){
        eventService.updateEvent(eventId, eventModel);
    }
    @DeleteMapping("/delete/event/by/eventId/{eventId}")
    public void deleteEvent(@PathVariable int eventId){
        eventService.deleteEvent(eventId);
    }
    @GetMapping("/get/all-event/by/eventId/{eventId}")
    public EventModel eventByDate(@PathVariable int eventId){
        return eventService.allEventByEventId(eventId);
    }
}
