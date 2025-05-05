import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        var menu = new Menu();
        menu.printMenu();
        menu.setConvertOption();
        menu.setAmount();

        var currencyPair = new CurrencyPair(menu.getUserChoice());

        API currency = new API();
        currency.convert(currencyPair.base(), currencyPair.target(), menu.getInputAmount());
    }
}