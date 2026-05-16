import java.sql.*;

class Program2_CreateTable {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root",
                "root"
            );

            Statement st = con.createStatement();

            st.executeUpdate(
                "CREATE TABLE student(id INT, name VARCHAR(20))"
            );

            System.out.println("Table Created");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
