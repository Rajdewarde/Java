import java.sql.*;

class Program7_PreparedStatement {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root",
                "root"
            );

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO student VALUES(?, ?)"
            );

            ps.setInt(1, 2);
            ps.setString(2, "Rohit");

            ps.executeUpdate();

            System.out.println("Record Inserted");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
