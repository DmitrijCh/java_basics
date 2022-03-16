public class Main {
  public static void main(String[] args) {
    String text = "Вася заработал 15000 рублей, Петя - 9563 рубля, а Маша - 40000 рублей";
    //TODO: напишите ваш код, результат вывести в консоль

    int k = text.indexOf("Вася");
    int n = text.indexOf("рублей");
    String str1 = text.substring(k, n);

    int m = text.indexOf("Маша");
    int f = text.lastIndexOf("рублей");
    String str2 = text.substring(m, f);

    String[] res1 = str1.split(" ");
    String[] res2 = str2.split(" ");

    System.out.println(Integer.parseInt(res1[res1.length-1]) + Integer.parseInt(res2[res2.length-1]));
  }
}
