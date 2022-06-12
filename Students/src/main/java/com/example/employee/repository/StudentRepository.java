package com.example.employee.repository;

import com.example.employee.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> { //интерфейс который наследует методы (findAll , save , getById , deleteById)
}
