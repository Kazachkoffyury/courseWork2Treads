package com.example.coursework2treads.Controllers;

import com.example.coursework2treads.Data.Question;
import com.example.coursework2treads.Service.impl.ExaminerServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/exam")
public class ExamController {
    private final ExaminerServiceImpl examinerServiceImpl;

    public ExamController(ExaminerServiceImpl examinerServiceImpl) {
        this.examinerServiceImpl = examinerServiceImpl;
    }
    @GetMapping("/get")
    public Collection<Question>getQuestions(@RequestParam int amount) {
        return examinerServiceImpl.getQuestion(amount);
    }
}
