package PaketDonguler;
import java.util.Scanner;
public class CiftsayilariToplaOdev {
    public static void main(String[] args) {
        Scanner odev = new Scanner(System.in);
        int sayi;
        int topla=0;
        do {
            System.out.print("Sayı Giriniz:");
            sayi= odev.nextInt();
            if (sayi%4==0){
                topla +=sayi;
            }
        }while (sayi%2==0);
        System.out.print(topla);
    }
}
