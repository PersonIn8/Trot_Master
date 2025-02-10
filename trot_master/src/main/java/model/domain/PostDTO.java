package model.domain;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class PostDTO {

    private int postId;        // 게시글 고유 ID (Primary Key)
    private int singerId;      // 가수 ID (Foreign Key)
    private int userId;        // 사용자 ID (Foreign Key)
    private String title;          // 게시글 제목
    private String content;        // 게시글 내용
    private String createdAt; // 게시글 작성 일시
    private LocalDateTime updatedAt; // 게시글 수정 일시
    
}