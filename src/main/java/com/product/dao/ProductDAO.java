package com.product.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.product.model.Product;


public class ProductDAO {

    private String jdbcURL = "jdbc:mysql://localhost:3306/stock_manager?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "Climbing0673!";

    private static String INSERT_INTO_PRODUCTS = "INSERT INTO products (name, description, qty, unitPrice, category) VALUES (?, ?, ?, ?, ?);";
    private static String GET_PRODUCT_BY_ID = "SELECT * FROM products WHERE id = ?;";
    private static String LIST_PRODUCTS = "SELECT * FROM products;";
    private static String UPDATE_PRODUCT = "UPDATE products SET name = ?, description = ?, qty = ?, unitPrice = ?, category = ? WHERE id = ?;";
    private static String DELETE_PRODUCT = "DELETE FROM products WHERE id = ?;";

    public ProductDAO () {}

    protected Connection getConnection() {
        Connection connection = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        }
        catch ( SQLException e ) {
            e.printStackTrace();
        }
        catch ( ClassNotFoundException e ) {
            e.printStackTrace();
        }

        return connection;
    }

    // get all products
    public List<Product> getProducts () {

        ArrayList<Product> products = new ArrayList<>();

        try (
             Connection connection = getConnection();
             PreparedStatement stmt = connection.prepareStatement(LIST_PRODUCTS);
        )
        {
            System.out.println("connected on " + stmt);
            ResultSet rs = stmt.executeQuery();


            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");

                String description = rs.getString("description");
                int qty = rs.getInt("qty");
                double unitPrice = rs.getDouble("unitPrice");
                String category = rs.getString("category");
                products.add(new Product(id, name, description, qty, unitPrice, category));
            }
        }
        catch (SQLException e ) {

        }
        return products;
    }

    public Product getProductById ( int productId ) {
        Product product = null;
        System.out.println(GET_PRODUCT_BY_ID);
        try (
            Connection con = getConnection();
            PreparedStatement preparedStatement = con.prepareStatement(GET_PRODUCT_BY_ID);
        ){
            preparedStatement.setInt( 1, productId );

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String description = rs.getString("description");
                int qty = rs.getInt("qty");
                double unitPrice = rs.getDouble("unitPrice");
                String category = rs.getString("category");
                product = new Product(id, name, description, qty, unitPrice, category);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return product;
    }

    public void insertProduct ( Product product ) {
        System.out.println(INSERT_INTO_PRODUCTS);
        try (
                Connection con = getConnection();
                PreparedStatement preparedStatement = con.prepareStatement(INSERT_INTO_PRODUCTS);
        ) {
            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getDescription());
            preparedStatement.setInt(3, product.getQty());
            preparedStatement.setDouble(4, product.getUnitPrice());
            preparedStatement.setString(5, product.getCategory());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void updateProduct ( Product product ) {
        System.out.println(UPDATE_PRODUCT);
        try (
            Connection con = getConnection();
            PreparedStatement preparedStatement = con.prepareStatement(UPDATE_PRODUCT);
        ){
            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getDescription());
            preparedStatement.setInt(3, product.getQty());
            preparedStatement.setDouble(4, product.getUnitPrice());
            preparedStatement.setString(5, product.getCategory());
            preparedStatement.setInt(6, product.getId());
            preparedStatement.executeUpdate();

        }
        catch (SQLException e ){
            e.printStackTrace();
        }
    }

    public void deleteProduct ( int productId ) {
        System.out.println(DELETE_PRODUCT);
        try (
           Connection con = getConnection();
           PreparedStatement preparedStatement = con.prepareStatement(DELETE_PRODUCT);
        ) {
            preparedStatement.setInt(1, productId);
            preparedStatement.executeUpdate();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
