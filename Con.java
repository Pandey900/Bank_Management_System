package bank.management.system.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Con {
    Connection connection;
    Statement statement;
    public Con(){
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","xRNK59@1");
            statement=connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
