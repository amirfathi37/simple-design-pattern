public class Main {
    public static void main(String[] args) {
        ImageSubject image1 = new ProxyImage("me.jpg");
        ImageSubject image2 = new ProxyImage("you.jpg");

        image1.display();
        image1.display();
        image1.display();

        image2.display();

    }
}