package src.main.java.ru.sgu;

import src.main.java.ru.sgu.pattern.Image;
import src.main.java.ru.sgu.pattern.Proxy;
import src.main.java.ru.sgu.pattern.RealImage;

public class ProxyPattern {
    public static void main(String[] args) {
        Image image = new RealImage("C/download/my.jpg");
        image.display();

        Image proxyImage = new Proxy("C/download/my.jpg");
        proxyImage.display();
        proxyImage.display();
    }
}
