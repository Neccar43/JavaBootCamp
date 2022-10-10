package methods2;

public class Main {
    public static void main(String[] args) {
        ekle();
        int sonuç=topla(5, 9);
        System.out.println(sonuç);

        sonuç=topla2(5,6,5,5,7,10);
        System.out.println(sonuç);
    }

    public static void ekle() {
        System.out.println("Eklendi");
    }

    public static int topla(int sayi1,int sayi2) {
        return sayi1+sayi2;
        
    }

    public static int topla2(int... sayilar) {//... sayesinde istediğimiz kadar sayıyı toplayabiliriz variables arguments
        int toplam = 0;
        for (int i : sayilar) {
            toplam+=i;
        }
        return toplam;
    }
}
