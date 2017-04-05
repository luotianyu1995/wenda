package com.lgsc.wenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lgsc.wenda.service.QuestionService;

@Controller
@RequestMapping("/wenda")
public class HomeController {
	
	@Autowired
	private QuestionService questionService;
	@RequestMapping("/index")
	public String toIndex(Model model){
	    model.addAttribute("questionList", questionService.getAllQuestion(null));
		return "index";
	}
}
