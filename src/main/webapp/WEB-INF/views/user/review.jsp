<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${path}/resources/csss/index.css" rel="stylesheet"/>
<link href="${path}/resources/csss/reviewPage.css" rel="stylesheet"/>
</head>
<body>
<%@ include file="../includes/header.jsp"%>
< <div id="login-warp">
     <div class="sub-conts login util-width login-info">
         <div class="page-tit">
            <h1>리뷰</h1>
         </div>
         <div class="rq-form">
             <div class="main-txt-group">
                <h2 class="main-txt">리뷰 를 작성해주세요</h2>
             </div>
             <form action="" method="">
             <div id="divid" class="box-input">
                <div class="input-wrap">
                   <input id="title" type="text" name="title" placeholder="리뷰 제목을 입력해주세요" class="input-default is-delete" title="title">
                </div>
                <div class="input-wrap">
                   <input id="content" type="content" name="password" placeholder="리뷰 를 작성해주세요" class="input-default is-delete" title="content">
                </div>
             </div>
              </form>
             <button class="btns wid md-ripples ripples-light" type="button" onclick="">리뷰작성 완료</button>
             
             </div>
         </div>
     </div>
  <%@ include file="../includes/mainfooter.jsp"%>        
</body>
</html>