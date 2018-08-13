package com.exam.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.exam.model.ExamBiz;
import com.exam.model.ExamBizImpl;

//@WebServlet("/exam.do")
public class ExamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ExamServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String command = request.getParameter("command");
		ExamBiz biz = new ExamBizImpl();
		
		if(command.equals("q02")) {
			//Q.02
			System.out.println("question 02");
			response.sendRedirect("exam01.html");
		
		}else if(command.equals("q03")) {
			//Q.03
			response.sendRedirect("exam02.jsp");
		
		}else if(command.equals("q04")) {
			
			//Q.04
			request.setAttribute("answer04", "hello, jsp/servlet");
			
			RequestDispatcher dispatch = request.getRequestDispatcher("exam02.jsp");
			dispatch.forward(request, response);
		}else if(command.equals("q06")) {
//			System.out.println("하이");
			//Q.06
			String msg=(String)request.getSession().getAttribute("sessionScope");
			
			System.out.println(msg);
			
			response.sendRedirect("exam02.jsp");
			
		}else if(command.equals("q08")) {
			
			//Q.08
			request.setAttribute("list", biz.selectAll());

			RequestDispatcher dispatch = request.getRequestDispatcher("exam04.jsp");
			dispatch.forward(request, response);
		}else if(command.equals("q10")) {
			
			//Q.10
			System.out.println("수고하셨습니다.");
			
			PrintWriter out = response.getWriter();
			out.println("<h1>수고하셨습니다.</h1>");
		}
		
		
	}

}
