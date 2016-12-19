package com.wagner.mms.web;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class MyExceptionController {

	// 404
	@ExceptionHandler(NoHandlerFoundException.class)
	public ModelAndView handler404(NoHandlerFoundException e) {
		ModelAndView view = new ModelAndView("error/404");
		view.addObject("message", e.getMessage());
		
		return view;
	}
}
