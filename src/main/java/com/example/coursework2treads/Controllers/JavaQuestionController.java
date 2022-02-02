package com.example.coursework2treads.Controllers;

import com.example.coursework2treads.Data.Question;
import com.example.coursework2treads.Service.impl.QuestionServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping ("/exam/java")
public class JavaQuestionController {
    private final QuestionServiceImpl questionServiceImpl;

    public JavaQuestionController(QuestionServiceImpl questionServiceImpl) {
        this.questionServiceImpl = questionServiceImpl;
    }
    @GetMapping("/add")
    public Question add(@RequestParam String question,@RequestParam String answer) {
        return questionServiceImpl.add(new Question(question,answer));

    }

    @GetMapping("/remove")
    public Question remove(@RequestParam String question,@RequestParam String answer) {
        return  questionServiceImpl.remove(new Question(question,answer));
    }

    @GetMapping
    public Collection<Question> getAll(){
        return questionServiceImpl.getAll();
    }

}
