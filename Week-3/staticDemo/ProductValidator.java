package staticDemo;

public class ProductValidator {

    public ProductValidator() {// sadece new leyince çalışır
        System.out.println("yapıcı blok çalıştı");
    }

    static { // çalışması için new lenmesine gerek yoktur static olarak çağırıldığında
             // çalışır
        System.out.println("static yapıcı blok çalıştı");
    }

    static public boolean isValid(Product product) {
        if (product.price > 0 && !product.name.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
