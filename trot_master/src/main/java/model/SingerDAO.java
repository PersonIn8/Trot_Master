package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import model.domain.SingerDTO;
import util.DBUtil;

public class SingerDAO {

    // ✅ 특정 가수 정보 가져오기 (생년월일 추가)
    public static SingerDTO getSingerById(int singerId) {
        SingerDTO singer = null;
        String query = "SELECT singer_id, name, birth_date, debut_date, social_media, image_url, created_at, updated_at, total_point FROM singers WHERE singer_id = ?";

        try (Connection conn = DBUtil.getConnection(); PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, singerId);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                singer = new SingerDTO(
                    rs.getInt("singer_id"),
                    rs.getString("name"),
                    rs.getObject("birth_date", LocalDate.class),  // ✅ 생년월일 추가
                    rs.getObject("debut_date", LocalDate.class),
                    rs.getString("social_media"),
                    rs.getString("image_url"),
                    rs.getObject("created_at", LocalDateTime.class),
                    rs.getObject("updated_at", LocalDateTime.class),
                    rs.getInt("total_point")
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return singer;
    }

    // ✅ 모든 가수의 totalPoint 내림차순 정렬하여 가져오기
    public static List<String> getTopSingersByPoint() {
        List<String> singers = new ArrayList<>();
        String query = "SELECT name, total_point FROM singers ORDER BY total_point DESC";

        try (Connection conn = DBUtil.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(query);
             ResultSet rs = pstmt.executeQuery()) {

            while (rs.next()) {
                singers.add(rs.getString("name") + " - " + rs.getInt("total_point") + "점");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return singers;
    }
}
