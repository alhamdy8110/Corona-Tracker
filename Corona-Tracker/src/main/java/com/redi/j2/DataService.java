package com.redi.j2;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class DataService {

    private static String Data_Url = "https://corona.lmao.ninja/v2/countries?";

    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(Data_Url)).build();

        HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(httpResponse.body());

        try (FileWriter file = new FileWriter("MyJson.json"))
        {
            file.write(httpResponse.body());
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        }

}
