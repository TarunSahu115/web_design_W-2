package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public Student addStudent(Student student) {
        return repo.save(student);
    }

    public List<Student> getStudents() {
        return repo.findAll();
    }

    public Student getStudent(int id) {
        return repo.findById(id).orElse(null);
    }

    public Student updateStudent(int id, Student newStudent) {

        Student student = repo.findById(id).orElse(null);

        if(student != null) {
            student.setName(newStudent.getName());
            return repo.save(student);
        }

        return null;
    }

    public String deleteStudent(int id) {

        repo.deleteById(id);

        return "Student deleted";
    }
}