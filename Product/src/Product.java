public abstract class Product {

    private double price;
    private String description;
    private int fluidOunces;
    private double weight;
    private String sku;

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFluidOunces() {
        return fluidOunces;
    }

    public void setFluidOunces(int fluidOunces) {
        this.fluidOunces = fluidOunces;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }
}
