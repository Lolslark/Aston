package Aston.step5.ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        MessageFilter filterChain = new BadWordFilter();
        MessageFilter emptyFilter = new EmptyFilter();

        filterChain.setNext(emptyFilter);

        String test1 = "Привет дурак";
        System.out.println(filterChain.filter(test1));

        String test2 = "";
        System.out.println(filterChain.filter(test2));
    }
}
