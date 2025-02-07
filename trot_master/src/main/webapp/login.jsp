<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>로그인</title>
</head>
<body>

<h2>로그인</h2>

<% if (request.getParameter("error") != null) { %>
    <p style="color: red;">❌ 이메일 또는 비밀번호가 잘못되었습니다.</p>
<% } %>

<form action="LoginController" method="post">
    <label for="email">이메일:</label>
    <input type="email" id="email" name="email" required><br><br>

    <label for="password">비밀번호:</label>
    <input type="password" id="password" name="password" required><br><br>

    <input type="submit" value="로그인">
</form>

</body>
</html>
