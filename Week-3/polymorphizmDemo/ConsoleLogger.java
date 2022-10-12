package polymorphizmDemo;

public class ConsoleLogger extends  BaseLogger{
    public void log(String mesaj) {
        System.out.println("Logged to console : "+mesaj);//overriding yani olan bir metodun üstüne yazdık
        
    }
}
