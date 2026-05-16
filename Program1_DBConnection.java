import java.sql.*;

class Program1_DBConnection {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root",
                "root"
            );

            System.out.println("Connection Successful");
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
