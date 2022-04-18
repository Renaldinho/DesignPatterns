package Operators;

public class MultiplicationAdapter implements IOperator{

    private MultiplicationOperator multiplicationOperator;

    public MultiplicationAdapter(){
        multiplicationOperator = new MultiplicationOperator();
    }
    @Override
    public int calculate(int firstNumber, int secondNumber) {
        return multiplicationOperator.multiply(firstNumber,secondNumber);
    }

    @Override
    public String toString() {
        return "Multiplication operation";
    }
}
