import java.util.ArrayList;
import java.util.List;

public class Concatenation {

//    public static void main(String[] args) {
//        long start = System.currentTimeMillis();
//
//        StringBuilder builder = new StringBuilder();
//        for (int i = 0; i < 20_000; i++) {
//            builder.append("some text some text some text");
//        }
//        System.out.println(builder.toString().length());
//
//        System.out.println((System.currentTimeMillis() - start) + " ms");


/* По трем измерениям:
 1 поток = 60 сек
 8 потоков = 17-19 сек (Самое оптимальное количество потоков по числу ядер системы)
 16 потоков = 17-19 сек
С конкатенацией в методе padNumber --- 16-17 сек (Быстрее, чем простое объединение
строк или создание объекта StringBuilder)
 */

    private static final int REGION_CAPACITY = 192;
    private static final int PROCESSOR = Runtime.getRuntime().availableProcessors();
    private static String path = "src/file/numbers";
    static final String FILE_EXT = ".txt";

    public static void main(String[] args) throws InterruptedException {
        List<Thread> threads = new ArrayList<>();
        long start = System.currentTimeMillis();
        for (int count = 0; count < PROCESSOR; count++) {
            Thread thread = new Thread(new Loader(count * REGION_CAPACITY / PROCESSOR,
                    REGION_CAPACITY / PROCESSOR, path.concat(Integer.toString(count)).concat(FILE_EXT)));
            threads.add(thread);
            thread.start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
        System.out.println((System.currentTimeMillis() - start) + " ms");
    }
}


