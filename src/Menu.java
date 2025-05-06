import java.util.Scanner;

public class Menu {
    private String menu;
    private int userChoice;
    private double inputAmount;
    Scanner scanner = new Scanner(System.in);

    public Menu() {
        this.menu = "\n" + Emojis.YELLOW_COLOR + Emojis.STAR + " Welcome to StarExchange! " + Emojis.STAR + Emojis.RESET_COLOR + "\n" +
                "\nBRL currency converter with real-time rates.\n" +
                "\nChoose a currency conversion option from the list below to get started!\n" +
                "\n============ Currency Converter ============\n" +
                String.format(
                        "\n%-30s %s\n%-30s %s\n%-30s %s\n%-30s %s\n%-30s %s\n%-30s %s\n\n%s\n",
                        "1️⃣ USD → BRL",       "7️⃣ AUD → BRL",
                        "2️⃣ BRL → USD",       "8️⃣ BRL → AUD",
                        "3️⃣ EUR → BRL",       "9️⃣ JPY → BRL",
                        "4️⃣ BRL → EUR",       "🔟 BRL → JPY",
                        "5️⃣ ARS → BRL",       "1️⃣1️⃣ KRW → BRL",
                        "6️⃣ BRL → ARS",       "1️⃣2️⃣ BRL → KRW",
                        Emojis.EXIT + " Exit"
                );
    }

    public void setUserChoice() {
        System.out.print(Emojis.RIGHT_ARROW + " Option: ");
        this.userChoice = scanner.nextInt();
    }

    public int getUserChoice() {
        return userChoice;
    }

    public void setAmount () {
        System.out.print(Emojis.RIGHT_ARROW + " Please enter the amount you want to convert: ");
        this.inputAmount = scanner.nextInt();
    }

    public double getInputAmount() {
        return inputAmount;
    }

    public void printMenu() {
        System.out.println(this.menu);
    }
}