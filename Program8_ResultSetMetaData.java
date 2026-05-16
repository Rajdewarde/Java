import java.sql.*;

class Program8_ResultSetMetaData {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root",
                "root"
            );

            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("SELECT * FROM student");

            ResultSetMetaData md = rs.getMetaData();

            System.out.println("Columns: " + md.getColumnCount());

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
