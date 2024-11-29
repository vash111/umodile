<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link href="https://cdn.jsdelivr.net/npm/simple-datatables@7.1.2/dist/style.min.css" rel="stylesheet" />
        <link href="/resources/css/styles.css" rel="stylesheet" />
        <script src="https://use.fontawesome.com/releases/v6.3.0/js/all.js" crossorigin="anonymous"></script>
</head>
 <body class="sb-nav-fixed">
        <nav class="sb-topnav navbar navbar-expand navbar-dark bg-dark">
            <!-- Navbar Brand-->
            <a class="navbar-brand ps-3" href="index.html">관리자 페이지</a>
            <!-- Sidebar Toggle-->
            <button class="btn btn-link btn-sm order-1 order-lg-0 me-4 me-lg-0" id="sidebarToggle" href="#!"><i class="fas fa-bars"></i></button>
            <!-- Navbar Search-->
            <form class="d-none d-md-inline-block form-inline ms-auto me-0 me-md-3 my-2 my-md-0">
                <div class="input-group">
                    <input class="form-control" type="text" placeholder="Search for..." aria-label="Search for..." aria-describedby="btnNavbarSearch" />
                    <button class="btn btn-primary" id="btnNavbarSearch" type="button"><i class="fas fa-search"></i></button>
                </div>
            </form>
            <!-- Navbar-->
            <ul class="navbar-nav ms-auto ms-md-0 me-3 me-lg-4">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" id="navbarDropdown" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false"><i class="fas fa-user fa-fw"></i></a>
                    <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="navbarDropdown">
                        <li><a class="dropdown-item" href="#!">Settings</a></li>
                        <li><a class="dropdown-item" href="#!">Activity Log</a></li>
                        <li><hr class="dropdown-divider" /></li>
                        <li><a class="dropdown-item" href="#!">Logout</a></li>
                    </ul>
                </li>
            </ul>
        </nav>
        <div id="layoutSidenav">
              <div id="layoutSidenav_nav">
                <nav class="sb-sidenav accordion sb-sidenav-dark" id="sidenavAccordion">
                    <div class="sb-sidenav-menu">
                        <div class="nav">
                            <div class="sb-sidenav-menu-heading">Core</div>
                            <a class="nav-link" href="/admin/Adminmain">
                                <div class="sb-nav-link-icon"><i class="fas fa-tachometer-alt"></i></div>
                                관리자 메인 페이지
                            </a>
                            <div class="sb-sidenav-menu-heading">Interface</div>
                            <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#collapseLayouts" aria-expanded="false" aria-controls="collapseLayouts">
                                <div class="sb-nav-link-icon"><i class="fas fa-columns"></i></div>
                                상품
                                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                            </a>
                            <div class="collapse" id="collapseLayouts" aria-labelledby="headingOne" data-bs-parent="#sidenavAccordion">
                                <nav class="sb-sidenav-menu-nested nav">                      
                                    <a class="nav-link" href="/admin/registerProduct">상품 등록</a>
                                </nav>
                            </div>
                            <a class="nav-link collapsed" href="#" data-bs-toggle="collapse" data-bs-target="#collapsePages" aria-expanded="false" aria-controls="collapsePages">
                                <div class="sb-nav-link-icon"><i class="fas fa-book-open"></i></div>
                                계정
                                <div class="sb-sidenav-collapse-arrow"><i class="fas fa-angle-down"></i></div>
                            </a>
                            <div class="collapse" id="collapsePages" aria-labelledby="headingTwo" data-bs-parent="#sidenavAccordion">
                                <nav class="sb-sidenav-menu-nested nav accordion" id="sidenavAccordionPages">
                                  <nav class="sb-sidenav-menu-nested nav">
                                            <a class="nav-link" href="login.html">일반 유저</a>
                                            <a class="nav-link" href="/admin/adminjoin">관리자 계정</a>
                                        </nav>
                                </nav>
                            </div>
                            <div class="sb-sidenav-menu-heading">Addons</div>
                            <a class="nav-link" href="/admin/PhoneApplicationdetails">
                                <div class="sb-nav-link-icon"><i class="fas fa-chart-area"></i></div>
                                고객 핸드폰 신청내역
                            </a>
                            <a class="nav-link" href="/admin/notice">
                                <div class="sb-nav-link-icon"><i class="fas fa-table"></i></div>
                                공지사항
                            </a>
                        </div>
                    </div>
                </nav>
            </div>
            <div id="layoutSidenav_content">
                <main>
                    <div class="container-fluid px-4">
                        <h1 class="mt-4">Tables</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item"><a href="index.html">Dashboard</a></li>
                            <li class="breadcrumb-item active">Tables</li>
                        </ol>
                        <div class="card mb-4">
                            <div class="card-body">
                                DataTables is a third party plugin that is used to generate the demo table below. For more information about DataTables, please visit the
                                <a target="_blank" href="https://datatables.net/">official DataTables documentation</a>
                                .
                                
                            </div>
                        </div>
                        <div class="card mb-4">
                            <div class="card-header">
                                <i class="fas fa-table me-1"></i>
                                공지사항 수정
                                
                            </div>
                            <div class="card-body">
                             <!-- Notice Information -->
			<div class="row">
    <div class="col-md-12">
        <div class="card">
            <form class="bg-white" name="frm" action="/admin/modify/${notice.nno}" method="post">
                <input type="hidden" name="pageNum" value="">
                <input type="hidden" name="amount" value="">
                <div class="row justify-content-md-center p-5 mb-3">
                    <div class="col-md-8">
                        <!-- 제목 입력 -->
                        <div class="form-group row">
                            <div class="col-md-2" align="center">
                                <label for="title">제목</label>
                            </div>
                            <div class="col-md-9">
                                <input type="text" class="form-control" name="title" id="title" value="${notice.title}">
                            </div>
                        </div>

                        <!-- 작성자 표시 -->
                        <div class="form-group row">
                            <div class="col-md-2" align="center">
                                <label for="writer">작성자</label>
                            </div>
                            <div class="col-md-9">
                                <input type="text" class="form-control" name="writer" id="writer" readonly value="${notice.writer}">
                            </div>
                        </div>

                        <!-- 작성일 표시 및 숨김 필드 -->
                        <div class="form-group row">
                            <div class="col-md-2" align="center">
                                <label for="regdate">작성일</label>
                            </div>
                            <div class="col-md-9">
                                <!-- 읽기 전용으로 사용자에게 표시 -->
                                <input type="text" class="form-control" id="regdate_display" readonly value="${formattedDate}">
                                <!-- 실제 전송되는 regdate -->
                                <input type="hidden" name="regdateString" value="${formattedDate}">
                            </div>
                        </div>

                        <!-- 내용 입력 -->
                        <div class="form-group row">
                            <div class="col-md-2" align="center">
                                <label for="content">내용</label>
                            </div>
                            <div class="col-md-9">
                                <textarea rows="20" cols="10" name="content" id="editorTxt" class="form-control" style="width: 100%;">${notice.content}</textarea>
                            </div>
                        </div>

                        <!-- 숨겨진 nno 필드 및 버튼 -->
                        <div class="form-group row">
                            <div class="col-md-9">
                                <input type="hidden" name="nno" id="nno" value="${notice.nno}">
                            </div>
                            <div class="col-md-3">
                                <button type="submit" class="btn btn-warning btn-sm">등록하기</button>
                                <button type="button" class="btn btn-primary btn-sm" onclick="location.href='/admin/notice'">목록으로</button>
                            </div>
                        </div>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>


                               
                            </div>
                        </div>
                    </div>
                </main>
                <footer class="py-4 bg-light mt-auto">
                    <div class="container-fluid px-4">
                        <div class="d-flex align-items-center justify-content-between small">
                            <div class="text-muted">Copyright &copy; Your Website 2023</div>
                            <div>
                                <a href="#">Privacy Policy</a>
                                &middot;
                                <a href="#">Terms &amp; Conditions</a>
                            </div>
                        </div>
                    </div>
                </footer>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="/resources/js/scripts.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/simple-datatables@7.1.2/dist/umd/simple-datatables.min.js" crossorigin="anonymous"></script>
        <script src="/resources/js/datatables-simple-demo.js"></script>
    </body>
</html>