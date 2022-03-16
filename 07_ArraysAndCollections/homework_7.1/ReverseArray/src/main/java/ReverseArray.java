public class ReverseArray {
    //TODO: Напишите код, который меняет порядок расположения элементов внутри массива на обратный.
    public static String[] reverse(String[] strings) {
        String[] text = {};
        for (int i = 0; i < text.length / 2; i++) {
            String str = text[i];
            text[i] = text[text.length - i - 1];
            text[text.length - i - 1] = str;
        }
        return strings;
    }
}
