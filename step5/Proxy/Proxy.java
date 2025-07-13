package Aston.step5.Proxy;

public class Proxy implements Image{
    private DownloadImage realImage;
    private final String filename;

    public Proxy(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new DownloadImage(filename);
        }
        realImage.display();
    }
}
