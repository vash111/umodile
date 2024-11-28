package org.zerock.domain;

import java.time.LocalDateTime;
import lombok.Data;

@Data
public class ReviewVO {

    private Long rno;               
    private Long vno;               
    private Long uno;               
    private String title;           
    private String content;         
    private LocalDateTime regdate;  
    private LocalDateTime updatedate; 
}
