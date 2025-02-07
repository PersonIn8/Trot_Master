package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.DBUtil;
import model.domain.UserDTO;

public class UserDAO {

    // 1. 회원가입 (INSERT)
    public boolean registerUser(UserDTO user) {
        String sql = "INSERT INTO Users (user_id, username, email, password, phone, created_at, updated_at) " +
                     "VALUES (users_seq.NEXTVAL, ?, ?, ?, ?, SYSDATE, SYSDATE)";

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = DBUtil.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, user.getUsername());
            pstmt.setString(2, user.getEmail());
            pstmt.setString(3, user.getPassword()); // 비밀번호 해싱 필요
            pstmt.setString(4, user.getPhone());

            int result = pstmt.executeUpdate();

            return result > 0; // 성공하면 true, 실패하면 false

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn, pstmt);
        }
        return false;
    }

    // 2. 이메일 중복 확인 (SELECT)
    public boolean isEmailExist(String email) {
        String sql = "SELECT COUNT(*) FROM Users WHERE email = ?";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = DBUtil.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, email);
            rs = pstmt.executeQuery();

            if (rs.next() && rs.getInt(1) > 0) {
                return true; // 이미 존재하는 이메일
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn, pstmt, rs);
        }
        return false;
    }
    
    
    // ✅ 1. 로그인 검증 메서드
    public UserDTO loginUser(String email, String password) {
        String sql = "SELECT user_id, username, email, phone, created_at FROM Users WHERE email = ? AND password = ?";
        
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        UserDTO user = null;

        try {
            conn = DBUtil.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, email);
            pstmt.setString(2, password); // 🚀 보안 강화를 위해 해싱된 비밀번호 비교 필요

            rs = pstmt.executeQuery();

            if (rs.next()) {
                // ✅ 로그인 성공 → UserDTO 객체 반환
                user = new UserDTO(
                    rs.getInt("user_id"),
                    rs.getString("username"),
                    rs.getString("email"),
                    null, // 보안상 비밀번호는 반환하지 않음
                    rs.getString("phone"),
                    rs.getTimestamp("created_at").toLocalDateTime(),
                    null
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn, pstmt, rs);
        }
        return user; // 로그인 실패 시 null 반환
    }
    
}
