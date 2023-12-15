package curdOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateOperation {

    public static void main(String[] args) {
        Connection conn = null ;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/j2ee"
                                                , "root"
                                                , "tiger");
            Statement stmt = conn.createStatement();
            String q1 = "update student set marks = 99.90 where rollno = 101";
            stmt.executeUpdate(q1);
            System.out.println("UPDATE SUCCESSFULL ");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

}
