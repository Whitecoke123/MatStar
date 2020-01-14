package com.study.parking.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.parking.test.mapper.JspViewTestMapper;

@Service
public class JspViewTestService {
	
	@Autowired
	JspViewTestMapper jspViewTestMapper;
	
	public String getAll() throws Exception{
		return jspViewTestMapper.getAll();
	}
}
