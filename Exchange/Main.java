package Exchange;

public class Main {
    public static void main(String[] args) {
        ExchangeBank bank = new ExchangeBank();

        bank.add("미국", 1438.5, "달러");
        bank.add("일본", 13.6, "엔");
        bank.add("유럽", 1709.7, "유로");
        bank.add("영국", 1985.5, "파운드");
        bank.add("스위스", 1575.5, "프랑");

        double amount = 100.0;
        String fromCountry = "미국";
        String toCountry = "영국";

        double exchangedAmount = bank.exchange(fromCountry, amount, toCountry);
        System.out.printf("%s %.2f %s를 %s %s로 환전하면 %.2f %s입니다.",
                fromCountry, amount, bank.findExchangeRate(fromCountry).getCurrency(), toCountry,
                bank.findExchangeRate(toCountry).getCurrency(), exchangedAmount,
                bank.findExchangeRate(toCountry).getCurrency());
    }

}