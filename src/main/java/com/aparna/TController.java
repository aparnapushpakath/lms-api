package com.aparna;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;

import entities.Book;

@Controller
public class TController {

	@RequestMapping("/test")
	public ResponseEntity<Object> test(){
		Book book= new Book("abc","mr.a","aa123");
		//book("abc","mr.a","aa123");
		return new ResponseEntity<Object>(book,HttpStatus.OK);
	}
}
