package com.example.coursework2treads;

import com.example.coursework2treads.Data.Question;
import com.example.coursework2treads.Exception.DuplicateQuestion;
import com.example.coursework2treads.Exception.QuestionNotFound;
import com.example.coursework2treads.Service.QuestionService;
import com.example.coursework2treads.Service.impl.QuestionServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static com.example.coursework2treads.Constants.QUEST1;
import static com.example.coursework2treads.Constants.QUEST2;
import static org.junit.jupiter.api.Assertions.*;

public class QuestionServiceTest {
    private QuestionService out;

    @BeforeEach
    void  setUp() {
     out = new QuestionServiceImpl();
    }
    @Test
    void shouldAddQuestionDuplicate() {
        out.add(QUEST1);
        assertThrows(DuplicateQuestion.class, () -> out.add(QUEST1));
    }
    @Test
    void shouldRemoveQuestionNotFound(){
        out.add(QUEST1);
        assertThrows(QuestionNotFound.class,()-> out.remove(QUEST2));
    }


}
