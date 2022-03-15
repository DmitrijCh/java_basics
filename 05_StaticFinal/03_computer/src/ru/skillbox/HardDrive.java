package ru.skillbox;

public class HardDrive {
    private final HardDriveType hardDriveType;
    private final int storageCapacityInGigabytes;
    private final int weightInGrams;

    public HardDrive(HardDriveType hardDriveType, int storageCapacityInGigabytes, int weightInGrams) {
        this.hardDriveType = hardDriveType;
        this.storageCapacityInGigabytes = storageCapacityInGigabytes;
        this.weightInGrams = weightInGrams;
    }

    public HardDriveType getDriveType() {
        return hardDriveType;
    }

    public int getStorageCapacityInGigabytes() {
        return storageCapacityInGigabytes;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }
}
