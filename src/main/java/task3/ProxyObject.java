package task3;

public class ProxyObject implements MyImage{
    private RealImage realImage;
    private String filename;

    public ProxyObject(String filename) {
        this.filename = filename;
    }
    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }

    public static void main(String[] args) {
        ProxyObject proxyObject = new ProxyObject("test.png");
        proxyObject.display();
    }
}
