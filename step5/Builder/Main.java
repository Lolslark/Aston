package Aston.step5.Builder;

public class Main {
    public static void main(String[] args) {
        Builder builder = new ProgrammerBuilder();
        Director director = new Director();
        builder.setFirstName("Андрей");
        builder.setLastName("Чадаев");
        builder.setAge(26);
        builder = director.senior(builder);
        System.out.println(builder.createProgrammer());
    }
}
