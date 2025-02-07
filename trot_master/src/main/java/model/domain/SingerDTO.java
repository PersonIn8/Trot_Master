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
    private LocalDate debutDate;
    private String socialMedia; // JSON 형태의 문자열
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private int totalPoint;
}