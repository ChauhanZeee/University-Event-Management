package com.geekster.University.Event.Management.repository;

import com.geekster.University.Event.Management.model.EventModel;
import com.geekster.University.Event.Management.model.StudentModel;
import jdk.jfr.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEventRepository extends JpaRepository<EventModel, Integer> {
}
