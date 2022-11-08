import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{
    private Connection connection;

    public MySQLAdsDao(Config config) throws SQLException {
        DriverManager.registerDriver(new Driver());
        this.connection = DriverManager.getConnection(
                config.getUrl(),
                config.getUser(),
                config.getPassword()
        );
    }


    @Override
    public List<Ad> all() throws SQLException {
        List<Ad> adList = new ArrayList<>();
        Statement statement = connection.createStatement();
        String selectQuery = "SELECT * FROM ads";
        ResultSet rs = statement.executeQuery(selectQuery);

        while (rs.next()) {
            Ad adToObject = new Ad(rs.getLong("user_id"), rs.getString("title"), rs.getString("description"));
            System.out.println("This is the ad: ");
            System.out.println("ID: " + rs.getLong("id"));
            adList.add(adToObject);
        }
        return adList;

    }

    @Override
    public Long insert(Ad ad) throws SQLException {
        Statement statement = connection.createStatement();
        String insertQuery = "INSERT INTO ads (title, description, user_id) VALUES ('" + ad.getTitle() + "', '" + ad.getDescription() + "', '" + ad.getUserId() + "')";
        statement.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
        ResultSet rs = statement.getGeneratedKeys();
        return null;
    }

}
