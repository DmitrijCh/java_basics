public class Main {
    public static void main(String[] args) {
        System.out.println(searchAndReplaceDiamonds("Пин код <8927>", "***"));
    }

    public static String searchAndReplaceDiamonds(String text, String placeholder) {
        // TODO: реализовать метод, если в строке нет <> - вернуть строку без изменений
        return text.replaceAll("<[\\d+\\s]+>", placeholder);
    }
}