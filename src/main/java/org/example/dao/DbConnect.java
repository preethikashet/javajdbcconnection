package org.example.dao;
import java.sql.*; //for sql connector
public class DbConnect {

    private static Connection co=null;
    public static Connection getConnection() throws Exception {
        if(co==null)
        {
            Class.forName("com.mysql.cj.jdbc.Driver"); //load the jdbc as driver
            co = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/school",
                    "root",
                    "pass@word1");

        }
        return co; //if connection is not newly connected, then previous connection is returned

    }

}
