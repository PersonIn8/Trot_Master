<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.time.LocalDateTime"%>
<%@ page import="java.time.format.DateTimeFormatter"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="assets/css/main.css">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lato">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
body {
    font-family: "Lato", sans-serif;
}

.mySlides {
    display: none;
}

.w3-top {
    position: fixed;
    width: 100%;
    z-index: 9999;
}

#banner {
    position: relative;
    z-index: 1;
}
</style>
</head>
<body id="top">

<!-- Navbar -->
<div class="w3-top">
    <div class="w3-bar w3-black w3-card">
        <a class="w3-bar-item w3-button w3-padding-large w3-hide-medium w3-hide-large w3-right" href="javascript:void(0)" onclick="toggleNav()" title="Toggle Navigation Menu"><i class="fa fa-bars"></i></a>
        <a href="index.html" class="w3-bar-item w3-button w3-padding-large">HOME</a>
        <a href="굿즈.html" class="w3-bar-item w3-button w3-padding-large w3-hide-small">굿즈</a>
        <a href="콘서트.html" class="w3-bar-item w3-button w3-padding-large w3-hide-small">콘서트</a>
        <a href="board?command=allList" class="w3-bar-item w3-button w3-padding-large w3-hide-small">커뮤니티</a>
        <a href="javascript:void(0)" class="w3-padding-large w3-hover-red w3-hide-small w3-right"><i class="fa fa-search"></i></a>
    </div>
</div>

<!-- Navbar for small screens -->
<div id="navDemo" class="w3-bar-block w3-black w3-hide w3-hide-large w3-hide-medium w3-top" style="margin-top: 46px">
    <a href="#band" class="w3-bar-item w3-button w3-padding-large" onclick="toggleNav()">가수 정보</a>
    <a href="굿즈.html" class="w3-bar-item w3-button w3-padding-large" onclick="toggleNav()">굿즈</a>
    <a href="#콘서트.html" class="w3-bar-item w3-button w3-padding-large" onclick="toggleNav()">콘서트</a>
    <a href="board?command=allList" class="w3-bar-item w3-button w3-padding-large" onclick="toggleNav()">커뮤니티</a>
</div>

<!-- Banner -->
<section id="banner" data-video="images/banner.jpg" style="height: 300px; background-size: cover; background-position: center;">
    <div class="inner">
        <header>
            <h1>Trot Master</h1>
            <p>당신을 위한 최고의 트로트 커뮤니티</p>
        </header>
    </div>
</section>

<table align="center" cellpadding="5" cellspacing="2" width="100%" bordercolordark="white" bordercolorlight="black">
    <colgroup>
        <col width="7%" />
        <col width="60%" />
        <col width="11%" />
        <col width="15%" />
    </colgroup>

    <tr>
        <td bgcolor="#336699">
            <p align="center">
                <font color="white"> <b><span style="font-size: 9pt;">번호</span></b></font>
            </p>
        </td>
        <td bgcolor="#336699">
            <p align="center">
                <font color="white"> <b><span style="font-size: 9pt;">제목</span></b></font>
            </p>
        </td>
        <td bgcolor="#336699">
            <p align="center">
                <font color="white"> <b><span style="font-size: 9pt;">작 성 자</span></b></font>
            </p>
        </td>
        <td bgcolor="#336699">
            <p align="center">
                <font color="white"><b><span style="font-size: 9pt;">작 성 일</span></b></font>
            </p>
        </td>
    </tr>

    <c:choose>
        <c:when test="${empty requestScope.list}">
            <tr>
                <td colspan="4">
                    <p align="center">
                        <b><span style="font-size: 9pt;">등록된 방명록이 없습니다.</span></b>
                    </p>
                </td>
            </tr>
        </c:when>

        <c:otherwise>
            <!-- ArrayList에 방명록 데이터가 있는 상태 -->
            <c:forEach items="${requestScope.list}" var="p">
                <tr>
                    <td bgcolor="">
                        <p align="center">
                            <span style="font-size: 9pt;"> ${p.postId}</span>
                        </p>
                    </td>
                    <td bgcolor="">
                        <p style="text-align: center;">
                            <span style="font-size: 9pt;"> <a href="board?command=view&postid=${p.postId}" style="text-decoration: none; color: inherit;">${p.title}</a></span>
                        </p>
                    </td>
                    <td bgcolor="">
                        <p align="center">
                            <span style="font-size: 9pt;"> ${p.userId} </span>
                        </p>
                    </td>
                    <td bgcolor="">
                        <p align="center">
                            <span style="font-size: 9pt;"> ${p.createdAt} </span>
                        </p>
                    </td>
                </tr>
            </c:forEach>
        </c:otherwise>
    </c:choose>
</table>

<hr>

<div align="right">
    <span style="font-size: 9pt;">&lt;<a href="write.html">글쓰기</a>&gt;</span>
</div>

<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/jquery.scrolly.min.js"></script>
<script src="assets/js/jquery.poptrox.min.js"></script>
<script src="assets/js/skel.min.js"></script>
<script src="assets/js/util.js"></script>
<script src="assets/js/main.js"></script>
</body>
</html>
