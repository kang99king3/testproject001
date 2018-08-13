package com.exam.model;

import java.util.List;

import com.exam.dto.ExamDto;

public interface ExamDao {

	String nameSpace = "com.exam.examDB.";
	
	public int insert(ExamDto dto);
	public List<ExamDto> selectAll();
}
