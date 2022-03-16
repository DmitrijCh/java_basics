public class Main {
  public static void main(String[] args) {
    Container container = new Container();
    container.count += 7843;
    int sum = sumDigits(7843);
    System.out.println(sum);
  }

  public static int sumDigits(Integer number) {
    String k = Integer.toString(number);
    char[] chars = k.toCharArray();
    int sum = 0;
    for (int i = 0; i < chars.length; i++) {
      sum = sum + Character.getNumericValue(chars[i]);
    }
    return sum;
  }
}
