package com.geekster.University.Event.Management.repository;

import com.geekster.University.Event.Management.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends JpaRepository<StudentModel, Integer> {
}
