import org.imgscalr.Scalr;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class SmoothImage implements Runnable {

    private final File file;
    private final int newWidth;
    private final String dstFolder;
    private final long start;

    public SmoothImage(File file, int newWidth, String dstFolder, long start) {
        this.file = file;
        this.newWidth = newWidth;
        this.dstFolder = dstFolder;
        this.start = start;
    }

    @Override
    public void run() {
        smoothResizer();
    }

    private void smoothResizer() {
        try {
            BufferedImage image = Scalr.resize(ImageIO.read(file), newWidth);
            File newFile = new File(dstFolder + "/" + file.getName());
            ImageIO.write(image, "jpg", newFile);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        System.out.println("Finished after start: " + (System.currentTimeMillis() - start) + " ms.");
    }
}
