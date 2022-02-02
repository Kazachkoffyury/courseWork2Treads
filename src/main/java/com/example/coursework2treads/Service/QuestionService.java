package com.example.coursework2treads.Service;

import com.example.coursework2treads.Data.Question;

import java.util.Collection;

public interface QuestionService {
    Question add(Question question);
    Question remove(Question question);
    Collection<Question> getAll();
    Question getRandomQuestion();
}
