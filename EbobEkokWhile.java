package PaketDonguler;
import java.util.Scanner;
public class EbobEkokWhile {
    public static void main(String[] args) {
        Scanner odev= new Scanner(System.in);

        int n1,n2;
        System.out.print("1.sayı : ");
        n1 = odev.nextInt();

        System.out.print("2.sayı : ");
        n2 =odev.nextInt();

        int i;
        int ebob = 1;
        int ekok = 1;

        if(n1<n2){
            i=n1;
            while(i>=1){
                if(n1%i==0 && n2%i==0){
                    ebob=i;
                    System.out.println("ebob : "+ ebob);
                    break;
                }
                i--;
            }
            ekok=n1*n2/ebob;
            System.out.println("ekok : "+ ekok);
        } else if (n2<n1) {
            i=n2;
            while(i>=1){
                if(n1%i==0 && n2%i==0){
                    ebob=i;
                    System.out.println("ebobb : "+ ebob);
                    break;
                }
                i--;
            }
            ekok=n1*n2/ebob;
            System.out.println("ekokk : "+ ekok);
        }

    }

}
