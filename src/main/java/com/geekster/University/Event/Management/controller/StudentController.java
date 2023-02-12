package com.geekster.University.Event.Management.controller;

import com.geekster.University.Event.Management.model.StudentModel;
import com.geekster.University.Event.Management.service.IStudentService;
import com.geekster.University.Event.Management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/studentModel")
public class StudentController {
    @Autowired
    private IStudentService studentService;
    @GetMapping("/get/all-studentDetail")
    public List<StudentModel> findAllStudent(){ // controller is talking to service layer;
        return studentService.findAll();
    }
    @GetMapping("/get/studentDetail-by/studentId/{studentId}")
    public StudentModel findStudentById(@PathVariable int studentId){ // controller is talking to service layer;
        return studentService.findStudentById(studentId);
    }
    @PostMapping("/add-studentDetail")
    public void addStudent(@RequestBody StudentModel studentModel){
        studentService.addStudent(studentModel);
    }
    @PutMapping("/update/studentDetail/by/studentId/{studentId}")
    public void updateStudentDetail(@RequestBody StudentModel studentModel, @PathVariable int studentId){
        studentService.updateStudentDetail(studentModel, studentId);
    }
    @DeleteMapping("/delete/studentDetail/by/studentId/{studentId}")
    public void deleteStudentDetail(@PathVariable int studentId){
        studentService.deleteStudentDetail(studentId);
    }
}
