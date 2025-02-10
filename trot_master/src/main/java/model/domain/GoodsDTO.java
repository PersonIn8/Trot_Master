package model.domain;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class GoodsDTO {
    private int goodsId;          // 굿즈 고유 ID
    private int singerId;         // 가수 ID
    private String name;          // 굿즈 이름
    private String description;    // 굿즈 설명
    private float price;      // 가격
    private int stockQty;         // 재고 수량
    private String goodsType;     // 공식/비공식 타입
    private LocalDateTime createdAt; // 굿즈 등록 일시
    private LocalDateTime updatedAt; // 굿즈 수정 일시
}

