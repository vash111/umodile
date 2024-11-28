<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<link href="${path}/resources/csss/index.css" rel="stylesheet"/> 
<link href="${path}/resources/csss/phoneProductMain.css" rel="stylesheet"/> 
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Inter:ital,opsz,wght@0,14..32,100..900;1,14..32,100..900&family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&display=swap" rel="stylesheet">
</head>

<body>
 <%@ include file="../includes/header.jsp"%>
 
  <div class="accession">
    <h1>가입 신청</h1>
  </div>
  <!--  슬라이더 시작  -->
    
    <div class="slider-container">
        <div class="slider">
            <div class="slide">
                <img src="${pageContext.request.contextPath}/resources/img/slider.png" alt="슬라이드 1">
            </div>
            <div class="slide">
                <img src="${pageContext.request.contextPath}/resources/img/slider2.png" alt="슬라이드 2">
            </div>
            <div class="slide">
                <img src="${pageContext.request.contextPath}/resources/img/slider3.png" alt="슬라이드 3">
            </div>
        </div>
        <button class="prev">&#10094;</button>
        <button class="next">&#10095;</button>
    </div>
    <!--  슬라이더 끝  -->
    
    <!-- 추천 받기 -->
    
    <div class="unit-origin">
       <div class="box-filter-wrap">
          <div class="box-filter">
             <button class="btn-extend border-gy md-ripples ripples-light gtm-tracking" style="position: relative; top: -9px;">
             나에게 맞는 휴대폰 추천찾기
             </button>
             <button class="accordian-search border-gy md-ripples ripples-light on">
             나에게 맞는 휴대폰 직접 찾아보기
             </button>
          </div>
          <div class="accordian-search-result on">
             <ul class="bulkhead" id="searchList">
               <li>
                 <h3 class="main-txt">휴대폰 상태</h3>
                 <div class="box-btn">
                     <div class="btn-check fw600">
                        <label for="newPhone">
                           <span class="ico-check">
                              
                       
                           </span>
                           새폰
                        </label>
                     </div>
                     <div class="btn-check fw600">
                        <label for="newPhone">
                           <span class="ico-check">
                              
                       
                           </span>
                           중고폰
                        </label>
                     </div>
                     <div class="btn-check fw600">
                        <label for="newPhone">
                           <span class="ico-check">
                              
                       
                           </span>
                           리퍼폰
                        </label>
                     </div>
                 </div>
               </li>
                  <li>
                 <h3 class="main-txt">희망 요금제</h3>
                 <div class="box-btn">
                     <div class="btn-check fw600">
                        <label for="newPhone">
                           <span class="ico-check">
                              
                       
                           </span>
                           LTE요금제
                        </label>
                     </div>
                     <div class="btn-check fw600">
                        <label for="newPhone">
                           <span class="ico-check">
                              
                       
                           </span>
                           5G요금제
                        </label>
                     </div>
                 </div>
               </li>
                  <li>
                 <h3 class="main-txt">제조사</h3>
                 <div class="box-btn">
                     <div class="btn-check fw600">
                        <label for="newPhone">
                           <span class="ico-check">
                              
                       
                           </span>
                           삼성
                        </label>
                     </div>
                     <div class="btn-check fw600">
                        <label for="newPhone">
                           <span class="ico-check">
                              
                       
                           </span>
                           애플
                        </label>
                     </div>
                     <div class="btn-check fw600">
                        <label for="newPhone">
                           <span class="ico-check">
                              
                       
                           </span>
                           기타
                        </label>
                     </div>
                 </div>
               </li>
                <li>
                 <h3 class="main-txt">요금제</h3>
                 <div class="box-btn">
                      <a href="" class="btn-text-right">원하는 요금제를 적용해 보세요</a>
                 </div>
               </li>
             </ul>
          </div>
       </div>
    </div>
    
    <!-- 추천 받기 끝 -->
    
    
    <!--  상품리스트  -->
    <div class="intro-list-wrap">
         <ul class="link_group">
             <li id="rcThmeYn" class="on">
              <a href="#">인기순</a>
             </li>
             <li id="cmt">
               <a href="#">최신순</a>
             </li>
             <li id="amtMin">
             <a href="#">월 납부금액 낮은순</a>
             </li>
         </ul>
         <div class="listWrap" id="listWrap-class">
            <ul class="card-group">
              <li>
                <a href="/phone/PhoneDetail"> 
                   <div class="chip-wrap">
                      <img src="${pageContext.request.contextPath}/resources/img/rkrtjdql.png" alt="">
                      <img src="${pageContext.request.contextPath}/resources/img/gkfdls.png" alt="">
                   </div>
                   <div class="phone-img">
                      <img src="${pageContext.request.contextPath}/resources/img/A24_10.png">
                   </div>
                   <div class="phone-cont">
                      <div class="phone-cont-top">
                         <h3 class="main-txt">
                           <span class="chip">
                              <img src="${pageContext.request.contextPath}/resources/img/chip-lte.png">
                           </span>
                           삼성 갤럭시 A24
                         </h3>
                         <p>LTE (1.5GB/통화기본)</p>
                         <p>통신요금 25,900원+할부금 0원</p>
                         
                      </div>
                        <div class="phone-cont-bottom">
                            <p class="normal-txt">
                              월 납부금액
                              <strong class="txt-vt">
                                 <span class="dc-prc">25,500원</span>
                                 19,300원
                              </strong>
                            </p>
                         </div>   
                   </div>
                </a>  
              </li>
              <li>
                <a href="#"> 
                   <div class="chip-wrap">
                      <img src="${pageContext.request.contextPath}/resources/img/dlsrl.png" alt="">
                   </div>
                   <div class="phone-img">
                      <img src="${pageContext.request.contextPath}/resources/img/A35 front.png">
                   </div>
                   <div class="phone-cont">
                      <div class="phone-cont-top">
                         <h3 class="main-txt">
                           <span class="chip">
                              <img src="${pageContext.request.contextPath}/resources/img/chip-5g.png">
                           </span>
                           삼성 갤럭시 A35
				      
                         </h3>
                         <p>5G (5GB/3000분)</p>
                         <p>통신요금 25,400원+할부금 0원</p>
                         
                      </div>
                        <div class="phone-cont-bottom">
                            <p class="normal-txt">
                              월 납부금액
                              <strong class="txt-vt">
                                 25,400원
                              </strong>
                            </p>
                         </div>   
                   </div>
                </a>  
              </li>
                 <li>
                <a href="#"> 
                   <div class="chip-wrap">
                      <img src="${pageContext.request.contextPath}/resources/img/신규(6).png" alt="">
                     <img src="${pageContext.request.contextPath}/resources/img/플래그쉽(2).png" alt="">
                     <img src="${pageContext.request.contextPath}/resources/img/chip-slevel.png" alt="">
                   </div>
                   <div class="phone-img">
                      <img src="${pageContext.request.contextPath}/resources/img/036-galaxy-zflip5.png">
                   </div>
                   <div class="phone-cont">
                      <div class="phone-cont-top">
                         <h3 class="main-txt">
                           <span class="chip">
                              <img src="${pageContext.request.contextPath}/resources/img/chip-5g.png">
                           </span style="pont-size:10px;">
                           (미개통) 갤럭시 Z플립5
                         </h3>
                         <p>5G (5GB/3000분)</p>
                         <p>통신요금 25,400원+할부금 0원</p>
                         
                      </div>
                        <div class="phone-cont-bottom">
                            <p class="normal-txt">
                              월 납부금액
                              <strong class="txt-vt">
                                 36,610원
                              </strong>
                            </p>
                         </div>   
                   </div>
                </a>  
              </li>
               <li>
                <a href="#"> 
                   <div class="chip-wrap">
                      <img src="${pageContext.request.contextPath}/resources/img/P_공시강화.png" alt="">
                     <img src="${pageContext.request.contextPath}/resources/img/추가 상품권.png" alt="">
                   </div>
                   <div class="phone-img">
                      <img src="${pageContext.request.contextPath}/resources/img/redmi note 13.png">
                   </div>
                   <div class="phone-cont">
                      <div class="phone-cont-top">
                         <h3 class="main-txt">
                           <span class="chip">
                              <img src="${pageContext.request.contextPath}/resources/img/chip-lte.png">
                           </span style="pont-size:10px;">
                           Redmi Note 13 256G
                         </h3>
                         <p>LTE (2GB/120분)</p>
                         <p>통신요금 19,000원+할부금 0원</p>
                         
                      </div>
                        <div class="phone-cont-bottom">
                            <p class="normal-txt">
                              월 납부금액
                              <strong class="txt-vt">
                                 19,000원
                              </strong>
                            </p>
                         </div>   
                   </div>
                </a>  
              </li>
              <li>
                <a href="#"> 
                   <div class="chip-wrap">
                      <img src="${pageContext.request.contextPath}/resources/img/P_공시강화.png" alt="">
                     <img src="${pageContext.request.contextPath}/resources/img/추가 상품권.png" alt="">
                   </div>
                   <div class="phone-img">
                      <img src="${pageContext.request.contextPath}/resources/img/003_galaxynote10_product.png">
                   </div>
                   <div class="phone-cont">
                      <div class="phone-cont-top">
                         <h3 class="main-txt">
                           <span class="chip">
                              <img src="${pageContext.request.contextPath}/resources/img/chip-5g.png">
                           </span style="pont-size:10px;">
                           Redmi Note 13 256G
                         </h3>
                         <p>LTE (2GB/120분)</p>
                         <p>통신요금 19,000원+할부금 0원</p>
                         
                      </div>
                        <div class="phone-cont-bottom">
                            <p class="normal-txt">
                              월 납부금액
                              <strong class="txt-vt">
                                 19,000원
                              </strong>
                            </p>
                         </div>   
                   </div>
                </a>  
              </li>
              <li>
                <a href="#"> 
                   <div class="chip-wrap">
                      <img src="${pageContext.request.contextPath}/resources/img/P_공시강화.png" alt="">
                     <img src="${pageContext.request.contextPath}/resources/img/새제품.png" alt="">
                   </div>
                   <div class="phone-img">
                      <img src="${pageContext.request.contextPath}/resources/img/002_galaxy_s23plus.png">
                   </div>
                   <div class="phone-cont">
                      <div class="phone-cont-top">
                         <h3 class="main-txt">
                           <span class="chip">
                              <img src="${pageContext.request.contextPath}/resources/img/chip-5g.png">
                           </span style="pont-size:10px;">
                           갤럭시 S23+ 256G
                         </h3>
                         <p>5G (5GB/200분)</p>
                         <p>통신요금 23,500원+할부금 25,520원</p>
                         
                      </div>
                        <div class="phone-cont-bottom">
                            <p class="normal-txt">
                              월 납부금액
                              <strong class="txt-vt">
                                 19,000원
                              </strong>
                            </p>
                         </div>   
                   </div>
                </a>  
              </li>
            </ul>
         </div>
    </div>
    <!--  상품리스트 끝  -->
 

 
 <%@ include file="../includes/mainfooter.jsp"%> 
</body>
</html>
<script>
document.addEventListener('DOMContentLoaded', function () {
    var i = 0;
    var slideCount = 1; 
    var slides = document.querySelectorAll('.slider .slide');
    var totalSlides = slides.length;
    var slideInterval;

    // 초기 슬라이드 숨기기
    for (var j = slideCount; j < totalSlides; j++) {
        slides[j].style.display = 'none';
    }

    // 슬라이드 업데이트 함수
    function updateSlider() {
        // 현재 슬라이드를 숨기고, 새로운 슬라이드를 표시
        for (var j = 0; j < totalSlides; j++) {
            slides[j].style.display = 'none';
        }
        // 슬라이드를 표시
        for (var j = i; j < i + slideCount && j < totalSlides; j++) {
            slides[j].style.display = 'block';
        }
    }

    // 이전 버튼 클릭
    document.querySelector('.prev').addEventListener('click', function () {
        i = (i === 0) ? totalSlides - slideCount : i - slideCount;
        updateSlider();
        restartAutoSlide(); // 버튼 클릭 시 자동 슬라이드 재시작
    });

    // 다음 버튼 클릭
    document.querySelector('.next').addEventListener('click', function () {
        i = (i === totalSlides - slideCount) ? 0 : i + slideCount;
        updateSlider();
        restartAutoSlide(); // 버튼 클릭 시 자동 슬라이드 재시작
    });

    // 자동 슬라이드 함수
    function startAutoSlide() {
        slideInterval = setInterval(function () {
            i = (i === totalSlides - slideCount) ? 0 : i + slideCount;
            updateSlider();
        }, 5000); // 5초 간격으로 슬라이드 전환
    }

    // 자동 슬라이드 재시작
    function restartAutoSlide() {
        clearInterval(slideInterval); // 기존 타이머 중단
        startAutoSlide(); // 새 타이머 시작
    }

    // 초기 상태 및 자동 슬라이드 시작
    updateSlider();
    startAutoSlide();
});
/* 선택 시 보라색 변경 */
document.querySelectorAll('.ico-check').forEach((element) => {
    element.addEventListener('click', () => {
        element.classList.toggle('active');
    });
});

/* 선택 시 보라색 변경 끝 */



</script>