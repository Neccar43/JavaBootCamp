package arraysDemo.reCapDemo;

public class Main {
    public static void main(String[] args) {

        double[] mylist = { 2.3, 5.6, 7.8, 1.9 };

        double max = mylist[0];
        double total = 0;
        for (double number : mylist) {
            if (max < number) {
                max = number;
            }
            System.out.println(number);
            total += number;
        }
        System.out.println("En büyük :" + max);
        System.out.println("Toplam:" + total);

    }
}
