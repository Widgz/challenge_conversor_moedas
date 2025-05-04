public class CurrencyConverterMenu {
    private String menu;

    public CurrencyConverterMenu () {

        this.menu = "\n---------- Currency Converter ----------\n" +
                "1. United States Dollar (USD) to Brazilian Real (BRL)\n" +
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
                "12. Brazilian Real (BRL) to South Korean Won (KRW)\n";
    }

    public void printMenu() {
        System.out.println(this.menu);
    }

}