package kodlamaIoKatmanlıMimari.core.logging;

public class FileLogger implements Logger {

    @Override
    public void logging(String data) {
        System.out.println("Dosyaya Loglandı : "+data);
        
    }
    
}
