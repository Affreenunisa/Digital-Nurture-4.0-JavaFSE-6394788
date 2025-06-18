// package ProxyPatternExample;
public class RealImage implements Image {
    private String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromRemoteServer();  // Simulate heavy load
    }

    private void loadFromRemoteServer() {
        System.out.println("Loading image from remote server: " + filename);
    }

    public void display() {
        System.out.println("Displaying image: " + filename);
    }
}