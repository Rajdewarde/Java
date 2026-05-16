import java.sql.*;

class Program10_TransactionManagement {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root",
                "root"
            );

            con.setAutoCommit(false);

            Statement st = con.createStatement();

            st.executeUpdate(
                "INSERT INTO student VALUES(3,'Karan')"
            );

            st.executeUpdate(
                "INSERT INTO student VALUES(4,'Rahul')"
            );

            con.commit();

            System.out.println("Transaction Successful");

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
