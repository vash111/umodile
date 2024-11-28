<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항</title>
<link href="${path}/resources/csss/index.css" rel="stylesheet"/>
<link href="${path}/resources/csss/mainnotice.css" rel="stylesheet"/>
</head>
<body>
 <%@ include file="../includes/header.jsp"%>
 
  <section class="notice">
  <div class="page-title">
        <div class="container">
            <h3>공지사항</h3>
        </div>
    </div>

    <!-- board seach area -->
    <div id="board-search">
        <div class="container">
            <div class="search-window">
                <form action="">
                    <div class="search-wrap">
                        <label for="search" class="blind">공지사항 내용 검색</label>
                        <input id="search" type="search" name="" placeholder="검색어를 입력해주세요." value="">
                        <button type="submit" class="btn btn-dark">검색</button>
                    </div>
                </form>
            </div>
        </div>
    </div>
   
  <!-- board list area -->
    <div id="board-list">
        <div class="container">
            <table class="board-table">
                <thead>
                <tr>
                    <th scope="col" class="th-num">번호</th>
                    <th scope="col" class="th-title">제목</th>
                    <th scope="col" class="th-date">등록일</th>
                </tr>
                </thead>
               <tbody>
            <!-- 공지사항 목록 반복 -->
            <c:forEach var="notice" items="${noticeAllList}">
                <tr>
                    <th scope="row">${notice.nno}</th>
                    <td>
                        <a href="/admin/read/${notice.nno}">${notice.title}</a>
                    </td>
                    <td>${notice.writer}</td>
                    <td>
                        <input type="text" class="form-control" name="regdate" id="regdate" readonly value="${notice.regdate}">
                    </td>
                </tr>
            </c:forEach>
        </tbody>
            </table>
        </div>
    </div>

</section>

 <%@ include file="../includes/mainfooter.jsp"%>
 
</body>
</html>