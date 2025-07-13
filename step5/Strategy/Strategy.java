package Aston.step5.Strategy;

public class Strategy {
    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public int calculate(int a, int b) {
        if (operation == null) {
            throw new IllegalStateException("No operation set!");
        }
        return operation.realise(a, b);
    }
}
