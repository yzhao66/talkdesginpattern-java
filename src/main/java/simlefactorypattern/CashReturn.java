package simlefactorypattern;

public class CashReturn extends CashSuper{
    private double moneyCondtion;
    private double moneyReturn;

    public double getMoneyCondtion() {
        return moneyCondtion;
    }

    public void setMoneyCondtion(double moneyCondtion) {
        this.moneyCondtion = moneyCondtion;
    }

    public double getMoneyReturn() {
        return moneyReturn;
    }

    public void setMoneyReturn(double moneyReturn) {
        this.moneyReturn = moneyReturn;
    }

    public CashReturn(double moneyCondtion, double moneyReturn) {
        this.moneyCondtion = moneyCondtion;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money - (money/moneyCondtion) *moneyReturn;
        return  result;
    }
}
