package polymorphizmDemo;

public class EmailLogger extends BaseLogger {
    public  void log(String mesaj) {
        System.out.println("Logged to email : "+mesaj);
        
    }
}
