package com.redi.j2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



public class JsonToDatabase {

    public static Connection ConnectToDB() throws Exception {
        //Registering the Driver
        Class.forName("com.mysql.jdbc.Driver");
        //Getting the connection
        String mysqlUrl = "jdbc:mysql://localhost:3306/coronadb?autoReconnect=true&useSSL=false";
        Connection con = DriverManager.getConnection(mysqlUrl, "root", "mypass");
        System.out.println("Connection established......");
        return con;
    }

/*
public static void main(String args[])  {
        String mysqlUrl = "jdbc:mysql://localhost:3306/coronadb?autoReconnect=true&useSSL=false";
        String user = "root";
        String password = "mypass";
        try {
            Connection con = DriverManager.getConnection(mysqlUrl,user, password);
            System.out.println("Connection established......");
        }catch (SQLException e){
            System.out.println("error");
            e.printStackTrace();
        }

                }
*/

    public static void main(String args[]) {
        //Creating a JSONParser object
        JSONParser jsonParser = new JSONParser();
        try {
            //Parsing the contents of the JSON file
            JSONArray jsonArray = (JSONArray) jsonParser.parse(new FileReader("C:\\Users\\Abdulnaser\\RediIntermediateJava\\Corona-Tracker/MyJson.json"));
            System.out.println(jsonArray);
            //Retrieving the array
            Connection con = ConnectToDB();
            //Insert a row into the MyPlayers table
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO all_countries values (?, ?, ?, ?, ?, ? ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ?, ?, )");

            for(Object object : jsonArray) {
                JSONObject record = (JSONObject) object;
                System.out.println(record.get("country"));

                int id = Integer.parseInt((String) record.get("_id"));
                String update = (String) record.get("update");
                String country = (String) record.get("country");
                String iso2 = (String) record.get("iso2");
                String iso3 = (String) record.get("iso3");
                int lat_ = Integer.parseInt((String) record.get("lat"));
                int long_ = Integer.parseInt((String) record.get("long"));
                String flag = (String) record.get("flag");
                int cases = Integer.parseInt((String) record.get("cases"));
                int todayCases = Integer.parseInt((String) record.get("todayCases"));
                int deaths = Integer.parseInt((String) record.get("deaths"));
                int recovered = Integer.parseInt((String) record.get("recovered"));
                int todayRecovered = Integer.parseInt((String) record.get("todayRecovered"));
                int active = Integer.parseInt((String) record.get("active"));
                int critical = Integer.parseInt((String) record.get("critical"));
                int casesPerOneMillion = Integer.parseInt((String) record.get("casesPerOneMillion"));
                int deathsPerOneMillion = Integer.parseInt((String) record.get("deathsPerOneMillion"));
                int tests = Integer.parseInt((String) record.get("tests"));
                int testsPerOneMillion = Integer.parseInt((String) record.get("testsPerOneMillion"));
                int population = Integer.parseInt((String) record.get("population"));
                String continent = (String) record.get("continent");
                int oneCasePerPeople = Integer.parseInt((String) record.get("oneCasePerPeople"));
                int oneDeathPerPeople = Integer.parseInt((String) record.get("oneDeathPerPeople"));
                int oneTestPerPeople = Integer.parseInt((String) record.get("oneTestPerPeople"));
                int activePerOneMillion = Integer.parseInt((String) record.get("activePerOneMillion"));
                int recoveredPerOneMillion = Integer.parseInt((String) record.get("recoveredPerOneMillion"));
                int criticalPerOneMillion = Integer.parseInt((String) record.get("criticalPerOneMillion"));

                /*pstmt.setInt(1, id);
                pstmt.setString(2, update);
                pstmt.setString(3, country);
                pstmt.setString(4, iso2);
                pstmt.setString(5, iso3);
                pstmt.setInt(6, lat_);
                pstmt.executeUpdate();*/
            }
            System.out.println("Records inserted.....");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}