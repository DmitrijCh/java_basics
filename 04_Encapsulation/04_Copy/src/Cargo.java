public class Cargo {
    private final int overallDimensions; //габариты
    private final int weight; //масса
    private final String deliveryAddress; //адрес доставки
    private final boolean property; //свойство
    private final int registrationNumber; //регистрационный номер
    private final boolean whetherCargo; //является ли груз хрупким
    private final Dimensions dimensions;


    public Cargo(int overallDimensions, int weight, String deliveryAddress, boolean property, int registrationNumber, boolean whetherCargo, Dimensions dimensions) {
        this.overallDimensions = overallDimensions;
        this.weight = weight;
        this.deliveryAddress = deliveryAddress;
        this.property = property;
        this.registrationNumber = registrationNumber;
        this.whetherCargo = whetherCargo;
        this.dimensions = dimensions;
    }

    public int getOverallDimensions() {
        return overallDimensions;
    }

    public int getWeight() {
        return weight;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public Cargo setDeliveryAddress(String deliveryAddress) {
        return new Cargo(overallDimensions, weight, deliveryAddress, property, registrationNumber, whetherCargo, dimensions);
    }

    public boolean getProperty() {
        return property;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean getWhetherCargo() {
        return whetherCargo;
    }
}








