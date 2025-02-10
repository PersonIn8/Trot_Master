<%@ page contentType="text/html; charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="com.google.gson.Gson" %>
<%@ page import="java.util.Map" %>

<%
    // SingerController에서 전달된 socialMedia JSON 데이터를 변환
    String socialMediaJson = (String) request.getAttribute("singer.socialMedia");
    Map<String, String> socialMediaMap = null;

    if (socialMediaJson != null && !socialMediaJson.isEmpty()) {
        Gson gson = new Gson();
        socialMediaMap = gson.fromJson(socialMediaJson, Map.class);
        request.setAttribute("socialMediaMap", socialMediaMap); // ✅ JSP에서 사용하도록 request에 저장
    }
%>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>가수 프로필</title>
    <style>
        body {
            font-family: "Lato", sans-serif;
            background-color: #1e1e1e;
            color: white;
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
        }

        .container {
            display: grid;
            grid-template-columns: 1fr 2fr;
            gap: 20px;
            max-width: 1200px;
            width: 100%;
            padding: 20px;
        }

        /* ✅ 가수 프로필 스타일 */
        .profile-section {
            display: flex;
            flex-direction: column;
            align-items: center;
            gap: 30px;
        }

        .profile-image {
            width: 250px;
            height: 250px;
            border-radius: 50%;
            background-color: #c4c4c4;
            display: flex;
            justify-content: center;
            align-items: center;
            overflow: hidden;
        }

        .profile-image img {
            width: 100%;
            height: 100%;
            object-fit: cover;
        }

        /* ✅ 가수 랭킹 스타일 개선 */
        .extra-box {
            width: 350px;
            max-height: 300px;
            background-color: #2c2c2c;
            display: flex;
            flex-direction: column;
            align-items: center;
            padding: 15px;
            border-radius: 10px;
            overflow-y: auto;
            box-shadow: 2px 2px 10px rgba(0, 0, 0, 0.2);
        }

        .extra-box h3 {
            margin-bottom: 10px;
            color: #ffcc00;
        }

        .extra-box ul {
            padding: 0;
            margin: 0;
            list-style-type: none;
            width: 100%;
            text-align: center;
        }

        .extra-box ul li {
            padding: 5px 0;
            font-size: 16px;
        }

        /* ✅ 우측 정보 카드 스타일 */
        .info-section {
            display: flex;
            flex-direction: column;
            gap: 20px;
        }

        .card {
            background-color: white;
            color: black;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 2px 2px 10px rgba(0, 0, 0, 0.2);
        }

        .card h2 {
            margin-bottom: 10px;
        }

        .social-media-links a {
            color: #007bff;
            text-decoration: none;
            margin-right: 10px;
        }

        .social-media-links a:hover {
            text-decoration: underline;
        }

    </style>
</head>
<body>
    <div class="container">
        <!-- ✅ 좌측 프로필 -->
        <div class="profile-section">
            <div class="profile-image">
                <img id="profile-img" src="images/송가인.webp" alt="가수 이미지">
            </div>
            <div class="extra-box">
                <h3>가수 랭킹</h3>
                <ul id="top-singers">
                    <c:if test="${empty topSingers}">
                        <li>⚠️ 데이터 없음</li>
                    </c:if>
                    <c:forEach var="topSinger" items="${topSingers}">
                        <li>${topSinger}</li>
                    </c:forEach>
                </ul>
            </div>
        </div>

        <!-- ✅ 우측 정보 -->
        <div class="info-section">
            <div class="card">
                <h2 id="profile-name">${singer.name}</h2>
                <p id="profile-birth">🎂 생년월일: ${singer.birthDate}</p>
                <p id="profile-debut">📅 데뷔일: ${singer.debutDate}</p>
                
                <!-- ✅ 소셜 미디어 링크 -->
                <p id="profile-social">
                    📍 소셜 미디어:
                    <span class="social-media-links">
                        <c:choose>
                            <c:when test="${not empty socialMediaMap}">
                                <c:forEach var="entry" items="${socialMediaMap}">
                                    <a href="${entry.value}" target="_blank">${entry.key}</a>
                                </c:forEach>
                            </c:when>
                            <c:otherwise>
                                <span>소셜 미디어 정보 없음</span>
                            </c:otherwise>
                        </c:choose>
                    </span>
                </p>
                
                
            </div>

            <div class="card">
                <h2>가수 소개</h2>
                <p>이 가수는 감미로운 목소리와 뛰어난 가창력으로 많은 사랑을 받고 있습니다. 다양한 히트곡과 무대를 통해 팬들과
                    소통하고 있습니다.</p>
            </div>

            <div class="card">
                <h2>대표 앨범</h2>
                <ul>
                    <li>앨범: <b>《佳人 (가인)》 (2019)</b> - 히트곡: <i>가인이어라</i></li>
                    <li>앨범: <b>《몽(夢)》 (2021)</b> - 히트곡: <i>비 내리는 금강산</i></li>
                    <li>앨범: <b>《연가》 (2023)</b> - 히트곡: <i>기억 저편에</i></li>
                </ul>
            </div>
        </div>
    </div>
</body>
</html>
