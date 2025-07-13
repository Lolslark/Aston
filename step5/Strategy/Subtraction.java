package Aston.step5.Strategy;

public class Subtraction implements Operation{
    @Override
    public int realise(int a, int b) {
        return a - b;
    }
}
