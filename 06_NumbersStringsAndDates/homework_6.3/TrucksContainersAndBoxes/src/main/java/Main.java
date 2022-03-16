import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int container = 1;
        int truck = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество ящиков");
        int box = scanner.nextInt();
        System.out.println("Грузовик: " + truck);
        System.out.println("\tКонтейнер: " + container);
        for (int i = 1; i <= box; i++) {
            System.out.println("\t\tЯщик: " + i);
            if (i % (12 * 27) == 0) {
                truck += 1;
                System.out.println("Грузовик: " + truck);
            }
            if (i % 27 == 0) {
                container += 1;
                System.out.println("\tКонтейнер: " + container);
            }
        }
        System.out.println("Необходимо:\nгрузовиков - " + truck + "шт." + "\nконтейнеров - " + container + "шт.");

    }
}
