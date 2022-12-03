package task3;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class RealImage implements MyImage {
    private final String filename;
    private JFrame frame;
    MyImage imageCreator = new ProxyImage();

    public RealImage(String filename) {
        this.filename = filename;
    }

    public void display() {imageCreator.display();}
}