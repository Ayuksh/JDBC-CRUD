package userOperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class InsertOperation {
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ROLL NO ");
        int rollNo = sc.nextInt();
        System.out.println("ENTER NAME ");
        String name = sc.next();
        System.out.println("ENTER MARKS ");
        double marks = sc.nextDouble() ;

        String query = "insert into student values ("+ rollNo+" , '"+name +"', "+marks +")";

        System.out.println("THE QUERY IS "+ query);
        Connection conn = null ;
        String url = "jdbc:mysql://localhost:3306/j2ee";
        String username = "root";
        String password = "tiger";


        conn = DriverManager.getConnection(url , username , password);

        Statement stmt = conn.createStatement();
        int n = stmt.executeUpdate(query);
        System.out.println(n + " ROWS AFFECTED !!");
    }
}
