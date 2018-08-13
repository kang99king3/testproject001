package com.exam.model;

import java.util.List;

import com.exam.dto.ExamDto;

public interface ExamBiz {
	
	public int insert(ExamDto dto);
	public List<ExamDto> selectAll();
}
