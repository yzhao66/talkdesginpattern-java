package simlefactorypattern;

public class Test {

    public static void main(String[] args) {
        Operation operation=OperationFactory.createOperate("+");
        operation.setNumberA(1);
        operation.setNumberB(2);
        System.out.println(operation.getResult());
    }
}
