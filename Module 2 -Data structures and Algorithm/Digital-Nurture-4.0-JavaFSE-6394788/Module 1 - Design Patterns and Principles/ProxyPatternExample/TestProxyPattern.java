
public class TestProxyPattern {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        // First time loads from server
        image1.display();

        // Uses cached instance
        image1.display();

        // Loads new image
        image2.display();
    }
}
