package repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect
{
    static Connection con;
    public Connect(){}
    static
    {
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(Conn.URL, Conn.UNAME, Conn.PWD);
            if (con != null)
            {
                System.out.println("Connection established successfully.");
            }
            else
            {
                System.out.println("Failed to establish connection.");
            }
        }
        catch (ClassNotFoundException e)
        {
            System.err.println("JDBC Driver not found: " + e.getMessage());
        }
        catch (SQLException e)
        {
            System.err.println("SQL Exception: " + e.getMessage());
        }
        catch (Exception e)
        {
            System.err.println("Exception: " + e.getMessage());
        }
    }
    public  static Connection getCon()
    {
        return con;
    }
}
