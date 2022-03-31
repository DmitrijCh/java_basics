import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        String siteMap = new ForkJoinPool().invoke(new LinkList("https://avtoray.lada.ru/"));
        System.out.println(siteMap);
        try {
            FileWriter writer = new FileWriter("src/main/resources/sitemap/site_map.txt");

            writer.write(siteMap);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
