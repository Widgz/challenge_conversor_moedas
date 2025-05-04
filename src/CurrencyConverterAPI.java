import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CurrencyConverterAPI {

   public void convert (String baseCurrency, String targetCurrency, double amount) throws IOException, InterruptedException {

      String address = "https://v6.exchangerate-api.com/v6/521e1060ba57d0bb1518825f/pair/" + baseCurrency
              + "/" + targetCurrency + "/" + amount;

      HttpClient client = HttpClient.newHttpClient();

      HttpRequest request = HttpRequest.newBuilder()
              .uri(URI.create(address))
              .build();

      HttpResponse<String> response = client
              .send(request, HttpResponse.BodyHandlers.ofString());

      Gson gson = new Gson();
      Currency currency = gson.fromJson(response.body(), Currency.class);

      System.out.println("Converting from " + currency.base_code() + " to " + currency.target_code());
      System.out.println("At the current rate (1 " + currency.base_code() + " = " + currency.conversion_rate()
              + " " + currency.target_code() + "), the amount of " + amount + " " + currency.base_code()
              + " is worth " + currency.conversion_result() + " " + currency.target_code());
   }
}