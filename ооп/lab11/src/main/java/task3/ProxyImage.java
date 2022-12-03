package task3;

public class ProxyImage implements MyImage{
    private final MyImage imageCreator = new RealImage();
    @Override
    public void display() {

    }
}
