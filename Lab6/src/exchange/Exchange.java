package exchange;

public class Exchange {
    public final double USD = 30.72 ;
    public final double EURO = 41.89 ;
    public final double YEN = 36.97 ;
    public final double POUND = 48.34 ;
    double money;
     double sum=0 ;

    public double exchangeUSD(double amount) {
        money = amount*USD;
        sum += money ;
        return money ;
    }
    public double exchangeEURO(double amount) {
        money = amount*EURO;
        sum += money ;
        return money ;
    }
    public double exchangeYEN(double amount) {
        money = amount*YEN;
        sum += money ;
        return money ;

    }
    public double exchangePOUND(double amount) {
        money = amount*POUND;
        sum += money ;
        return money ;
    }
    public double getsum() {
        return sum ;
    }
}