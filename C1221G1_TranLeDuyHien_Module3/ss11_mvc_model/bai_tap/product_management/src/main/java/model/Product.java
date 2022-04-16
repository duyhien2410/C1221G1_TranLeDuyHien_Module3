package model;

public class Product {
    private int id;
    private String name;
    private double price;
    private String descriptionProduct;
    private String manufacture;

    public Product() {
    }

    public Product(int id, String name, double price, String descriptionProduct, String manufacture) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.descriptionProduct = descriptionProduct;
        this.manufacture = manufacture;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double  getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescriptionProduct() {
        return descriptionProduct;
    }

    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }
}
