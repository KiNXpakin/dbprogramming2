package dbprogramming2;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class dbprogramming2 {
    public static void main(String[] args) {
        String URL ="jdbc:mysql://localhost:3306/mydb2";
        String username = "root";
        String password = "mysql@sit";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
            Connection con = DriverManager.getConnection(URL, username, password);
            System.out.println("Databased Connected");
            Statement statement= con.createStatement();

        }
        catch (ClassNotFoundException ex){
            Logger.getLogger(dbprogramming2.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (SQLException ex) {
            Logger.getLogger(dbprogramming2.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
}
