package ru.skillbox;

public class Screen {
    private final double diagonalInInches;
    private final ScreenType screenType;
    private final int weightInGrams;

    public Screen(double diagonalInInches, ScreenType screenType, int weightInGrams) {
        this.diagonalInInches = diagonalInInches;
        this.screenType = screenType;
        this.weightInGrams = weightInGrams;
    }

    public double getDiagonalInInches() {
        return diagonalInInches;
    }

    public ScreenType getMonitorType() {
        return screenType;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }
}
