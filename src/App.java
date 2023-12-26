
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;

public class App {
    public static void main(String[] args) throws Exception {
        Connection conn = null;
        PreparedStatement st = null;

        try {
            conn = DB.getConnection();
            
            st = conn.prepareStatement(
                "UPDATE Employee SET salario = (salario * ?) WHERE (id = ? and nome = ?)"
            );

            st.setInt(1, 2);
            st.setInt(2, 1);
            st.setString(3, "Daniel");

            int rowsAffected = st.executeUpdate();

            System.out.println("Done! Rows affected: " + rowsAffected);
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            DB.closeStatement(st);
            DB.closeConnection();
        }

    }

}
