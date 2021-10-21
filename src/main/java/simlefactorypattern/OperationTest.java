package simlefactorypattern;

/**
 * 简单工厂模式
 */
public class OperationTest {

    public static void main(String[] args) {
        Operation operation=OperationFactory.createOperate("+");
        operation.setNumberA(1);
        operation.setNumberB(2);
        System.out.println(operation.getResult());
        Operation operation2=OperationFactory.createOperate("-");
        operation2.setNumberA(3);
        operation2.setNumberB(2);
        System.out.println(operation2.getResult());
    }
}
