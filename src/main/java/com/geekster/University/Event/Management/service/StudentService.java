package com.geekster.University.Event.Management.service;

import com.geekster.University.Event.Management.model.StudentModel;
import com.geekster.University.Event.Management.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService implements IStudentService{
    @Autowired
    private IStudentRepository studentRepository;
    private static List<StudentModel> models= new ArrayList<>();
    @Override
    public List<StudentModel> findAll(){
        return studentRepository.findAll();
    }
    @Override
    public StudentModel findStudentById(int studentId){
        return studentRepository.findById(studentId).get();
    }
    @Override
    public void addStudent(StudentModel studentModel){
        studentRepository.save(studentModel);
    }
    @Override
    public void updateStudentDetail(StudentModel studentModel, int studentId){
        StudentModel model = studentRepository.findById(studentId).get();
        studentRepository.save(model);
    }
    @Override
    public void deleteStudentDetail(int studentId){
        studentRepository.deleteById(studentId);
    }
}
