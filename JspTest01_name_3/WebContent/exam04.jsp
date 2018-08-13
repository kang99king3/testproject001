<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8");%> 
<% response.setContentType("text/html; charset=UTF-8");%>   

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>

<script type="text/javascript">
	function ajaxFunc(){
		var name1=document.getElementById("name").value;
		var score1=document.getElementById("score").value;
		
		$.ajax({
			url: "ajax.do",
			method:"post",
			async:false,
			data:"name="+name1+"&score="+score1,
			success:function(obj){
				alert(obj);
			},
			error:function(){
				alert("에러다");
			}
			
		});
	}
</script>

</head>
<body>
	
	<div id="examTable">
		<table border="1">
			<col width="100px">
			<col width="100px">
			<tr>
				<th>이름</th>
				<th>점수</th>
			</tr>
			<c:choose>
				<c:when test="${empty list }">
					<tr>
						<td colspan="2">아무것도 없습니다.</td>
					</tr>
				</c:when>
				<c:otherwise>
					<c:forEach items="${list }" var="dto">
						<tr>
							<td>${dto.name }</td>
							<td>${dto.score }</td>
						</tr>
					</c:forEach>
				</c:otherwise>
			</c:choose>
		</table>
	</div>
	
	<fieldset>
		<legend>Q.09</legend>
		<p>ajax를 사용하여, 아래 input tag에 있는 값을 controller에 보내서 db에 저장하고, 
		성공하면 "입력 성공" 이라는 String을 controller에서 return하고, success function에서 alert으로 출력해 주세요.</p>	
		<input type="text" id="name" />
		<input type="text" id="score" />
		<button onclick="ajaxFunc()">클릭</button>
	</fieldset>
	
	<fieldset>
		<legend>Q.10</legend>
		<p>web.xml에서 "last.do" 로 servlet을 mapping 해 주세요.</p>	
		<button onclick="location.href='last.do?command=q10'">클릭</button>
	</fieldset>

</body>
</html>