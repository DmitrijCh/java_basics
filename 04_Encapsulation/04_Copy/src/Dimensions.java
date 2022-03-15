public class Dimensions {
    private final int width; //ширина
    private final int height; //высота
    private final int length; //длина

    public Dimensions(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public Dimensions setWidth(int width) {
        return new Dimensions(width, height, length);
    }

    public int getHeight() {
        return height;
    }

    public Dimensions setHeight(int height) {
        return new Dimensions(width, height, length);
    }

    public int getLength() {
        return length;
    }

    public Dimensions setLength(int length) {
        return new Dimensions(width, height, length);
    }

    public int addVolume(int width, int height, int length) {
        return width * height * length;
    }
}
