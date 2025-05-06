import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class API {

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
      CurrencyInfo currencyInfo = gson.fromJson(response.body(), CurrencyInfo.class);

      System.out.println("\n" + Emojis.CONVERSION + " Converting from " + currencyInfo.base_code() + " to " + currencyInfo.target_code());
      System.out.println(Emojis.HAND_POINTING + " At current rate 1 " + currencyInfo.base_code() + " = " + currencyInfo.conversion_rate()
              + " " + currencyInfo.target_code());
      System.out.println(Emojis.YELLOW_COLOR + Emojis.DOLLAR_BAG + " The input amount of " + amount + " " + currencyInfo.base_code() +
              " is equivalent to " + currencyInfo.conversion_result() + " " + currencyInfo.target_code() +
              " " + Emojis.RESET_COLOR);
   }
}