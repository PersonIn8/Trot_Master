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
    private int singerId;
    private String name;
    private LocalDate birthDate;  // ✅ 생년월일 추가
    private LocalDate debutDate;
    private String socialMedia;
    private String imageUrl;  // ✅ 이미지 URL 필드 유지
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private int totalPoint;
}
