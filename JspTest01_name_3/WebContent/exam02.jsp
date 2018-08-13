<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("UTF-8"); %>
<%response.setContentType("text/html; charset=UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>jsp exam</title>

<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script type="text/javascript">

$(function(){

	$("#submitForm").submit(function(){
		var name = $("#name").val();
		var score = $("#score").val();

		if(name == "" || score == "" || name == null || score == null){
			alert("이름과 점수를 모두 작성해 주세요.");
			return false;
		}
		
		if(isNaN(Number(score))){
			alert("숫자가 아닙니다.");
			return false;
		}
		
	});
});


</script>

</head>

<body>

	<fieldset>
		<legend>Q.04</legend>
		<p>링크를 클릭하면, servlet에서 request 객체에 담아 보내준 "hello, jsp/servlet" 메시지를 출력하도록 el 태그를 완성해 주세요.</p>
		<a href="exam.do?command=q04">클릭</a><br/>
		message : ${answer04}
	</fieldset>

	<fieldset>
		<legend>Q.05</legend>
		<p>el 태그를 이용하여 pageContext 객체에 담긴 내용을 출력해 주세요.</p>
<%		
		pageContext.setAttribute("scopeTest", "pageScope");		
%>
		pageContext : ${scopeTest}
	</fieldset>

	<fieldset>
		<legend>Q.06</legend>
		<p>session 객체에 "jsp exam" 이라는 문자열을 담아주세요. 
		버튼을 누르면 controller로 보내고, controller에서 해당 문자열을 console에 출력해 주세요.</p>
<%		session.setAttribute("sessionScope","jsp exam"); %>		
		<button onclick="location.href='exam.do?command=q06'">클릭</button>
	</fieldset>

	<fieldset>
		<legend>Q.07</legend>
		<p>input tag에 이름과 점수를 입력해서 버튼을 누르면 exam03.jsp로 넘어갑니다.
		exam03의 scriptlet(&lt;% java code %&gt;) 부분 안에서, db에 insert 하는 코드를 작성해 주세요.
		</p>
		<form action="exam03.jsp" method="post" id="submitForm">
			이름 : <input type="text" name="name" id="name"><br/>
			점수 : <input type="text" name="score" id="score"><br/>
			<input type="submit" value="클릭"><br/>
		</form>
	</fieldset>

</body>
</html>