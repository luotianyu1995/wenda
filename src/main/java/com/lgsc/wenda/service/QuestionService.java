package com.lgsc.wenda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lgsc.wenda.mapper.QuestionMapper;
import com.lgsc.wenda.model.Question;

@Service
public class QuestionService {
	
	@Autowired
	private QuestionMapper questionMapper;
	
	public List<Question> getAllQuestion(Integer integer){
		
		return questionMapper.getAllQuestion(null);
	}
}
