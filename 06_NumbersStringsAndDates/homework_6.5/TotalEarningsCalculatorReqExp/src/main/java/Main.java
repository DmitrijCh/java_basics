import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        calculateSalarySum("Вася заработал 15000 рублей, Петя - 9563 рубля, а Маша - 40000 рублей");
    }

    public static int calculateSalarySum(String text) {
        //TODO: реализуйте метод
        int result = 0;
        Matcher matcher = Pattern.compile("\\d+").matcher(text);
        while (matcher.find()) {
            int value = Integer.parseInt(matcher.group());
            System.out.print(value + " ");
            result += value;
        }
        System.out.println(result);
        return -1;
    }
}