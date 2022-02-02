package com.example.coursework2treads.Service;

import com.example.coursework2treads.Data.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestion(int amount);
}
