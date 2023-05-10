package PaketDonguler;
import java.util.Scanner;
public class FaktoriyelHesabi {
    public static void main(String[] args) {
        Scanner faktoriel =new Scanner(System.in);

        int sayi,i;
        int fakt =1;
        System.out.print("sayı:");
        sayi= faktoriel.nextInt();

        for (i=1;i<=sayi;i++){
            fakt=fakt*i;
        }System.out.println(fakt);
    }
}
