<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>에러 발생</title>
    <style>
        body {
            font-family: "Lato", sans-serif;
            background-color: #1e1e1e;
            color: white;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            flex-direction: column;
            text-align: center;
        }

        .error-container {
            background-color: #ff4444;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 2px 2px 10px rgba(0, 0, 0, 0.2);
        }

        h1 {
            font-size: 2em;
            margin-bottom: 10px;
        }

        p {
            font-size: 1.2em;
            margin-bottom: 20px;
        }

        a {
            color: white;
            text-decoration: none;
            background-color: #333;
            padding: 10px 20px;
            border-radius: 5px;
            display: inline-block;
        }

        a:hover {
            background-color: #555;
        }
    </style>
</head>
<body>
    <div class="error-container">
        <h1>🚨 에러 발생</h1>
        <p>요청하신 가수 정보를 찾을 수 없습니다.</p>
        <p>잘못된 접근이거나 데이터가 존재하지 않습니다.</p>
        <a href="index.jsp">메인 페이지로 이동</a>
    </div>
</body>
</html>
