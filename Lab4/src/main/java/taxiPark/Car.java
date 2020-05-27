package taxiPark;

public class Car {
    private String brand;
    private String model;
    private Integer price;
    private Integer speed;
    private Double fuelConsumption;
    private Integer prestige;

    public Car(String brand, String model, Integer price, Integer speed, Double fuelConsumption, Integer prestige) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.speed = speed;
        this.fuelConsumption = fuelConsumption;
        this.prestige = prestige;
    }

    public Double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(Double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getPrestige() {
        return prestige;
    }

    public void setPrestige(Integer prestige) {
        this.prestige = prestige;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", price=").append(price);
        sb.append(", speed=").append(speed);
        sb.append(", fuelConsumption=").append(fuelConsumption);
        sb.append(", prestige=").append(prestige);
        sb.append('}');
        return sb.toString();
    }
}
