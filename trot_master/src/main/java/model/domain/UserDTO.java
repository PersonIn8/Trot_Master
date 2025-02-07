package model.domain;
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
public class UserDTO {
    private int userId;
    private String username;
    private String email;
    private String password;
    private String phone;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}