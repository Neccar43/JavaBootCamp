package methods;

public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
        sayiBulmaca();
        sayiBulmaca();
        
    }

    public static void sayiBulmaca(){
        int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
        int number = 10;
        boolean kontrol = false;
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] == number) {
                kontrol = true;
                break;
            }
        }
        String mesaj ;
        if (kontrol) {
            mesaj="Sayı mevcut :" + number;
            mesajVer(mesaj);
        } else {
            mesaj="Sayı mevcutdeğil :"+number;
            mesajVer(mesaj);
        }
    }


    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }

}