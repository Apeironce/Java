package src.main.java.ru.sgu.pattern;

public class Proxy implements Image {

    String file;
    RealImage image;

    public Proxy(String file) {
        this.file = file;
    }

    @Override
    public void display() {
        if (image == null) {
            image = new RealImage(file);
        }
        image.display();

    }
}
