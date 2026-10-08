package lab3_mirea;

public class CurrencyConverter {
    private static final double USD_RATE = 80.0;
    private static final double EUR_RATE = 95.0;

    private double getRate(String currency) {
        switch (currency) {
            case "RUB":
                return 1.0;
            case "USD":
                return USD_RATE;
            case "EUR":
                return EUR_RATE;
            default:
                throw new IllegalArgumentException("Неизвестная валюта");
        }
    }

    public double convert(double amount, String from, String to) {
        if (!Double.isFinite(amount) || amount < 0) {
            throw new IllegalArgumentException(
                    "Сумма должна быть конечной и неотрицательной");
        }

        double result = amount * (getRate(from) / getRate(to));

        if (!Double.isFinite(result)) {
            throw new IllegalArgumentException("Слишком большая сумма");
        }

        return result;
    }
}
