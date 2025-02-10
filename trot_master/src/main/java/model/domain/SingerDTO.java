package model.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SingerDTO {
    private int singerId;           // 가수 고유 ID (Primary Key)
    private String name;            // 가수 이름
    private LocalDate birthDate;    // 생년월일 (DATE)
    private LocalDate debutDate;    // 데뷔 일자 (DATE)
    private String socialMedia;     // SNS 링크 (CLOB → String)
    private String imageUrl;        // 프로필 이미지 URL
    private LocalDateTime createdAt;// 정보 등록 일시 (TIMESTAMP)
    private LocalDateTime updatedAt;// 정보 수정 일시 (TIMESTAMP)
    private int totalPoint;         // 가수 총합 활동 포인트
}
