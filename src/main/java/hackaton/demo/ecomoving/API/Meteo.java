package hackaton.demo.ecomoving.API;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Meteo {
    private String tempoMeteorologico;

    public static void getMeteo() throws IOException, InterruptedException {
        // HTTP request
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://weatherbit-v1-mashape.p.rapidapi.com/forecast/minutely?lat=35.5&lon=-78.5"))
                .header("X-RapidAPI-Key", "8ec4469c69mshdf4cf33e0bc0354p1c34bdjsna753e58602ee")
                .header("X-RapidAPI-Host", "weatherbit-v1-mashape.p.rapidapi.com")
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
        HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
        System.out.println(response);
    }
}
