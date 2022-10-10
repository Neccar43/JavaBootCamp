public class Main {
    public static void main(String[] args) {
        int sayi1 = 5;
        int sayi2 = 18;
        int sayi3 = 20;
        int enBuyuk = 5;

        if (enBuyuk < sayi1) {  
            enBuyuk = sayi1;
        }
        if (enBuyuk < sayi2) {
            enBuyuk = sayi2;
        }
        if (enBuyuk < sayi3) {
            enBuyuk = sayi3;
        }
        System.out.println("En büyük sayi :" + enBuyuk);
    }

}
