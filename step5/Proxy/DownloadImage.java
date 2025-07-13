package Aston.step5.Proxy;

public class DownloadImage implements Image {
    private final String filename;

    public DownloadImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Загрузка изображения: " + filename);
    }

    @Override
    public void display() {
        System.out.println("Просмотр изображения: " + filename);
    }

}
