package com.example.employee.bootstrap;

import com.example.employee.entity.Student;
import com.example.employee.repository.StudentRepository;
import com.example.employee.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component //класс для тестовых данных
public class StudentBootstrap implements CommandLineRunner {
    @Autowired
    private StudentService studentService;
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception {
        Student student = new Student("Adilet","Torobaev","adik@gmail.com","Jubek Jolu","IT");
        Student student1 = new Student("Almanbet","Totoev","alma@gmail.com","10mkr","IT");
        Student student2 = new Student("Asel","Alybaeva","asel@gmail.com","Vefa","Marketing");
        Student student3 = new Student("Aigerim","Nuralieva","aigerim@gmail.com","6mkr","HR");
        Student student4 = new Student("Astan","Serikov","serikov@gmail.com","5mrk","IT");
        studentRepository.save(student);
        studentRepository.save(student1);
        studentRepository.save(student2);
        studentRepository.save(student3);
        studentRepository.save(student4);

    }
}
