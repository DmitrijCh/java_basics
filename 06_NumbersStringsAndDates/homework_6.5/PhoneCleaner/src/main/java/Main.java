import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      }
      //TODO:напишите ваш код тут, результат вывести в консоль.
      input = input.replaceAll("[+\\s-()]", "");
      if (input.matches("^((79[0-9]{9})|(89[0-9]{9})|(9[0-9]{9}))$")) {
        if (input.matches("^9[0-9]{9}$")) {
          input = "7" + input;
        } else if (input.matches("^89[0-9]{9}$")) {
          input = input.replaceAll("^8", "7");
        }
        System.out.println(input);
      } else {
        System.out.println("Неверный формат номера");
      }
    }
  }
}







