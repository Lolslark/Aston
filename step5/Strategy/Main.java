package Aston.step5.Strategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Strategy strategy = new Strategy();
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        strategy.setOperation(new Division());
        System.out.println(strategy.calculate(firstNumber, secondNumber));
    }
}
