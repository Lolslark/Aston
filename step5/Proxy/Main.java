package Aston.step5.Proxy;

public class Main {
    public static void main(String[] args) {
        Image image = new Proxy("test_image.jpg");
        System.out.println("Прокси создан, изображение не загружено ");
        image.display();
        image.display();
    }
}
