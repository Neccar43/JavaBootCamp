package staticDemo;

public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.name="mause";
        product.price=10;
        ProductManager productManager=new ProductManager();
        productManager.add(product);
    }
}
