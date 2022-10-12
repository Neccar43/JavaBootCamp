package staticDemo;

public class ProductManager {

    void add(Product product) {
       // ProductValidator validator = new ProductValidator();
        if (ProductValidator.isValid(product)) {//static yaptığımızda new e gerek yoktur
            System.out.println("ürün eklendi");

        } else {
            System.out.println("geçersiz ürün");
        }
    }
}
