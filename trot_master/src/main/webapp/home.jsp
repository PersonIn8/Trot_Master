<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="model.domain.UserDTO" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>홈 페이지</title>
</head>
<body>

<%
    UserDTO user = (UserDTO) session.getAttribute("user");
    if (user == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>

<h2>환영합니다, <%= user.getUsername() %>님! 🎉</h2>
<p>이메일: <%= user.getEmail() %></p>
<p>전화번호: <%= user.getPhone() %></p>
<p>가입 날짜: <%= user.getCreatedAt() %></p>

<!-- 로그아웃 버튼 -->
<form action="LogoutController" method="post">
    <input type="submit" value="로그아웃">
</form>

</body>
</html>
