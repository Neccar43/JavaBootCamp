package classesWithAttributes;

public class Product {
    public Product(int _id, double _price, String _name, String _description, int _stockAmount) {// yapıcı
                                                                                                             // blok
        System.out.println("Main de new ile sınıfı çağırdığımızda yapıcı blok çalışır");
        this._id=_id;
        this._description=_description;
        this._name=_name;
        this._price=_price;
        this._stockAmount=_stockAmount;
        

    }//parametreli yapıcı blok

    public Product(){

    }//overloading bunu hem parametre girerek hem de get ve set i kullanmak için yaptık

    // attributes
    private int _id;
    private double _price;
    private String _name;
    private String _description;
    private int _stockAmount;
    public int get_id() {
        return _id;
    }

    public void set_id(int id) {
        this._id = id;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double price) {
        this._price = price;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String name) {
        this._name = name;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String description) {
        this._description = description;
    }

    public int get_stockAmount() {
        return _stockAmount;
    }

    public void set_stockAmount(int stockAmount) {
        this._stockAmount = stockAmount;
    }

    public String getKod() {// Sadece okunabilir yazılamaz
        return this._name.substring(0, 1) + _id;
    }

}
