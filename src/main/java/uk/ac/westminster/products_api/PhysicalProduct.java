package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product {

    private double weightKg;
    private String dimensions;

    public PhysicalProduct() {
    }

    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimensions) {

        super(id, name, price); // MUST be the first statement

        this.weightKg = weightKg;
        this.dimensions = dimensions;
    }

    // Getters

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }

    // Setters

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }
}