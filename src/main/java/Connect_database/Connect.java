package Connect_database;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

public class Connect {
    private  static String username = "root";
    private static String password = "";
    public Connect() {
    }

    public Connection getConnection() {
        Connection  connection = null;
        try{
            // dang ky driver
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());


            String Url = "jdbc:mySQL://localhost:3306/managerhomstay?";

            connection = DriverManager.getConnection(Url,username,password);
        }
        catch (Exception e ) {
            e.printStackTrace();
        }
        return connection;
    }
    public void closeConnection(Connection connection) {
        try{

             if(connection != null) {
                 connection.close();

             }
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

}
