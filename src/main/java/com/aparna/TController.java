package com.aparna;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aparna.model.Book;

@Controller
public class TController {

	@RequestMapping("/test")
	public @ResponseBody Book test(){
		Book book= new Book("abc","mr.a","aa123");
		
		return book;
	}
	@RequestMapping(value="/test1",method=RequestMethod.POST)
	public @ResponseBody Book test(@RequestBody Book book){
		
		return book;
	}
}
