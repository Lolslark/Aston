package Aston.step5.Strategy;

public class Multiplication implements Operation{
    @Override
    public int realise(int a, int b) {
        return a * b;
    }
}
