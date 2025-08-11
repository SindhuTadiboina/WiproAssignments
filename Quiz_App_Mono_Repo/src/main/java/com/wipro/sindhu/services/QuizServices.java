package com.wipro.sindhu.services;

import java.util.List;
import com.wipro.sindhu.entities.QuestionWrapper;
import com.wipro.sindhu.entities.Quiz;
import com.wipro.sindhu.entities.Response;



public interface QuizServices {

	Quiz createQuiz(String category, String level, String title);

	List<QuestionWrapper> getQuizQuestions(Integer id);

	String calculateResult(Integer id, List<Response> responses);
}
