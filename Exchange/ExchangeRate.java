package Exchange;

// ExchangeRate 클래스
public class ExchangeRate {
    private String country;
    private double rate;
    private String currency;

    public ExchangeRate(String country, double rate, String currency) {
        this.country = country;
        this.rate = rate;
        this.currency = currency;
    }

    public String getCountry() {
        return country;
    }

    public double getRate() {
        return rate;
    }

    public String getCurrency() {
        return currency;
    }
}


