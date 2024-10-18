public class Product {
    // Attributes
    private String productId;
    private String name;
    private String category;
    private double price;
    private String description;

    // Constructor
    public Product(String productId, String name, String category, double price, String description) {
        this.productId = productId;
        this.name = name;
        this.category = category;
        this.price = price;
        this.description = description;
    }

    // Method to display product details
    public void viewDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: $" + price);
        System.out.println("Description: " + description);
    }

    // Method to update stock

}
