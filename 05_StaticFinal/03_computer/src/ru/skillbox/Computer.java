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
        return String.format("""
                        \tComputer name: %s
                        \tComputer vendor: %s
                        \tProcessor:
                        \t\tFrequency: %s
                        \t\tCount of cores: %s
                        \t\tProcessor vendor: %s
                        \t\tWeight: %s
                        \tRAM:
                        \t\tRAM Type: %s
                        \t\tSize: %s
                        \t\tWeight: %s
                        \tStorage devise:
                        \t\tDrive type: %s
                        \t\tStorage capacity: %s
                        \t\tWeight: %s
                        \tScreen:
                        \t\tDiagonal: %s
                        \t\tScreen type: %s
                        \t\tWeight: %s
                        \tKeyboard:
                        \t\tKeyboard type: %s
                        \t\tIs backlight: %s
                        \t\tWeight: %s""",
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