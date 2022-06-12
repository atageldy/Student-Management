package com.example.employee.service;

import com.example.employee.entity.Student;

import java.util.List;

public interface StudentService { //описание методов
    List<Student> getAllStud();

    Student saveStud(Student student);

    Student getStudById(Long id);

    Student updateStud(Student student);

    void deleteStudById(Long id);
}
