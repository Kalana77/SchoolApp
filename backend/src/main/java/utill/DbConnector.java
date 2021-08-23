package utill;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnector {

    private static Connection con;

    private static DbConnector dbConnector = new DbConnector();

    private DbConnector() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/school_app","root","");

        } catch (Exception e) {
            System.out.println(e);
            System.out.println("class not found");
        }
    }

    public static Connection getConnection() {
        return con;
    }

}
