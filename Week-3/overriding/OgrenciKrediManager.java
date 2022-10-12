package overriding;

public class OgrenciKrediManager extends BaseKrediManager {
    //öğrenciler için ayrı faiz uygulamak istersek metodun üzerine yazabiliriz
   
    public double hesapla(double tutar) {
        
        return tutar*1.10;
    }
}
