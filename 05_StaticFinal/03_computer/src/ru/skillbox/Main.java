package ru.skillbox;

public class Main {
    private static final DataTest DATA_TEST = DataTest.INSTANSE;

    public static void main(String[] args) {
        Processor testProcessor = new Processor(DATA_TEST.getTestCpuFrequencyInMhz(), DATA_TEST.getTestCountOfCores(),
                DATA_TEST.getTestCpuVendor(), DATA_TEST.getTestCpuWeightInGrams());
        RamMemory testRamMemory = new RamMemory(DATA_TEST.getTestRamType(), DATA_TEST.getTestRamAmountInMegabytes(),
                DATA_TEST.getTestRamWeightInGrams());
        HardDrive testHardDrive = new HardDrive(DATA_TEST.getTestHardDriveType(),
                DATA_TEST.getTestStorageCapacityInGb(), DATA_TEST.getTestStorageDeviseWeightInGrams());
        Screen testScreen = new Screen(DATA_TEST.getTestDiagonal(), DATA_TEST.getTestMonitorType(),
                DATA_TEST.getTestMonitorWeightInGrams());
        Keyboard testKeyboard = new Keyboard(DATA_TEST.getTestKeyboardType(),
                DATA_TEST.isTestBacklight(), DATA_TEST.getTestKeyboardWeightInGrams());
        Computer testComputer = new Computer(testProcessor, testRamMemory, testHardDrive, testScreen,
                testKeyboard, DATA_TEST.getTestComputerVendor(), DATA_TEST.getTestComputerName());
        getTotalComputerWeightTest(testComputer);
        toString(testComputer);
    }

    private static void getTotalComputerWeightTest(Computer computer) {
        int expendedValue = DATA_TEST.getTestCpuWeightInGrams() + DATA_TEST.getTestRamWeightInGrams()
                + DATA_TEST.getTestStorageDeviseWeightInGrams() + DATA_TEST.getTestMonitorWeightInGrams()
                + DATA_TEST.getTestKeyboardWeightInGrams();
        System.out.println(String.format(String.valueOf(computer.getTotalComputerWeight())));
    }

    private static void toString(Computer testComputer) {
        String expendedString = "\tComputer name: " + DATA_TEST.getTestComputerName()
                + "\n\tComputer vendor: " + DATA_TEST.getTestComputerVendor() + "\n\tProcessor:\n\t\tFrequency: "
                + DATA_TEST.getTestCpuFrequencyInMhz() + "\n\t\tCount of cores: "
                + DATA_TEST.getTestCountOfCores() + "\n\t\tProcessor vendor: " + DATA_TEST.getTestCpuVendor()
                + "\n\t\tWeight: " + DATA_TEST.getTestCpuWeightInGrams() + "\n\tRAM:\n\t\tRAM Type: "
                + DATA_TEST.getTestRamType().name() + "\n\t\tSize: " + DATA_TEST
                .getTestRamAmountInMegabytes()
                + "\n\t\tWeight: " + DATA_TEST.getTestRamWeightInGrams()
                + "\n\tHard drive:\n\t\tDrive type: " + DATA_TEST.getTestHardDriveType().name()
                + "\n\t\tStorage capacity: " + DATA_TEST.getTestStorageCapacityInGb() + "\n\t\tWeight: "
                + DATA_TEST.getTestStorageDeviseWeightInGrams() + "\n\tScreen:\n\t\tDiagonal: "
                + DATA_TEST.getTestDiagonal() + "\n\t\tScreen type: " + DATA_TEST.getTestMonitorType()
                + "\n\t\tWeight: " + DATA_TEST.getTestMonitorWeightInGrams()
                + "\n\tKeyboard:\n\t\tKeyboard type: "
                + DATA_TEST.getTestKeyboardType() + "\n\t\tIs backlight: " + DATA_TEST.isTestBacklight() +
                "\n\t\tWeight: " + DATA_TEST.getTestKeyboardWeightInGrams();
        System.out.println(String.format(testComputer.toString()));
    }
}