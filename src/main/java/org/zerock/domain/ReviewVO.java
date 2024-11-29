package org.zerock.domain;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class ReviewVO {
    private Long rno;                // 리뷰 번호
    private Long vno;                // 휴대폰 구매 번호 (외래키)
    private Long uno;                // 사용자 번호 (외래키)
    private String title;            // 리뷰 제목
    private String content;          // 리뷰 내용
    private LocalDateTime regdate;   // 리뷰 작성일
    private LocalDateTime updatedate;// 리뷰 수정일
<<<<<<< HEAD

    // 사용자 이름 (user 테이블 조인)
    private String userName;

    // 휴대폰 상세 정보 (ProductVo 조인)
    private ProductVO phoneDetails;
=======
>>>>>>> 2e99289055616f7091675884d76c17130fcb1f9d
}
