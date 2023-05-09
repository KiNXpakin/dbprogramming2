package dbprogramming2;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


public class LAB8 {
    public static void main(String[] args) {
        String URL ="jdbc:mysql://localhost:3306/mydb2";
        String username = "root";
        String password = "mysql@sit";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(URL, username, password);
            Statement statement= con.createStatement();
            String sql = "select * from student";
            ResultSet results = statement.executeQuery(sql);

            while(results.next()){
                System.out.println(results.getString(1)+" "+
                        results.getString(2)+" " +
                        results.getString(3)+" "+
                        results.getString(4)
                );
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB8.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB8.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
}
