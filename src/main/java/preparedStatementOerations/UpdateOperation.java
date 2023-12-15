package preparedStatementOerations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdateOperation {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER EMP ID ");
        int empId = sc.nextInt() ;
        System.out.println("ENTER UPDATED SALARY ");
        double empUptSal = sc.nextDouble() ;

        String url = "jdbc:mysql://localhost:3306/j2ee?user=root&password=tiger";

        Connection conn = DriverManager.getConnection(url);
        String updateQuery = "update employee_info set empSal = ? where empId = ?";
        PreparedStatement pstmt = conn.prepareStatement(updateQuery);
        pstmt.setDouble(1 , empUptSal);
        pstmt.setInt(2 , empId);
        int n = pstmt.executeUpdate() ;
        System.out.println(n + " rows updated !!");
        conn.close();
    }
}
