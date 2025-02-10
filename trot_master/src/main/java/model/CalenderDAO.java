package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import model.domain.CalenderDTO;
import util.DBUtil;
//공연 일정
public class CalenderDAO {
	private List<CalenderDTO> schedules = new ArrayList<>(); // 일정 데이터를 저장하는 리스트
	String query = "SELECT * FROM (" +
            "SELECT * FROM CALENDAR WHERE SINGER_ID = 1 ORDER BY EVENT_TIME" +
            ") WHERE ROWNUM <= 3";
	public List<CalenderDTO> findRecentSchedules() {
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(query)) {
			LocalDateTime now = LocalDateTime.now();
			preparedStatement.setTimestamp(1, Timestamp.valueOf(now));
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				CalenderDTO schedule = new CalenderDTO(resultSet.getInt("SCHEDULE_ID"), resultSet.getInt("SINGER_ID"),
						resultSet.getString("EVENT_TITLE"), resultSet.getDate("EVENT_DATE").toLocalDate(),
						resultSet.getTimestamp("EVENT_TIME").toLocalDateTime(), resultSet.getString("EVENT_TYPE"),
						resultSet.getString("LOCATION"), resultSet.getTimestamp("CREATED_AT").toLocalDateTime(),
						resultSet.getTimestamp("UPDATED_AT").toLocalDateTime());
				schedules.add(schedule);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return schedules;
	}
}