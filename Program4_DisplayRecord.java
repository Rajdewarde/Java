import java.sql.*;

class Program4_DisplayRecord {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root",
                "root"
            );

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM student");

            while(rs.next()) {
                System.out.println(
                    rs.getInt(1) + " " + rs.getString(2)
                );
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
