package Operators;

public class RootAdapter implements IOperator {

    private RootOperator rootOperator;

    public RootAdapter(){
        rootOperator = new RootOperator();
    }
    @Override
    public int calculate(int firstNumber, int secondNumber) {
        return rootOperator.performOperation(firstNumber,secondNumber);
    }

    @Override
    public String toString() {
        return "Root operator";
    }
}
