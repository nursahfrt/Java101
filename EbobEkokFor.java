package PaketDonguler;
import java.util.Scanner;
public class EbobEkokFor {
    public static void main(String[] args) {
        Scanner ebobekok =new Scanner(System.in);
//------------------arttırmalı hesaplama ebob-----------
        int n1,n2;
        System.out.print("1.sayı : ");
        n1 = ebobekok.nextInt();

        System.out.print("2.sayı : ");
        n2 = ebobekok.nextInt();

        int ebob,ekok;
        ebob =0;
        ekok =0;

        for(int i=1;i<=n1;i++){
            if (n1%i==0 && n2%i==0){
                ebob=i;
            }
        }
        System.out.println("ebob : " + ebob);
        ekok=(n1*n2)/ebob;
        System.out.println("ekok : " + ekok);

        //------------------arttırmalı ekok hesaplama-----------

        for(int i=1;i<=n1*n2;i++){
            if (i%n1==0 && i%n2==0){
                ekok=i;
                break;

            }
        }
        System.out.println("ekok değeri : " + ekok);

        //------------------azaltmalı ebob hesaplama-----------
        for (int k=n1;k>=1;k--){
            if (n1%k==0 && n2%k==0){
                ebob=k;
                break; // sondan başlayarak hesapladığı için ilk bulduğu degerde durması lazım. bu nedenle break koydum.
            }
        }
        System.out.println("ebob : " + ebob);
        ekok=(n1*n2)/ebob;
        System.out.println("ekok : " + ekok);
    }
}
