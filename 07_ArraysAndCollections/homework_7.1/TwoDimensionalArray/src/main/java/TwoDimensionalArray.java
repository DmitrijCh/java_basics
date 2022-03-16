public class TwoDimensionalArray {
    public static char symbol = 'X';

    public static char[][] getTwoDimensionalArray(int size) {
        String[][] get = new String[size][size];
        String space = " ";
        int massiveSize = 7;
        int massiveOfMassiveSize = 6;
        String[][] crossMassive = new String[massiveSize][massiveOfMassiveSize];
        int x = size;
        int y = size;
        String[][] cross = new String[x][y];
        for (y = 0; y < size; y++) {
            for (x = 0; x < size; x++) {
                if (x == y || (x + y + 1 == size)) {
                    cross[x][y] = "X";
                } else {
                    cross[x][y] = " ";
                }
                System.out.print(cross[x][y]);
            }
            System.out.print("\n");
        }
        return new char[0][0];
    }
}
