import java.util.Scanner;

public class Main {
    public static final String WRONG_EMAIL_ANSWER = "Неверный формат email";
    public static final String COMMAND = "LIST";
    private static EmailList emailList = new EmailList();
    /* TODO:
        Пример вывода списка Email, после ввода команды LIST в консоль:
        test@test.com
        hello@mail.ru
        - каждый адрес с новой строки
        - список должен быть отсортирован по алфавиту
        - email в разных регистрах считается одинаковыми
           hello@skillbox.ru == HeLLO@SKILLbox.RU
        - вывод на печать должен быть в нижнем регистре
           hello@skillbox.ru
        Пример вывода сообщения об ошибке при неверном формате Email:
        "Неверный формат email"
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                break;
            }
            if (input.equals(COMMAND)) {
                emailList.printSortedEmails();
            } else if (input.matches("(^ADD)\\s.*")) {
                checkCommand(input);
            }
        }
    }

    public static void checkCommand(String input) {
        input = input.replaceFirst("^ADD\\s", "").trim();
        if (EmailList.checkRightEmail(input)) {
            emailList.add(input);
        } else {
            System.out.println(WRONG_EMAIL_ANSWER);
            //TODO: write code here
        }
    }
}













