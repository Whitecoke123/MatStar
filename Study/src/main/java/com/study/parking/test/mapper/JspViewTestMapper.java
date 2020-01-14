package com.study.parking.test.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface JspViewTestMapper {
	public String getAll() throws Exception;
}
