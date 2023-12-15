package curdOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteOperation {
    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/j2ee",
                                                            "root" , "tiger");
            Statement stmt = conn.createStatement() ;
            String q1 = "delete from student where rollNo = 101";
            stmt.executeUpdate(q1);
            System.out.println("DELETE SUCCESSFULL !!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
