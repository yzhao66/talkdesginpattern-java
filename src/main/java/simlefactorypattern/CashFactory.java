package simlefactorypattern;

public class CashFactory {

    public  static  CashSuper createCashAccept(String acceptMothed){

        CashSuper cs = null;
        switch (acceptMothed)
        {
            case "正常收费":
                cs = new CashNormal();
                break;
            case "满300返100":
                cs =new CashReturn( 300,100);
                break;
            case "打8折":
                cs =new CashRebate(0.8);
                break;
        }
        return cs;
    }
}
