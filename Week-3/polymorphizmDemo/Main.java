package polymorphizmDemo;

public class Main {
    public static void main(String[] args) {
        // BaseLogger[] loggers = { new ConsoleLogger(), new DatabaseLogger(), new
        // EmailLogger(), new FileLogger() };
        // bu yöntemle sonradan yeni bir logger sınıfı geldiğinde eklemek daha kolay
        // for (BaseLogger logger : loggers) {
        // logger.log("mesaj");
        // }

        CustomerManager customerManager = new CustomerManager(new FileLogger());// loggladığımız yer sonradan değişse
                                                                                // bile
                                                                                // kodumuzu değiştirmemize gerek yok
        customerManager.add();
    }
}
