package classes;

public class Main {
    public static void main(String[] args) {
        CustomerManeger customerManeger= new CustomerManeger();
        CustomerManeger customerManeger2= new CustomerManeger();
        customerManeger=customerManeger2;
        customerManeger.add();
        customerManeger.delete();

        
    }
}
