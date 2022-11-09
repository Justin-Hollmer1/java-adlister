package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class MySQLUsersDao implements Users{
    private Connection connection = null;
    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e){
            throw new RuntimeException("Cant connect to the database", e);
        }
    }
    @Override
    public User findByUsername(String username) throws SQLException {
        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM users WHERE username = " + username);
            return createUserFromResult(rs);
        } catch (SQLException e) {
            throw new RuntimeException("Cant get that user", e);
        }
    }

    public User extractUser(ResultSet rs) throws SQLException {
        return new User(
                rs.getLong("id"),
                rs.getString("username"),
                rs.getString("email"),
                rs.getString("password")
        );
    }

    public User createUserFromResult(ResultSet rs) throws SQLException {
        return extractUser(rs);
    }

    @Override
    public Long insert(User user) {
        try {
            String insertStatement = "INSERT INTO users(username, email, password) VALUES (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(insertStatement, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getPassword());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            rs.next();
            rs.getLong(1);

        } catch (SQLException e) {
            throw new RuntimeException("Couldn't create new user. ", e);
        }
        return null;
    }
}
