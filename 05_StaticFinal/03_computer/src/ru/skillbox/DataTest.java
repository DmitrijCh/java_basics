package ru.skillbox;

enum DataTest {
    INSTANSE;

    private final String testComputerName = "Some name.";
    private final String testComputerVendor = "Some computer vendor.";

    private final byte testCountOfCores = 8;
    private final int testCpuFrequencyInMhz = 3000;
    private final String testCpuVendor = "Some Processor vendor.";
    private final int testCpuWeightInGrams = 250;

    private final RamMemoryType testRamMemoryType = RamMemoryType.DDR3;
    private final int testRamAmountInMegabytes = 32_000;
    private final int testRamWeightInGrams = 190;

    private final HardDriveType testHardDriveType = HardDriveType.SSD;
    private final int testStorageCapacityInGb = 2500;
    private final int testStorageDeviseWeightInGrams = 2000;

    private final double testDiagonal = 20.5;
    private final ScreenType testScreenType = ScreenType.IPS;
    private final int testMonitorWeightInGrams = 2900;

    private final boolean testBacklight = true;
    private final KeyboardType testKeyboardType = KeyboardType.PROJECTION;
    private final int testKeyboardWeightInGrams = 700;

    public String getTestComputerName() {
        return testComputerName;
    }

    public String getTestComputerVendor() {
        return testComputerVendor;
    }

    public byte getTestCountOfCores() {
        return testCountOfCores;
    }

    public int getTestCpuFrequencyInMhz() {
        return testCpuFrequencyInMhz;
    }

    public String getTestCpuVendor() {
        return testCpuVendor;
    }

    public int getTestCpuWeightInGrams() {
        return testCpuWeightInGrams;
    }

    public RamMemoryType getTestRamType() {
        return testRamMemoryType;
    }

    public int getTestRamAmountInMegabytes() {
        return testRamAmountInMegabytes;
    }

    public int getTestRamWeightInGrams() {
        return testRamWeightInGrams;
    }

    public HardDriveType getTestHardDriveType() {
        return testHardDriveType;
    }

    public int getTestStorageCapacityInGb() {
        return testStorageCapacityInGb;
    }

    public int getTestStorageDeviseWeightInGrams() {
        return testStorageDeviseWeightInGrams;
    }

    public double getTestDiagonal() {
        return testDiagonal;
    }

    public ScreenType getTestMonitorType() {
        return testScreenType;
    }

    public int getTestMonitorWeightInGrams() {
        return testMonitorWeightInGrams;
    }

    public boolean isTestBacklight() {
        return testBacklight;
    }

    public KeyboardType getTestKeyboardType() {
        return testKeyboardType;
    }

    public int getTestKeyboardWeightInGrams() {
        return testKeyboardWeightInGrams;
    }
}
