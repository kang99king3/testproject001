package com.exam.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.exam.dto.ExamDto;

public class ExamDaoImpl extends SqlMapConfig implements ExamDao {

	@Override
	public int insert(ExamDto dto) {

		SqlSession session = null;
		int res = 0;
		
		try {
			session = getSqlSessionFactory().openSession(true);
			res = session.insert(nameSpace + "insert", dto);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		return res;
	}
	
	public List<ExamDto> selectAll(){

		SqlSession session = null;
		List<ExamDto> res = new ArrayList<ExamDto>();

		try {
			session = getSqlSessionFactory().openSession(true);
			res = session.selectList(nameSpace + "selectAll");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		return res;
	}

}
