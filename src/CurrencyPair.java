import java.util.List;

public class CurrencyPair {
    private final String baseCurrency;
    private final String targetCurrency;
    List<String> baseCurrencyList;
    List<String> targetCurrencyList;

    public CurrencyPair (int userInput) {
        this.baseCurrencyList = List.of("USD", "BRL", "EUR", "BRL", "ARS", "BRL", "AUD", "BRL", "JPY", "BRL", "KRW", "BRL");
        this.targetCurrencyList = List.of("BRL", "USD", "BRL", "EUR", "BRL", "ARS", "BRL", "AUD", "BRL", "JPY", "BRL", "KRW");

        this.baseCurrency = baseCurrencyList.get(userInput - 1);
        this.targetCurrency = targetCurrencyList.get(userInput - 1);
    }

    public String base () {
        return this.baseCurrency;
    }

    public String target () {
        return this.targetCurrency;
    }
}