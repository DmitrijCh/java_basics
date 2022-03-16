public class Main {
    public static void main(String[] args) {
        String line = "Каждый охотник желает знать, где сидит фазан";
        String text[] = line.split(",?\\s+");
        ReverseArray array = new ReverseArray();
        array.reverse(text);
        for (int i = text.length - 1; i >= 0; i--) {
            System.out.println(text[i]);
        }
    }
}
