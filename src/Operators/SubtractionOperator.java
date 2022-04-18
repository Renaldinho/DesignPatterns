package Operators;

public class SubtractionOperator implements IOperator{
    @Override
    public int calculate(int firstNumber, int secondNumber) {
        return firstNumber-secondNumber;
    }

    @Override
    public String toString() {
        return "Subtraction Operation";
    }
}
