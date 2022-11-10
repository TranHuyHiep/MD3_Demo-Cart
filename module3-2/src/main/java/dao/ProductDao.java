package dao;

import ConnectionMySQL.Connect_MySql;
import model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDao {
    public static Connection connection = Connect_MySql.getConnect();
    public static List<Product> getAll() {
        String sql = "Select * from product";
        List<Product> products = new ArrayList<>();
        try {

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String img = resultSet.getString("img");
                String name = resultSet.getString("name");
                int amount = resultSet.getInt("amount");
                double price = resultSet.getDouble("price");
                products.add(new Product(id,img,name,amount,price));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return products;
    }
    public static void save(Product product) {
        try {
            String sql = "insert into product (img,name,amount,price) value (?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,product.getImg());
            preparedStatement.setString(2,product.getName());
            preparedStatement.setInt(3,product.getAmount());
            preparedStatement.setDouble(4,product.getPrice());
            preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public static void deleteProduct(int id) {
        try {
            String sql = "DELETE FROM product WHERE id = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public static void UpdateProduct(Product product) {
        try {
            String sql = "UPDATE product set img = ?, name = ?, amount = ?, price = ?  where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, product.getImg());
            preparedStatement.setString(2,product.getName());
            preparedStatement.setInt(3, product.getAmount());
            preparedStatement.setDouble(4,product.getPrice());
            preparedStatement.setInt(5,product.getId());
            preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public static Product FindProductById(int id1)
    {
        Product products = null;
        try{
            String sql = "Select * from product where id =?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id1);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String img = resultSet.getString("img");
                String name = resultSet.getString("name");
                int amount = resultSet.getInt("amount");
                Double price = resultSet.getDouble("price");
                products = new Product(id,img,name,amount,price);
            }
            return products;
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;
    }

}
