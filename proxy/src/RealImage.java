import java.util.concurrent.Flow;

public class RealImage implements ImageSubject {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }


    @Override
    public void display() {
        System.out.println("display file:" + fileName + " .");
    }

    private void loadFromDisk(String fileName) {
        System.out.println("loaded file: " + fileName + "from disk.");
    }
}
