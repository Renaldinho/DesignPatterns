package Operators;

public class ExponentAdapter implements IOperator{

    private ExponentOperator exponentOperator;

    public ExponentAdapter() {
        exponentOperator = new ExponentOperator();
    }

    @Override
    public int calculate(int firstNumber, int secondNumber) {
        return exponentOperator.raiseToThePower(firstNumber,secondNumber);
    }

    @Override
    public String toString() {
        return "Exponent Operation";
    }
}
