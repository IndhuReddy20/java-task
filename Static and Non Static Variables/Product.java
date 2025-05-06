class Product {
    static String category = "Electronics";
    String productName;

    public static void main(String[] args) {
        Product p1 = new Product();
        p1.productName = "Laptop";
        Product p2 = new Product();
        p2.productName = "Smartphone";

        System.out.println("Category: " + Product.category);
        System.out.println("Product 1: " + p1.productName);
        System.out.println("Product 2: " + p2.productName);
    }
}