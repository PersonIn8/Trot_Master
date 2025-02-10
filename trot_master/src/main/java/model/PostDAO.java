package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import model.domain.PostDTO;

//게시판 DAO
public class PostDAO {
	
	private static Connection con;
    
	// 데이터베이스 연결 설정 (Connection 객체 생성)
    public PostDAO(Connection con) {
        this.con = con;
    }
  //모든 방명록 검색 후 반환
    public ArrayList<PostDTO> getAllPosts() throws SQLException {
        String sql = "SELECT post_id,user_id, title, content, created_at " +
                     "FROM Post";
        ArrayList<PostDTO> list = new ArrayList<>();
        try (PreparedStatement statement = con.prepareStatement(sql);
             ResultSet rs = statement.executeQuery(sql)) {
            while (rs.next()) {
            	// 가져온 createdAt을 LocalDateTime으로 변환
                LocalDateTime createdAt = rs.getTimestamp("CREATED_AT").toLocalDateTime();

                // 날짜 포맷 설정
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
                String formattedDate = createdAt.format(formatter);
                list.add(PostDTO.builder()
                        .postId(rs.getInt("POST_ID"))
                        .userId(rs.getInt("USER_ID"))
                        .title(rs.getString("TITLE"))
                        .content(rs.getString("CONTENT"))
                        .createdAt(formattedDate)
                        .build());
                }
        }
        return list;
    }
    public static PostDTO getContent(int postId) throws SQLException {
        String query = "SELECT post_id, user_id, title, content, created_at, updated_at FROM Post WHERE post_id = ?";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, postId);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                	// 가져온 createdAt을 LocalDateTime으로 변환
                    LocalDateTime createdAt = rs.getTimestamp("CREATED_AT").toLocalDateTime();

                    // 날짜 포맷 설정
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
                    String formattedDate = createdAt.format(formatter);
                    return PostDTO.builder()
                                  .postId(rs.getInt("POST_ID"))
                                  .userId(rs.getInt("USER_ID"))
                                  .title(rs.getString("TITLE"))
                                  .content(rs.getString("CONTENT"))
                                  .createdAt(formattedDate)
                                  .updatedAt(rs.getTimestamp("UPDATED_AT").toLocalDateTime())
                                  .build();
                } else {
                    throw new SQLException("게시물이 존재하지 않습니다.");
                }
            }
        } catch (SQLException e) {
            throw new SQLException("게시글 조회 중 오류 발생: " + e.getMessage(), e);
        }
    }
    
    // 게시글 추가
    public boolean addPost(PostDTO post) throws SQLException {
        String query = "INSERT INTO Post (userid, title, content, created_at, updated_at) VALUES (?, ?, ?, ?, ?)";
        
        try (PreparedStatement ps = con.prepareStatement(query)) {
            // 전달된 post 객체에서 값 추출하여 PreparedStatement에 설정
            ps.setInt(1, post.getUserId());  // 사용자 ID (Foreign Key)
            ps.setString(2, post.getTitle()); // 게시글 제목
            ps.setString(3, post.getContent()); // 게시글 내용
            ps.setTimestamp(4, Timestamp.valueOf(post.getCreatedAt())); // 게시글 작성일 (LocalDateTime을 Timestamp로 변환)
            ps.setTimestamp(5, Timestamp.valueOf(post.getUpdatedAt())); // 게시글 수정일 (LocalDateTime을 Timestamp로 변환)

            // 쿼리 실행
            int result = ps.executeUpdate();

            // 실행 결과가 0보다 크면 성공, 그렇지 않으면 실패
            return result > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }
	
    //게시글 삭제
	public boolean deletePost(int postId) throws SQLException {
        String query = "DELETE FROM Post WHERE post_id = ?";
        Connection con =null;
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, postId);
            int result = ps.executeUpdate();
            return result > 0;  // 성공하면 true 반환
        }
    }
	
    // 게시글 수정
    public boolean updatePost(PostDTO post) throws SQLException {
        String query = "UPDATE Post SET content = ? WHERE post_id = ?";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, post.getContent());
            ps.setInt(2, post.getPostId());
            int result = ps.executeUpdate();
            return result > 0;  // 성공하면 true 반환
        }
    }
	
}