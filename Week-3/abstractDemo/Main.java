package abstractDemo;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.baseDatabaseManager = new OracleDatabaseManager();// burayı artık istediğimiz şekilde
                                                                          // değiştirebiliriz 
        customerManager.getCustomers();
    }
}
