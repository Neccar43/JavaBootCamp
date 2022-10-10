package sayiBulma;

public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
        int number = 10;
        boolean kontrol = false;
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] == number) {
                kontrol = true;
                break;
            }
        }
        if (kontrol) {
            System.out.println("Sayı bulundu");
        } else {
            System.out.println("Sayı bulunamadı");
        }

    }
}
