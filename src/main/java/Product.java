


public class Product {
    private Long id;
    private String name;
    private double price;

    public Product() {
    }

    //constractor with 3 parameters
    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getter for id
    //public Long getId() {S
    //  return this.id;
    //}

    public String getName() {
        return this.name;

    }

    public double getPrice(){
        return this.price;
    }
}