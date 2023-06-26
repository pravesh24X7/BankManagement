package org.management.bank;

import java.sql.*;

public class Conn {
    Connection connection;
    Statement statement;

    public Conn(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagement","prince","devil@db007");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }


    }

}
