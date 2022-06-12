package com.example.employee.service;

import com.example.employee.entity.Student;
import com.example.employee.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService { //реализация интерфейса

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStud() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStud(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStud(Student student) {
        return studentRepository.save(student);
    }


    @Override
    public void deleteStudById(Long id) {
        studentRepository.deleteById(id);
    }
}
