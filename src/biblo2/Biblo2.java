/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblo2;

/**
 *
 * @author HP
 */
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Biblo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         // creates Connection object
          Connection conn1 = null;
   try {
            // connect way #1
            String url1 = "jdbc:mysql://localhost:3306/bib";
            String user = "root";
            String password = "";

            conn1 = DriverManager.getConnection(url1, user, password);
            if (conn1 != null) {
                System.out.println("Connected to the database ecommerce");
                
                Statement stmt = conn1.createStatement();   //Creating Statement.
                //Executing Statement.
               // stmt.executeUpdate("create table `ScoreHistory`(`id` integer, `Player1` varchar(20), `Player2` varchar(20), `Score` integer)");
                stmt.executeUpdate("insert into `biblo` values(5, 'Black', 'White','m@g.com','10')");
                stmt.executeUpdate("insert into `biblo` values(4, 'Black', 'White','m@g.com','10')");
                
            }
            
        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();

        }
        finally {
            if (conn1 != null) {
                try {
                    conn1.close();
                }
                catch(Exception ex) {
                    ex.printStackTrace();
                }
            }
}
        
    }
  
}

    
    


