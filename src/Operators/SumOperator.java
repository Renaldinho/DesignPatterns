package Operators;

public class SumOperator implements IOperator{
    @Override
    public int calculate(int firstNumber, int secondNumber) {
        return firstNumber+secondNumber;
    }

    @Override
    public String toString() {
        return "Sum operation";
    }
}
