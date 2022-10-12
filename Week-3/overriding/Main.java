package overriding;

public class Main {
    public static void main(String[] args) {
        BaseKrediManager[] krediManagers=new BaseKrediManager[]{new OgrenciKrediManager(),new TarimKrediManager(),new OgretmenKrediManager()};

        for (BaseKrediManager baseKrediManager : krediManagers) {
           System.out.println(baseKrediManager.hesapla(1000)); 
        }
    }
}
