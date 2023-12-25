import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.DB;

public class App {
    public static void main(String[] args) throws Exception {
        
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            conn = DB.getConnection();
            st = conn.createStatement();

            rs = st.executeQuery("Select * From Departament");

            while (rs.next()) {
                System.err.println(rs.getInt("Id") + " , " + rs.getString("nome") + " , " + rs.getInt("pessoas"));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            DB.closeResultsSet(rs);
            DB.closeStatement(st);
            DB.closeConnection();
        }

    }
}
