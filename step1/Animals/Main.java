package Aston.step1.Animals;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat(),
                new Bear(),
                new Fish(),
                new Whale()
        };

        for (Animal animal : animals) {
            animal.printInfo();
            System.out.println();
        }
    }
}
