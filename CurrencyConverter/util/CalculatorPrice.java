package CurrencyConverter.util;

public class CalculatorPrice {
    public static double CurrencyConverted(double d, double db) {
       double iof = d * db * 0.06;

       return iof + d * db;
    }
}
