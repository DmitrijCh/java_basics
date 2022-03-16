import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            //TODO:напишите ваш код тут, результат вывести в консоль.
            //При невалидном ФИО вывести в консоль: Введенная строка не является ФИО
            if (input.matches("^[А-Яа-я-]+\\s[А-Яа-я-]+\\s[А-Яа-я-]+$")) {
                words = input.split(" ");
                System.out.println("Фамилия: " + words[0]);
                System.out.println("Имя: " + words[1]);
                System.out.println("Отчество: " + words[2]);
            } else {
                System.out.println("Введенная строка не является ФИО");
            }
        }
    }
}