package com.example.coursework2treads.Service.impl;

import com.example.coursework2treads.Data.Question;
import com.example.coursework2treads.Exception.TooManyQuestion;
import com.example.coursework2treads.Service.ExaminerService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionServiceImpl questionService;

    public ExaminerServiceImpl(QuestionServiceImpl questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestion(int amount) {
        if(amount > questionService.getAll().size()){
          throw new TooManyQuestion();
        }
        Set<Question> questions = new HashSet<Question>();
        while (questions.size()< amount) {
            questions.add(questionService.getRandomQuestion());
        }
        return questions;
    }
}
