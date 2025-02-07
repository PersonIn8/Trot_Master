<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>로그인</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            text-align: center;
            padding: 20px;
        }
        .container {
            width: 300px;
            margin: auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 8px;
            box-shadow: 2px 2px 12px rgba(0,0,0,0.1);
        }
        .error {
            color: red;
            font-size: 14px;
        }
        input[type="email"], input[type="password"] {
            width: 90%;
            padding: 8px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        input[type="submit"] {
            width: 100%;
            padding: 10px;
            background-color: #f44336; /* 🔥 회원가입과 동일한 빨강 */
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #d32f2f; /* 🚀 동일한 호버 색상 */
        }
    </style>
</head>
<body>

<div class="container">
    <h2>로그인</h2>

    <% if (request.getParameter("error") != null) { %>
        <p class="error">❌ 이메일 또는 비밀번호가 잘못되었습니다.</p>
    <% } %>

    <form action="LoginController" method="post">
        <label for="email">이메일:</label><br>
        <input type="email" id="email" name="email" required><br>

        <label for="password">비밀번호:</label><br>
        <input type="password" id="password" name="password" required><br>

        <input type="submit" value="로그인">
    </form>
    <script>
    	window.onload = function () {
        	window.resizeTo(document.body.scrollWidth + 50, document.body.scrollHeight + 50);
    	};
	</script>
    
</div>

</body>
</html>
