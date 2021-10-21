package simlefactorypattern;

public class CashRebate extends  CashSuper{
    private double moneyRabate = 1d;

    public CashRebate(double moneyRabate){
        this.moneyRabate = moneyRabate;
    }
    @Override
    public double acceptCash(double money) {
        double result = money * moneyRabate;
        return result;
    }
}
