package PaketDonguler;
import java.util.Scanner;
public class Ussusayihesabı {
    public static void main(String[] args) {
        Scanner ussu = new Scanner(System.in);
        //------------------------while------------
        System.out.println("While:");
        int n,k;

        System.out.print("Üssü alınnacak sayı:");
        n= ussu.nextInt();

        System.out.print("Üs:");
        k= ussu.nextInt();

        //3^4=3*3*3*3
        int i=1;
        int total=1;
        while (i<=k){
            total=total*n;
            i++;
        }System.out.println("Cevap (while)= "+total);

        //------------------------- ----------------
        System.out.println();
        //------------------------- for----------------
        System.out.println("For:");
        int a,b,m;
        System.out.print("Üssü alınacak sayı:");
        a= ussu.nextInt();

        System.out.print("Üs:");
        b= ussu.nextInt();

        int sonuc=1;

        for(m=1;m<=b;m++){
            sonuc*=a;
        } System.out.print("Cevap (for)= "+sonuc);



    }
}
