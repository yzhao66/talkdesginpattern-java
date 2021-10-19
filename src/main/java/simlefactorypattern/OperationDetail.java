package simlefactorypattern;

class OperationAdd extends  Operation{
    @Override
    public double getResult() {
        double result =  numberA+numberB;
        return result;
    }
}
class OperationSub extends Operation{
    @Override
    public double getResult() {
        double result =  numberA-numberB;
        return result;
    }
}

class OperationMul extends Operation{
    @Override
    public double getResult() {
        double result =  numberA *numberB;
        return result;
    }
}
class OperationDiv extends Operation{
    @Override
    public double getResult() {
        double result =  numberA /numberB;
        return result;
    }
}