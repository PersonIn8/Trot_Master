<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
        <a href="#band" class="w3-bar-item w3-button w3-padding-large w3-hide-small">가수 정보</a>
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

<script language="javascript">
    function sendUpdate(){
        document.requestForm.command.value = "updateForm";
        document.requestForm.submit();
    }

    // 삭제 요청 로직 수행 기능 
    function sendDelete(){
        var password = prompt("삭제할 게시물의 비밀번호를 입력하세요");

        if(password){ 
            document.requestForm.command.value = "delete"; 
            document.requestForm.password.value = password;  
            document.requestForm.submit();
        } else {
            return false;
        }
    }
</script>

<body>
    <table align="center" cellpadding="5" cellspacing="2" width="60%" border='1'>
        <tr>
            <td colspan="4" bgcolor="#336699">
                <p align="center">
                    <font color="white" size="3">
                        <b>${requestScope.resultContent.postId}번 게시물 자세히보기</b>
                    </font>
                </p>
            </td>
        </tr>
        
        <tr>
            <td width="100" height="20">
                <p align="right"><b><span style="font-size:9pt;">작성자</span></b></p>
            </td>
            <td colspan="3">
                <span style="font-size:9pt;"><b>${requestScope.list.userId}</b></span>
            </td>
        </tr>
        
        <tr>
            <td width="100" height="20">
                <p align="right"><b><span style="font-size:9pt;">작성일</span></b></p>
            </td>
            <td>
                <span style="font-size:9pt;"><b>${requestScope.list.createdAt}</b></span>
            </td>
        </tr>

        <tr>
            <td width="100" height="20">
                <p align="right"><b><span style="font-size:9pt;">제목</span></b></p>
            </td>
            <td colspan="3">
                <span style="font-size:9pt;"><b>${requestScope.list.title}</b></span>
            </td>
        </tr>

        <tr>
            <td width="100" height="200" valign="top">
                <p align="right"><b><span style="font-size:9pt;">내용</span></b></p>
            </td>
            <!-- 글 내용 출력 (줄바꿈을 <br>로 변환하여 출력) -->
            <td colspan="3" valign="top">
                <span style="font-size:9pt;"><b>${requestScope.list.content}</b></span>
            </td>
        </tr>

        <tr>
            <td colspan="4" align="center" valign="middle">
                <form name="requestForm" method="post" action="board">
                    <input type="hidden" name="num" value="${requestScope.resultContent.postId}">
                    <input type="hidden" name="command" value="">
                    <input type="hidden" name="password" value="">

                    <input type="button" value="수정하기" onclick="sendUpdate()">
                    <input type="button" value="삭제하기" onclick="sendDelete()">
                </form>
            </td>
        </tr>
    </table>
    <hr>
    <div align="right"><span style="font-size:9pt;">&lt;<a href="board?command=allList">리스트로 돌아가기</a>&gt;</span></div>

    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/js/jquery.scrolly.min.js"></script>
    <script src="assets/js/jquery.poptrox.min.js"></script>
    <script src="assets/js/skel.min.js"></script>
    <script src="assets/js/util.js"></script>
    <script src="assets/js/main.js"></script>
</body>
</html>
