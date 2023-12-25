import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

import db.DB;

public class App {
    public static void main(String[] args) throws Exception {
        
       

        try {
            Connection conn = DB.getConnection();
            Statement st = null;
            ResultSet rt = null;
            
            DB.closeConnection();
        } catch (Exception e) {
            
        }
    }
}
