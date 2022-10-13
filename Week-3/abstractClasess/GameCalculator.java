package abstractClasess;

public abstract class GameCalculator {
    public abstract void hesapla();// GC yi kim inherit ediyorsa hesaplayı içermeli ama kendi hesaplamasını yazmalı
                                   // yani hesaplayı override etmeli

    public final void gameOver() {// final kelimesi üstüne yazmamızı engelliyor
        System.out.println("Oyun Bitti");
    }
    //abstract sınıflarda 
    //sınıfın başında abstract imzası olmalı
    //abstract metodun başında abstract imzası olmalı
    //abstract sınıflarda abstract metod olmayabilir
    //abstract sınıflar new lenemez
    //abstract sınıflarda tamamlanmış metodlar da olabilir
    

}
