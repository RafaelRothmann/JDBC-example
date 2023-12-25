
import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import db.DB;

public class App {
    public static void main(String[] args) throws Exception {
        
        Connection conn = null;
        PreparedStatement st = null;
        Scanner sc = new Scanner(System.in);
        ResultSet rs = null;

        try {
            conn = DB.getConnection();
            
            int id = 1;
            String nome = "Rafael";
            int id_departamento = 1;

            st = conn.prepareStatement(
                "INSERT INTO Employee (id,nome,id_departamento) VALUES (?,?,?)"
            );

            st.setInt(1, id);
            st.setString(2, nome);
            st.setInt(3, id_departamento);

            int rowsAffected = st.executeUpdate();

            System.out.println("Done! Rows affected: " + rowsAffected);
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            sc.close();
            DB.closeResultsSet(rs);
            DB.closeStatement(st);
            DB.closeConnection();
        }

    }

}
