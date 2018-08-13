package com.exam.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import com.exam.dto.ExamDto;
import com.exam.model.ExamBiz;
import com.exam.model.ExamBizImpl;

@WebServlet("/ajax.do")
public class ajaxController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ajaxController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		int score = Integer.parseInt(request.getParameter("score"));
	
		ExamDto dto = new ExamDto(0,name, score);
		ExamBizImpl biz = new ExamBizImpl();
		int res = biz.insert(dto);
		if(res > 0) {
			out.println("입력 성공");
		}else {
			out.println("입력 실패");
		}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
