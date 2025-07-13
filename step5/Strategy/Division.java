package Aston.step5.Strategy;

public class Division implements Operation{
    @Override
    public int realise(int a, int b) {
        if (b == 0){
           throw new IllegalArgumentException("На ноль делить нельзя!");
        }
        return a / b;
    }
}
