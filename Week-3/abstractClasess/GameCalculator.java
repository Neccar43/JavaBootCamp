package abstractClasess;

public abstract class GameCalculator {
    public abstract void hesapla();

    public final void gameOver(){//final kelimesi üstüne yazmamızı engelliyor
        System.out.println("Oyun Bitti");
    }
}
