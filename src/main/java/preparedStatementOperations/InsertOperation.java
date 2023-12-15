package preparedStatementOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertOperation {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER EMP ID ");
        int empId = sc.nextInt() ;
        System.out.println("ENTER EMP NAME ");
        String empName = sc.next() ;
        System.out.println("ENTER EMP DESIGNATION ");
        String designation = sc.next() ;
        System.out.println("ENTER EMP SALARY ");
        double empSal = sc.nextDouble() ;

        String url = "jdbc:mysql://localhost:3306/j2ee";
        String username = "root";
        String password = "tiger";
        Connection conn = DriverManager.getConnection(url , username , password);

        String insertQuery = "insert into employee_info values ( ? , ? , ? , ?);";

        PreparedStatement pstmt = conn.prepareStatement(insertQuery);
        pstmt.setInt(1 , empId );
        pstmt.setString(2 , empName);
        pstmt.setString(3 , designation);
        pstmt.setDouble(4 , empSal);

        int n = pstmt.executeUpdate();
        System.out.println(n+ " ROWS INSERTED !!");




    }

}
