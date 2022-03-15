public class County {
    public String name;
    public int size;
    public double square;
    public int nameCapital;
    public boolean accessSea;

    public County(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public int getNameCapital() {
        return nameCapital;
    }

    public void setNameCapital(int nameCapital) {
        this.nameCapital = nameCapital;
    }

    public boolean isAccessSea() {
        return accessSea;
    }

    public void setAccessSea(boolean accessSea) {
        this.accessSea = accessSea;
    }
}
