package classesWithAttributes;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(5,5000,"laptop","Asus",6);
       /* product.set_description("Asus");
        product.set_id(15);
        product.set_name("Laptop");
        product.set_price(5000);
        product.set_stockAmount(6);*/

        System.out.println(product.getKod());

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

    }
}
