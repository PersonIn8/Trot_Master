<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
<head>
<title>콘서트 정보 페이지</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="assets/css/main.css">
<style>
body, h1, h2, h3, h4, h5, h6 {
    font-family: "Raleway", sans-serif;
}
.w3-main {
    margin-top: 100px;
}
.w3-top {
    width: 100%;
    left: 0;
    right: 0;
    position: fixed;
    z-index: 1000;
}
</style>
</head>
<body class="w3-light-grey w3-content">
<!-- Navbar -->
<div class="w3-top">
    <div class="w3-bar w3-black w3-card">
        <a href="#" class="w3-bar-item w3-button w3-padding-large">HOME</a>
        <a href="#concerts" class="w3-bar-item w3-button w3-padding-large w3-hide-small">CONCERTS</a>
        <a href="#contact" class="w3-bar-item w3-button w3-padding-large w3-hide-small">CONTACT</a>
    </div>
</div>
<!-- 콘서트 정보 -->
<div class="w3-main w3-padding" id="concerts">
    <h2 class="w3-center">콘서트 정보</h2>
    <div class="w3-row-padding w3-center" style="margin-top: 50px;">
        <c:forEach var="schedule" items="${upcomingSchedules}">
            <div class="w3-third w3-container w3-margin-bottom">
                <img src="images/송가인콘1.jpg" alt="${schedule.eventTitle}" style="width:100%" class="w3-hover-opacity">
                <div class="w3-container w3-white">
                    <p><b>${schedule.eventTitle}</b></p>
	                    <p>일정: ${schedule.eventDate}</p>
	                    <p>장소: ${schedule.location}</p>
                </div>
            </div>
        </c:forEach>
    </div>
</div>
<!-- Footer -->
<footer id="footer">
    <div class="inner">
        <div class="copyright">
            Site made with: <a href="https://templated.co/">Templated</a>.
        </div>
        <ul class="icons">
            <li><a href="#" class="fa fa-twitter"></a></li>
            <li><a href="#" class="fa fa-facebook"></a></li>
            <li><a href="#" class="fa fa-instagram"></a></li>
            <li><a href="#" class="fa fa-envelope"></a></li>
        </ul>
    </div>
</footer>
</body>
</html>