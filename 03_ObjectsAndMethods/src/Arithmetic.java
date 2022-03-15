public class Arithmetic {
    private int first;
    private int second;

    public Arithmetic(int f, int s) {
        first = f;
        second = s;
    }

    public int amount(int f, int s) {
        return f + s;
    }

    public int subtraction(int f, int s) {
        return f - s;
    }

    public int composition(int f, int s) {
        return f * s;
    }

    public int averageValue(int f, int s) {
        return (f + s) / 2;
    }

    public int maximumValue(int f, int s) {
        return Math.max(f, s);
    }

    public int minimumValue(int f, int s) {
        return Math.max(f, s);
    }
}

