import java.util.Scanner;

public class Main {
    public static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(searchAndReplaceDiamonds(text, "***"));
    }

    public static String searchAndReplaceDiamonds(String text, String placeholder) {
        int countExternal = 0;
        int indexLessSign = 0;
        int indexMoreSign;
        int indexStart = 0;
        while (countExternal < text.length()) {
            for (count = indexStart; count < text.length(); count++) {
                if (String.valueOf(text.charAt(count)).equals("<") || String.valueOf(text.charAt(count)).equals(">")) {
                    if (String.valueOf(text.charAt(count)).equals("<")) {
                        indexLessSign = count;
                    }
                    if (String.valueOf(text.charAt(count)).equals(">")) {
                        indexMoreSign = count;
                        if (indexMoreSign - indexLessSign > 1) {
                            text = text.substring(0, indexLessSign) + placeholder + text.substring(indexMoreSign, indexMoreSign).trim() + text.substring(indexMoreSign + 1);
                            indexStart = text.lastIndexOf("*") + 1;
                            break;
                        }
                    }
                }
            }
            countExternal++;
        }
        return text;
    }
}


