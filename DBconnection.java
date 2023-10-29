package Lib_Management;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
    static Connection con;
    public static Connection createConnection(){
        try{
            String url="jdbc:mysql://localhost:3306/library";
            String username="root";
            String password="ZeibshaikhA@16";
            con= DriverManager.getConnection(url,username,password);
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
