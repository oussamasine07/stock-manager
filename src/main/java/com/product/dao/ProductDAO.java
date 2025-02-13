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

    private static String INSERT_INTO_PRODUCTS = "INSERT INTO products (name, description, qty, unitPrice, category) VALUES ('Tablet', 'qldkfdlf adjfha fjahf fajh adoha jhad foah', 10, 400, 'tech');";
    private static String GET_PRODUCT_BY_ID = "SELECT * FROM products WHERE id = ?;";
    private static String LIST_PRODUCTS = "SELECT * FROM products;";
    private static String UPDATE_PRODUCT = "UPDATE products SET name = ? SET description = ? SET qty = ? SET unitPrice = ? SET category = ? WHERE id = ?;";
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


}
