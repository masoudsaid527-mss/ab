package com.suza.hostel.Service;

import com.suza.hostel.Model.Student;
import com.suza.hostel.Repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {
    public final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }
    public List <Student> getAll(){
        return studentRepository.findAll();
    }
    public Student getById(Long id){
        return studentRepository.findById(id).orElseThrow(()->new RuntimeException("This id not available"));
    }
}
