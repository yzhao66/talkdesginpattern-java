package simlefactorypattern;

/**
 * 简单工厂模式
 */
public class CashTest {
    public static void main(String[] args) {
        CashSuper normalCashSuper=CashFactory.createCashAccept("正常收费");
        double normalResult=normalCashSuper.acceptCash(100);
        System.out.println("正常收费-----------------"+normalResult);
        CashSuper returnCashSuper=CashFactory.createCashAccept("满300返100");
        double returnResult=returnCashSuper.acceptCash(200);
        System.out.println("满减活动-----"+returnResult);
        CashSuper rebateCashSuper=CashFactory.createCashAccept("打8折");
        double rebateResult = rebateCashSuper.acceptCash(200);
        System.out.println("打折活动-----"+rebateResult);
    }
}
