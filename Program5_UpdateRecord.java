import java.sql.*;

class Program5_UpdateRecord {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root",
                "root"
            );

            Statement st = con.createStatement();

            st.executeUpdate(
                "UPDATE student SET name='Amit' WHERE id=1"
            );

            System.out.println("Record Updated");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
