package stringsDemo;

public class Main {
    public static void main(String[] args) {
        String myString = "Bugun hava çok güzel.";

        System.out.println("uzunluk:" + myString.length());// uzunluk verir
        System.out.println("5. eleman:" + myString.charAt(4));// 4. ix deki karakteri verir
        System.out.println(myString.concat(" Yaşasın."));// stringleri birleştirir
        System.out.println(myString.startsWith("B"));// string B ile mi başlıyor boolean değer döndürür
        System.out.println(myString.endsWith("."));// . ile mibitiyor
        char[] karakterler = new char[5];
        myString.getChars(0, 5, karakterler, 0);// belli aralıktaki karakterleri char array ine atıyor
        System.out.println(karakterler);
        System.out.println(myString.lastIndexOf('a'));// sondan başlar a nın bulunduğu ilk ix i vrir
        System.out.println(myString.substring(6));// 6dan sonrasını verir

        System.out.println("------------------------------");
        System.out.println(myString.toUpperCase());// hepsini büyük yapar
        System.out.println(myString.toLowerCase());// hepsini küçük yapar
        System.out.println(myString.substring(6, 10));// 6 ile 10 arasındaki stringi verir 10 dhl degil
        System.out.println(myString.indexOf("hava"));// hava kelimesini kaçıncı ix de başladığını verir
        System.out.println(myString.indexOf("hava", 11));// 11. ix den sonra hava kelimesi varsa ix verir yoksa -1

        for (String kelime : myString.split(" ")) {// split stringleri belirlediğimiz karakterden sonrasını böler
            System.out.println(kelime);
        }
        System.out.println(myString.replace(' ', '_'));// stringdeki oldları newlere çevirir

    }
}
