import java.sql.*;

class Program6_DeleteRecord {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root",
                "root"
            );

            Statement st = con.createStatement();

            st.executeUpdate(
                "DELETE FROM student WHERE id=1"
            );

            System.out.println("Record Deleted");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
