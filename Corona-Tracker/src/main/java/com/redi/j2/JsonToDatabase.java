package com.redi.j2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



public class JsonToDatabase {
    public static Connection ConnectToDB() throws Exception {
        //Registering the Driver
       // DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        //Getting the connection
        String mysqlUrl = "jdbc:mysql://localhost:3306/CoronaDB";
        Connection con = DriverManager.getConnection(mysqlUrl, "root", "12356");
        System.out.println("Connection established......");
        return con;
    }
}