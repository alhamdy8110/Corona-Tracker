package com.redi.j2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



public class JsonToDatabase {

    public static Connection ConnectToDB() throws Exception {
        //Registering the Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
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
            //System.out.println(jsonArray);
            //Retrieving the array
            Connection con = ConnectToDB();
            //Insert a row into the MyPlayers table
            PreparedStatement pstmt = con.prepareStatement("INSERT INTO all_countries values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
            //PreparedStatement pstmt = con.prepareStatement("INSERT INTO countries values (?)");

            long lat_ = 0;
            long long_ = 0;
            long activePerOneMillion = 0;
            long recoveredPerOneMillion = 0;
            long criticalPerOneMillion = 0;

            for(Object object : jsonArray) {

                JSONObject record = (JSONObject) object;

                long update = (long) record.get("updated");

                JSONObject countryInfo = (JSONObject) record.get("countryInfo");
                //System.out.println(country);

                if (countryInfo.get("_id") == null ){
                    System.out.println("ID is missing");
                }else {

                    System.out.println(record);
                    long country_id = (long) countryInfo.get("_id");
                    String country = (String) record.get("country");
                    String iso2 = (String) record.get("iso2");
                    String iso3 = (String) record.get("iso3");

                    if (countryInfo.get("lat") instanceof Double){
                        lat_ = ((Double) countryInfo.get("lat")).longValue();
                    }else {
                         lat_ = (long) countryInfo.get("lat");
                    }
                    if (countryInfo.get("long")instanceof Double){
                        long_ = ((Double) countryInfo.get("long")).longValue();
                    }else {
                        long_ = (long) countryInfo.get("long");
                    }

                    String flag = (String) countryInfo.get("flag");
                    long cases = (long) record.get("cases");
                    long todayCases = (long)record.get("todayCases");
                    long deaths = (long) record.get("deaths");
                    long todayDeaths = (long)record.get("todayDeaths");
                    long recovered = (long) record.get("recovered");
                    long todayRecovered = (long) record.get("todayRecovered");
                    long active = (long) record.get("active");
                    long critical = (long) record.get("critical");
                    long casesPerOneMillion = (long) record.get("casesPerOneMillion");
                    long deathsPerOneMillion = (long) record.get("deathsPerOneMillion");
                    long tests = (long) record.get("tests");
                    long testsPerOneMillion = (long) record.get("testsPerOneMillion");
                    long population = (long) record.get("population");
                    String continent = (String) record.get("continent");
                    long oneCasePerPeople = (long) record.get("oneCasePerPeople");
                    long oneDeathPerPeople = (long) record.get("oneDeathPerPeople");
                    long oneTestPerPeople = (long)record.get("oneTestPerPeople");

                    if (record.get("activePerOneMillion") instanceof Double){
                        activePerOneMillion = ((Double) record.get("activePerOneMillion")).longValue();
                    }else {
                        activePerOneMillion = (long) record.get("activePerOneMillion");
                    }

                    if (record.get("recoveredPerOneMillion") instanceof Double){
                        recoveredPerOneMillion = ((Double) record.get("recoveredPerOneMillion")).longValue();
                    }else {
                        recoveredPerOneMillion = (long) record.get("recoveredPerOneMillion");
                    }


                    if (record.get("criticalPerOneMillion") instanceof Double){
                        criticalPerOneMillion = ((Double) record.get("criticalPerOneMillion")).longValue();
                    }else {
                        criticalPerOneMillion = (long) record.get("criticalPerOneMillion");
                    }


                    pstmt.setLong(1, country_id);
                    pstmt.setLong(2, update);
                    pstmt.setString(3, country);
                    pstmt.setString(4, iso2);
                    pstmt.setString(5, iso3);
                    pstmt.setLong(6, lat_);
                    pstmt.setLong(7, long_);
                    pstmt.setString(8, flag);
                    pstmt.setLong(9, cases);
                    pstmt.setLong(10, todayCases);
                    pstmt.setLong(11, deaths);
                    pstmt.setLong(12, todayDeaths);
                    pstmt.setLong(13, recovered);
                    pstmt.setLong(14, todayRecovered);
                    pstmt.setLong(15, active);
                    pstmt.setLong(16, critical);
                    pstmt.setLong(17, casesPerOneMillion);
                    pstmt.setLong(18, deathsPerOneMillion);
                    pstmt.setLong(19, tests);
                    pstmt.setLong(20, testsPerOneMillion);
                    pstmt.setLong(21, population);
                    pstmt.setString(22, continent);
                    pstmt.setLong(23, oneCasePerPeople);
                    pstmt.setLong(24, oneDeathPerPeople);
                    pstmt.setLong(25, oneTestPerPeople);
                    pstmt.setLong(26, activePerOneMillion);
                    pstmt.setLong(27, recoveredPerOneMillion);
                    pstmt.setLong(28, criticalPerOneMillion);
                    pstmt.executeUpdate();

                }
                System.out.println("Records inserted.....");
                }

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