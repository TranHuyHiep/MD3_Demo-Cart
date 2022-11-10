package dao;

import model.Bill;
import model.BillDetail;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import static dao.ProductDao.connection;

public class BillDetailDao {
    public static void save(BillDetail billDetail) {
        try {
            String sql = "insert into billdetail (amount, id_product, id_bill) value (?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, billDetail.getAmount());
            preparedStatement.setDouble(2, billDetail.getId_product());
            preparedStatement.setDouble(3, billDetail.getId_bill());

            preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
