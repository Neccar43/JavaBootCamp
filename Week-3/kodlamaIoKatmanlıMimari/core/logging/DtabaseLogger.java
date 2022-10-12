package kodlamaIoKatmanlıMimari.core.logging;

public class DtabaseLogger implements Logger {

    @Override
    public void logging(String data) {
        System.out.println("Veritabanına Loglandı : "+data);
        
    }
    
}
