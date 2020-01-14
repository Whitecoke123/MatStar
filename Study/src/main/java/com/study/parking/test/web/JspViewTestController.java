package com.study.parking.test.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.parking.test.service.JspViewTestService;

@RestController
public class JspViewTestController {
	
	@Autowired
	JspViewTestService jspViewTestService;

	@RequestMapping("/")
	public String test() throws Exception{
		return jspViewTestService.getAll();
	}
}
