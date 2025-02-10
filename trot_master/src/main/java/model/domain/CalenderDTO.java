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
public class CalenderDTO {
    private int scheduleId;          // 일정 고유 ID
    private int singerId;            // 가수 ID
    private String eventTitle;       // 일정 제목
    private LocalDate eventDate;          // 일정 날짜
    private LocalDateTime eventTime;     // 일정 시간
    private String eventType;        // 일정 유형
    private String location;          // 일정 장소
    private LocalDateTime createdAt;     // 일정 등록 일시
    private LocalDateTime updatedAt;     // 일정 수정 일시
}