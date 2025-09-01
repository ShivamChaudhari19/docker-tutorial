package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private String url="jdbc:postgresql://localhost:5432/postgres";
    private String username="postgres";
    private String password="shivam";
    public Connection getConnection (){
        java.sql.Connection connection;
        try {
            connection =DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return connection;
    }

}
