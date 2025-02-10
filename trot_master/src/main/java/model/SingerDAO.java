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

	public static SingerDTO getSingerById(int singerId) {
	    SingerDTO singer = null;
	    String query = "SELECT singer_id, name, birth_date, debut_date, social_media, image_url, created_at, updated_at, total_point FROM Singer WHERE singer_id = ?";

	    try (Connection conn = DBUtil.getConnection();
	         PreparedStatement pstmt = conn.prepareStatement(query)) {
	        pstmt.setInt(1, singerId);
	        ResultSet rs = pstmt.executeQuery();

	        if (rs.next()) {
	            singer = new SingerDTO(
	                rs.getInt("singer_id"),
	                rs.getString("name"),
	                rs.getObject("birth_date", LocalDate.class),
	                rs.getObject("debut_date", LocalDate.class),
	                rs.getString("social_media"),
	                rs.getString("image_url"),
	                rs.getObject("created_at", LocalDateTime.class),
	                rs.getObject("updated_at", LocalDateTime.class),
	                rs.getInt("total_point")
	            );
	        } else {
	            System.out.println("❌ [ERROR] DB에서 singer_id=" + singerId + " 데이터를 찾을 수 없음.");
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return singer;
	}


	public static List<String> getTopSingersByPoint() {
	    List<String> singers = new ArrayList<>();
	    String query = "SELECT name, total_point FROM Singer ORDER BY total_point DESC";

	    try (Connection conn = DBUtil.getConnection();
	         PreparedStatement pstmt = conn.prepareStatement(query);
	         ResultSet rs = pstmt.executeQuery()) {

	        System.out.println("🔍 [DEBUG] getTopSingersByPoint 실행됨");

	        while (rs.next()) {
	            String singerInfo = rs.getString("name") + " - " + rs.getInt("total_point") + "점";
	            singers.add(singerInfo);
	            System.out.println("✅ [SUCCESS] 랭킹 추가됨: " + singerInfo);
	        }

	    } catch (Exception e) {
	        e.printStackTrace();
	        System.out.println("❌ [ERROR] getTopSingersByPoint 실행 중 오류 발생!");
	    }
	    return singers;
	}

}
