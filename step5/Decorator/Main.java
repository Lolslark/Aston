package Aston.step5.Decorator;

import Caffe.Coffee;

public class Main {
    public static void main(String[] args) {
        Drink myCoffee = new Coffe();
        myCoffee = new Milk(myCoffee);
        myCoffee = new Sugar(myCoffee);

        System.out.println("Ваш напиток: " + myCoffee.getDescription());
        System.out.println("Итоговая цена: " + myCoffee.getCost());
    }
}
