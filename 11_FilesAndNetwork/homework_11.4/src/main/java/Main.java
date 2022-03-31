import java.io.IOException;

public class Main {
    private static final String WEBSITE_URL = "https://lenta.ru/";
    private static final String pathToSave = "images";

    public static void main(String[] args) throws IOException {
        lentaFile imageSaver = new lentaFile(WEBSITE_URL, pathToSave);
        imageSaver.savedImagesNames();
    }
}
