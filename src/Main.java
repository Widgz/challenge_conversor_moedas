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

            if (menu.getUserChoice() == 99) {
                System.out.println("\n" + Emojis.YELLOW_COLOR + "Thank you for using StarExchange! " + Emojis.STAR + Emojis.YELLOW_COLOR);
                break;
            }

            if (menu.getUserChoice() == 0) {
                var myLog1 = new LogFile();
                myLog1.logReader();

                // Perguntar ao usuário se deseja continuar após visualizar o log
                System.out.print("Would you like to continue? (y/n): ");
                String userChoice = scanner.next().toLowerCase();

                if (userChoice.equals("no") || userChoice.equals("n")) {
                    System.out.println("\n" + Emojis.YELLOW_COLOR + "Thank you for using StarExchange! " + Emojis.STAR + Emojis.YELLOW_COLOR);
                    break;
                } else if (!userChoice.equals("yes") && !userChoice.equals("y")) {
                    System.out.println(Emojis.WARNING + " Invalid input. Exiting...");
                    break;
                }
                continue;  // Continua para a próxima iteração do loop
            }

            if (menu.getUserChoice() < 0 || menu.getUserChoice() > 12) {
                System.out.println(Emojis.WARNING + " Invalid option. Please try again.");
                continue;
            }

            menu.setAmount();
            CurrencyPair currencyPair = new CurrencyPair(menu.getUserChoice());
            currency.convert(currencyPair.base(), currencyPair.target(), menu.getInputAmount());
            System.out.println();

            System.out.print("Would you like to make another conversion? (y/n): ");
            String userChoice = scanner.next().toLowerCase();

            if (userChoice.equals("no") || userChoice.equals("n")) {
                System.out.println("\n" + Emojis.YELLOW_COLOR + "Thank you for using StarExchange! " + Emojis.STAR + Emojis.YELLOW_COLOR);
                break;
            } else if (!userChoice.equals("yes") && !userChoice.equals("y")) {
                System.out.println(Emojis.WARNING + " Invalid input. Exiting...");
                break;
            }
        }
        scanner.close();
    }
}
