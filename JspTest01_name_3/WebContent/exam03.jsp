<%@page import="com.exam.dto.ExamDto"%>
<%@page import="com.exam.model.ExamBizImpl"%>
<%@page import="com.exam.model.ExamBiz"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8");%> 
<% response.setContentType("text/html; charset=UTF-8");%>   

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<%

	//db에 insert 하는 코드
	String name=request.getParameter("name");
	int score=Integer.parseInt(request.getParameter("score"));
	ExamBizImpl exam=new ExamBizImpl();
	exam.insert(new ExamDto(0,name,score));

%>

<body>

	<fieldset>
		<legend>Q.08</legend>
		<p>Mapper.xml에 쿼리를 추가하여, 클릭을 누르면 exam04.jsp에 있는 table에 list가 보여지게 해주세요.</p>	
		<button onclick="location.href='exam.do?command=q08'">클릭</button>
	</fieldset>

</body>
</html>