package loopDemo;

public class Main {
    public static void main(String[] args) {
        // for
        for (int i = 2; i < 10; i += 2) {// i+=2 i yi 2şer arttır demektir
            System.out.println(i);
        }
        System.out.println("For döngüsü bitti");

        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("While döngüsü bitti");

        int j = 1;
        do {
            System.out.println(j);
            j++;

        } while (j < 10);
        System.out.println("Do-While döngüsü bitti");

    }
}
