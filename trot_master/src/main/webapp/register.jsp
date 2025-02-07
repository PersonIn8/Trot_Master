<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>회원가입</title>
</head>
<body>

<h2>회원가입</h2>
<form action="RegisterController" method="post">
    <label for="username">아이디:</label>
    <input type="text" id="username" name="username" required><br><br>

    <label for="email">이메일:</label>
    <input type="email" id="email" name="email" required><br><br>

    <label for="password">비밀번호:</label>
    <input type="password" id="password" name="password" required><br><br>

    <label for="phone">전화번호:</label>
    <input type="text" id="phone" name="phone" required><br><br>

    <input type="submit" value="회원가입">
</form>

</body>
</html>
