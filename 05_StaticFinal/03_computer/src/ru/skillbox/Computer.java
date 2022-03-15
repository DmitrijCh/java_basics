package ru.skillbox;

public class Computer {
    private Processor processor;
    private RamMemory ramMemory;
    private HardDrive hardDrive;
    private Screen screen;
    private Keyboard keyboard;
    private final String vendor;
    private final String name;

    public Computer(Processor processor, RamMemory ramMemory,
                    HardDrive hardDrive, Screen monitor,
                    Keyboard keyboard, String vendor, String name) {
        this.processor = processor;
        this.ramMemory = ramMemory;
        this.hardDrive = hardDrive;
        this.screen = monitor;
        this.keyboard = keyboard;
        this.vendor = vendor;
        this.name = name;
    }

    public int getTotalComputerWeight() {
        return processor.getWeightInGrams()
                + ramMemory.getWeightInGrams()
                + hardDrive.getWeightInGrams()
                + screen.getWeightInGrams()
                + keyboard.getWeightInGrams();
    }

    public Processor getCpu() {
        return processor;
    }

    public RamMemory getRam() {
        return ramMemory;
    }

    public HardDrive getStorageDevise() {
        return hardDrive;
    }

    public Screen getMonitor() {
        return screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public void setCpu(Processor processor) {
        this.processor = processor;
    }

    public void setRam(RamMemory ramMemory) {
        this.ramMemory = ramMemory;
    }

    public void setStorageDevise(HardDrive storageDevise) {
        this.hardDrive = storageDevise;
    }

    public void setMonitor(Screen screen) {
        this.screen = screen;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public String toString() {
        return String.format("\tComputer name: %s\n\tComputer vendor: %s\n\tProcessor:\n\t\tFrequency: %s"
                        + "\n\t\tCount of cores: %s\n\t\tProcessor vendor: %s\n\t\tWeight: %s\n\tRAM:\n\t\tRAM Type: %s"
                        + "\n\t\tSize: %s\n\t\tWeight: %s\n\tStorage devise:\n\t\tDrive type: %s"
                        + "\n\t\tStorage capacity: %s\n\t\tWeight: %s\n\tScreen:\n\t\tDiagonal: %s"
                        + "\n\t\tScreen type: %s\n\t\tWeight: %s\n\tKeyboard:\n\t\tKeyboard type: %s"
                        + "\n\t\tIs backlight: %s\n\t\tWeight: %s",
                name, vendor, processor.getCpuFrequencyInMhz(), processor.getCountOfCores(), processor.getCpuVendor(),
                processor.getWeightInGrams(), ramMemory.getRamType().name(), ramMemory.getRamAmountInMegabytes(),
                ramMemory.getWeightInGrams(),
                hardDrive.getDriveType().name(), hardDrive.getStorageCapacityInGigabytes(),
                hardDrive.getWeightInGrams(), screen.getDiagonalInInches(),
                screen.getMonitorType().name(),
                screen.getWeightInGrams(), keyboard.getKeyboardType().name(), keyboard.isBacklight(),
                keyboard.getWeightInGrams());
    }
}