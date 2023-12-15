package curdOperation;

import java.sql.*;

public class SelectOperation {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/j2ee";
        String userName = "root";
        String password = "tiger";
        Connection conn = null ;

        conn = DriverManager.getConnection(url , userName , password);
        Statement stmt = conn.createStatement() ;
        String q1 = "select * from student";
        ResultSet rs = stmt.executeQuery(q1);

        while (rs.next())
        {
            System.out.println(rs.getInt(1)
                    +"  "
                    +rs.getString(2)
                    + "  "
                    +rs.getDouble(3));
        }
        conn.close();
    }



}
