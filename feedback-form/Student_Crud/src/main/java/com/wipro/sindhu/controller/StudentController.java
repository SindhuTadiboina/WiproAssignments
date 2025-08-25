package com.wipro.sindhu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.wipro.sindhu.entites.Student;
import com.wipro.sindhu.studentService.StudentService;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Home page with CRUD buttons
    @GetMapping("/")
    public String viewHome() {
        return "index";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("student", new Student());
        return "create";
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute Student student) {
        studentService.save(student);
        return "redirect:/";
    }

    @GetMapping("/read/{rollno}")
    public String readStudent(@PathVariable int rollno, Model model) {
        Student student = studentService.getByRollNo(rollno);
        if (student == null) {
            return "redirect:/";
        }
        model.addAttribute("student", student);
        return "read";
    }

    @GetMapping("/list")
    public String showAllStudents(Model model) {
        model.addAttribute("list", studentService.getAll());
        return "list";
    }

    @GetMapping("/edit/{rollno}")
    public String showEditForm(@PathVariable int rollno, Model model) {
        Student student = studentService.getByRollNo(rollno);
        model.addAttribute("student", student);
        return "edit";
    }

    @PostMapping("/update")
    public String updateStudent(@ModelAttribute Student student) {
        studentService.save(student);
        return "redirect:/";
    }

    @GetMapping("/delete/{rollno}")
    public String deleteStudent(@PathVariable int rollno) {
        studentService.delete(rollno);
        return "redirect:/list";
    }
}

