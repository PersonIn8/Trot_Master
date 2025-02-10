package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.domain.GoodsDTO;
import util.DBUtil;
public class GoodsDAO {
    private static final String INSERT_GOODS = "INSERT INTO GOODS  (GOODS_ID, SINGER_ID, NAME, DESCRIPTION, PRICE, STOCK_QTY, GOODS_TYPE) VALUES (1, 1, ?, ?, ?, ?, 'AA')";
    public boolean addGoods(GoodsDTO goods) {
        try (Connection connection = DBUtil.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_GOODS)) {
            preparedStatement.setString(1, goods.getName());
            preparedStatement.setString(2, goods.getDescription());
            preparedStatement.setDouble(3, goods.getPrice());
            preparedStatement.setInt(4, goods.getStockQty());
            int rowsInserted = preparedStatement.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}