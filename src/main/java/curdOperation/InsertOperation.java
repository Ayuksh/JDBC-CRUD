package curdOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertOperation {

    public static void main(String[] args) {
        Connection conn = null ;

        String url = "jdbc:mysql://localhost:3306/j2ee";
        try {
            conn = DriverManager.getConnection(url, "root", "tiger");
            System.out.println("CONNECTION SUCCESSFULL !!");
            String query = "INSERT INTO STUDENT VALUES (103 , 'KARAN' , 75.85)";
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(query);
            System.out.println("QUERY EXECUTED SUCCESSFULLY !!");
        }catch (SQLException s)
        {
            System.out.println(s);
        }
    }

}
