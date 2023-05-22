package Exchange;

// ExchangeBank 클래스
public class ExchangeBank {
    private ExchangeRate[] rates;
    private int count;

    public ExchangeBank() {
        rates = new ExchangeRate[5];
        count = 0;
    }

    public void add(String country, double rate, String currency) {
        if (count < rates.length) {
            rates[count] = new ExchangeRate(country, rate, currency);
            count++;
        }
    }

    public double exchange(String fromCountry, double amount, String toCountry) {
        ExchangeRate fromRate = findExchangeRate(fromCountry);
        ExchangeRate toRate = findExchangeRate(toCountry);

        if (fromRate == null || toRate == null) {
            return 0.0;
        }

        double toAmount = amount * fromRate.getRate() / toRate.getRate();
        return Math.round(toAmount * 100) / 100.0;
    }

    public ExchangeRate findExchangeRate(String country) {
        for (int i = 0; i < count; i++) {
            if (rates[i].getCountry().equals(country)) {
                return rates[i];
            }
        }
        return null;
    }
}


