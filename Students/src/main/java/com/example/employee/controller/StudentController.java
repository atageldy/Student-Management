package com.example.employee.controller;

import com.example.employee.entity.Student;
import com.example.employee.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController { //класс который отвечает за контроль адресов и возвращение html файлов
@Autowired
    private StudentService studentService;

//    public StudentController(StudentService studentRepository) {
//        super();
//        this.studentRepository = studentRepository;
//    }

    @GetMapping("/")
    public String listStud(Model model) {
        model.addAttribute("students", studentService.getAllStud());
        return "index";
    }


    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }


    @GetMapping("/new")
    public String createStudFor(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "create_stud";
    }

    @PostMapping("/")
    public String saveStud(@ModelAttribute("student") Student student) {
        studentService.saveStud(student);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editStudFor(@PathVariable Long id, Model model) {
        model.addAttribute("student", studentService.getStudById(id));
        return "edit_stud";
    }

    @PostMapping("/{id}")
    public String updateStud(@PathVariable Long id,
                            @ModelAttribute("student") Student student,
                            Model model) {

        Student existingStud = studentService.getStudById(id);
        existingStud.setId(id);
        existingStud.setFirstName(student.getFirstName());
        existingStud.setLastName(student.getLastName());
        existingStud.setEmail(student.getEmail());

        studentService.updateStud(student);
        return "redirect:/";
    }


    @GetMapping("/{id}")
    public String deleteStud(@PathVariable Long id) {
        studentService.deleteStudById(id);
        return "redirect:/";
    }
}
