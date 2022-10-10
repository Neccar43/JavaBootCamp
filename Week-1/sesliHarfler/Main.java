package sesliHarfler;

public class Main {
    public static void main(String[] args) {
        
        char hrf ='A';

        String kalin ="aıouAIOU";
        String ince ="eiöüEİÖÜ";

        if(kalin.indexOf(hrf)!=-1){
            System.out.println("-------Harf kalındır-------");
        }else if (ince.indexOf(hrf)!=-1){
            System.out.println("-------Harf incedir-------");
        }else{
            System.out.println("-------Yanlış Harf-------");
        }






    }
}