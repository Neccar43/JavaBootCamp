package miniProjeAsalSayi;

public class Main {
    public static void main(String[] args) {
        
        int number=1;
        int kalan ;
        
        for(int i=2;i<number;i++){

            kalan=number%i;
            if(kalan==0){
                System.out.println("------------Sayı asal değil------------");
                break;
            }else if(i==number-1) {
                System.out.println("------------Sayı asal------------");
            }
        }
        if(number==2){
            System.out.println("------------Sayı asal------------");
        }else if(number<=1){
            System.out.println("------------Geçersiz sayı------------");
        }
        
    }
}
