<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${path}/resources/csss/index.css" rel="stylesheet"/> 
<link href="${path}/resources/csss/Edit.css" rel="stylesheet"/>
</head>
<body>
 <%@ include file="../includes/header.jsp"%>
 
<div class="fore">
<form action="doJoin" method="get" class="joinForm" onsubmit="DoJoinForm__submit(this); return false;">
                                                                                               
      <h2>회원 수정</h2>
      <div class="textForm">
        <input name="email" type="text" class="email" placeholder="이메일" readonly="readonly">
        </input>
      </div>
      <div class="textForm">
        <input name="name" type="text" class="name" placeholder="이름" readonly="readonly">
      </div>
       <div class="textForm">
        <input name="password" type="password" class="pw" placeholder="비밀번호">
      </div>
     <div class="textForm">
        <input name="phone" type="text" class="name" placeholder="번호" readonly="readonly">
      </div> 
      <div class="textForm">
        <input name="addr" type="text" class="name" placeholder="주소" readonly="readonly">
      </div>
      <input type="submit" class="btn" value="수 정 완 료"/>
    </form>


</div>
<%@ include file="../includes/mainfooter.jsp"%>
</body>
</html>