import java.sql.*;

class Program9_DatabaseMetaData {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root",
                "root"
            );

            DatabaseMetaData dm = con.getMetaData();

            System.out.println("Driver Name: " + dm.getDriverName());
            System.out.println("Database: " + dm.getDatabaseProductName());

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
