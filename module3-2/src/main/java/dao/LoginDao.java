package dao;

import ConnectionMySQL.Connect_MySql;
import model.Account;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;

public class LoginDao {

    public static Account login(String username ,String password){
        try{
            String sql = "select * from account where username = ? and password = ?";
            Connection connection = Connect_MySql.getConnect();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);
            ResultSet resultSet = preparedStatement.executeQuery();
            Account account = null;
            if(resultSet.next())
            {
                int id = resultSet.getInt("id");
                String username1 = resultSet.getString("username");
                String password1 = resultSet.getString("password");
                String phonenumber = resultSet.getString("phonenumber");
                String email = resultSet.getString("email");
                LocalDate birthday = resultSet.getDate("birthday").toLocalDate();
                Boolean status = resultSet.getBoolean("status");
                int id_role = resultSet.getInt("id_role");
                account = new Account(id,username1,password1,phonenumber,email,birthday,status,id_role);
            }
            return account;
        }catch (SQLException e)
        {
            e.printStackTrace();
            return null;
        }
    }

}
