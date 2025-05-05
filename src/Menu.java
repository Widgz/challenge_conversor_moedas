import java.util.Scanner;

public class Menu {
    private String menu;
    private int userChoice;
    private double inputAmount;
    Scanner scanner = new Scanner(System.in);

    public Menu() {

        this.menu = "\nWelcome to StarExchange!\n" +
                "\nThis is a currency converter application built in Java, designed to convert from and to " +
                "\nBrazilian Real (BRL) using real-time exchange rates from an API.\n" +
                "\nChoose a currency conversion option from the list below to get started!\n" +
                "\n================== CurrencyInfo Converter ==================\n" +
                "\n1. United States Dollar (USD) to Brazilian Real (BRL)\n" +
                "2. Brazilian Real (BRL) to United States Dollar (USD)\n" +
                "3. Euro (EUR) to Brazilian Real (BRL)\n" +
                "4. Brazilian Real (BRL) to Euro (EUR)\n" +
                "5. Argentine Peso (ARS) to Brazilian Real (BRL)\n" +
                "6. Brazilian Real (BRL) to Argentine Peso (ARS)\n" +
                "7. Australian Dollar (AUD) to Brazilian Real (BRL)\n" +
                "8. Brazilian Real (BRL) to Australian Dollar (AUD)\n" +
                "9. Japanese Yen (JPY) to Brazilian Real (BRL)\n" +
                "10. Brazilian Real (BRL) to Japanese Yen (JPY)\n" +
                "11. South Korean Won (KRW) to Brazilian Real (BRL)\n" +
                "12. Brazilian Real (BRL) to South Korean Won (KRW)\n" +
                "0. Exit\n";
    }

    public void setUserChoice() {
        System.out.print("Option: ");
        this.userChoice = scanner.nextInt();
    }

    public int getUserChoice() {
        return userChoice;
    }

    public void setAmount () {
        System.out.print("Please enter the amount you want to convert: ");
        this.inputAmount = scanner.nextInt();
    }

    public double getInputAmount() {
        return inputAmount;
    }

    public void printMenu() {
        System.out.println(this.menu);
    }

}