import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome to StarExchange!");
        System.out.println("\nThis is a currency converter application built in Java, designed to convert from and to Brazilian Real (BRL) using real-time exchange rates from an API.");
        System.out.println("\nChoose a currency conversion option from the list below to get started!");

        var menu = new CurrencyConverterMenu();
        menu.printMenu();

        System.out.print("Option: ");
        int userChoice = scanner.nextInt();
        System.out.print("Please enter the amount you want to convert: ");
        double userAmount = scanner.nextInt();
        scanner.close();

        var currencyPair = new CurrencyPair(userChoice);

        CurrencyConverterAPI currency = new CurrencyConverterAPI();
        currency.convert(currencyPair.base(), currencyPair.target(), userAmount);
    }
}