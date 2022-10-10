package arraysDemo;

public class Main {
    public static void main(String[] args) {

        String ogrenci1 = "ahmet";
        String ogrenci2 = "mehmet";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println("----------------------");

        String[] ogrenciler = new String[3];
        ogrenciler[0] = "ahmet";
        ogrenciler[1] = "mehmet";
        ogrenciler[2] = "mahmut";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("----------------------");
        
        //doğru kullanım
        for(String ogrenci:ogrenciler){//burdeaki ogrenci değişkeni yerine herşey yazılabilir
            System.out.println(ogrenci);

        }

    }
}
