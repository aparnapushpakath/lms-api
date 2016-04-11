package com.aparna;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;

public class TestRegisterController {
@InjectMocks
private TController controller;
private MockMvc mockmvc;

@Before
public void setUp(){
	MockitoAnnotations.initMocks(this);
	mockmvc=MockMvcBuilders.standaloneSetup(controller).build();
}
/*@Test
public void test() throws Exception{
	mockmvc.perform(get("/test")).andDo(print());
	
}*/
@Test
public void test() throws Exception{
	mockmvc.perform(post("/test1")
	.content("{\"title\":\"bbb\",\"author\":\"mr. z\",\"isdn\":\"ad123\"}")
	.contentType(MediaType.APPLICATION_JSON)).andDo(print());
	
}
}
