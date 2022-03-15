package ru.skillbox;

public class RamMemory {
    private final RamMemoryType ramMemoryType;
    private final int ramAmountInMegabytes;
    private final int weightInGrams;

    public RamMemory(RamMemoryType ramMemoryType, int ramAmountInMegabytes, int weightInGrams) {
        this.ramMemoryType = ramMemoryType;
        this.ramAmountInMegabytes = ramAmountInMegabytes;
        this.weightInGrams = weightInGrams;
    }

    public RamMemoryType getRamType() {
        return ramMemoryType;
    }

    public int getRamAmountInMegabytes() {
        return ramAmountInMegabytes;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }
}
