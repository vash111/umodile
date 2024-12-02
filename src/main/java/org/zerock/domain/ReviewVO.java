package org.zerock.domain;

import java.security.Timestamp;
import java.time.LocalDateTime;
import lombok.Data;

@Data
public class ReviewVO {
    private Long rno;
    private Long vno;
    private Long uno;
    private String title;
    private String content;
    private Timestamp regdate;
    private Timestamp updatedate;
    private String userName; // 추가된 사용자 이름
    private String phoneName; // 휴대폰 이름 추가
    private String phoneColor; // 휴대폰 색상 추가
    private String phonePrice; // 휴대폰 가격 추가
    public String getPhoneName() {
        return phoneName;
    }
    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

}
