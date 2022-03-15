public class Tweezer {
    public String name;
    public int width;
    public double outerDiameter;
    public double vinternalDiameter;

    public Tweezer(double outerDiameter, double vinternalDiameter) {
        this.outerDiameter = outerDiameter;
        this.vinternalDiameter = vinternalDiameter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getOuterDiameter() {
        return outerDiameter;
    }

    public void setOuterDiameter(double outerDiameter) {
        this.outerDiameter = outerDiameter;
    }

    public double getVinternalDiameter() {
        return vinternalDiameter;
    }

    public void setVinternalDiameter(double vinternalDiameter) {
        this.vinternalDiameter = vinternalDiameter;
    }
}
