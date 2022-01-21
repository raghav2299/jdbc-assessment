package com.dxc.assessment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final String SQL_CREATE= "CREATE TABLE AUTHORS"
      +"(" 
      + "id int not null auto_increment,"
      +"first_name varchar(255),"
       +"last_name varchar(255),"
      +  "genre varchar(50),"
      +"email varchar(50),"
      + "primary key (id)"
    
       +" )";

        
    
    public static void main( String[] args ) throws SQLException
    {
        System.out.println( "Hello World!" );

        Connection conn =DriverManager.getConnection("com.mysql.jdbc.Driver");
        Statement Statement= conn.createStatement();
            Statement.execute(SQL_CREATE);
            
        }
   }

