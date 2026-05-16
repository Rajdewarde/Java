import java.sql.*;

class Program3_InsertRecord {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root",
                "root"
            );

            Statement st = con.createStatement();

            st.executeUpdate(
                "INSERT INTO student VALUES(1,'Raj')"
            );

            System.out.println("Record Inserted");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
