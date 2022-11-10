package dao;

import ConnectionMySQL.Connect_MySql;
import model.Account;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {

    public static void save(Account account) {
        try {
            String sql = "insert into account(username,password,phonenumber,email,birthday,status,id_role) value (?,?,?,?,?,?,?)";
            Connection connection = Connect_MySql.getConnect();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, account.getUsername());
            preparedStatement.setString(2, account.getPassword());
            preparedStatement.setString(3, account.getPhonenumber());
            preparedStatement.setString(4,account.getEmail());
            preparedStatement.setDate(5,Date.valueOf(account.getBirthday()));
            preparedStatement.setBoolean(6,true);
            preparedStatement.setInt(7,2);
            preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();

        }
    }
}
