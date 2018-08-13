package com.exam.model;

import java.util.List;

import com.exam.dto.ExamDto;

public class ExamBizImpl implements ExamBiz {

	private ExamDao dao = new ExamDaoImpl();
	
	@Override
	public int insert(ExamDto dto) {
		return dao.insert(dto);
	}

	@Override
	public List<ExamDto> selectAll(){
		return dao.selectAll();
	}
}
