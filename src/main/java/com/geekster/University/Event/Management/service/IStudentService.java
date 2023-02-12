package com.geekster.University.Event.Management.service;

import com.geekster.University.Event.Management.model.StudentModel;

import java.util.List;

public interface IStudentService {
    public List<StudentModel> findAll();
    public StudentModel findStudentById(int studentId);
    public void addStudent(StudentModel studentModel);
    public void updateStudentDetail(StudentModel studentModel, int studentId);
    public void deleteStudentDetail(int studentId);
}
