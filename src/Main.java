import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        API currency = new API();
        Menu menu = new Menu();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            menu.printMenu();
            menu.setUserChoice();

            if (menu.getUserChoice() == 0) {
                System.out.println("Thank you for using StarExchange. Goodbye!");
                break;
            }

            if (menu.getUserChoice() < 0 || menu.getUserChoice() > 12) {
                System.out.println("Invalid option. Please try again.");
                continue;
            }

            menu.setAmount();
            CurrencyPair currencyPair = new CurrencyPair(menu.getUserChoice());
            currency.convert(currencyPair.base(), currencyPair.target(), menu.getInputAmount());
            System.out.println();
        }
        scanner.close();
    }
}