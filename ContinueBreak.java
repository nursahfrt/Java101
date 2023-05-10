package PaketDonguler;

// break = KONULDUĞU YERDE döngü/program sonlanır.
// continue = KONULDUĞU YERDEKİ İŞLEMİ ATLAR BİR SONRAKİ KOD SATIRINDAN İŞLEME DEVAM EDER.

public class ContinueBreak {
    public static void main(String[] args) {

        //----------------------------------------
        int i;
        for(i=1;i<=10;i++){
            if (i%2==0){
                continue;
            }else{
                System.out.println(i);
            }
        }
        //--------------------------------------
        System.out.println("--------------");
        //--------------------------------------
        int a=1;
        while(a<=10){
            a++;
            if (a==5){
                break;
            }
            System.out.println(a);

        }


    }
}
