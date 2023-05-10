package PaketDonguler;
import java.util.Scanner;
public class BasamakSayilariToplami {
    public static void main(String[] args) {
        Scanner basamak = new Scanner(System.in);
        /*sayi= 1643
        1643 = 1+6+4+3

        1643 % 10 = 3
        164 % 10 = 4
        16 % 10 = 6
        1 % 10 = 1

        *  1643 / 10 = 164
        *  164 / 10 = 16
        *  16 / 10 = 1
        *  1 / 10 = 0
        *  0 / 10 = 0
        *  */

        int sayi;
        System.out.print("Sayi : ");
        sayi= basamak.nextInt();

        int geciciSayi= sayi;
        int mod=0;
        int total=0;
        while (geciciSayi!=0){
            mod=geciciSayi%10;
            geciciSayi=geciciSayi/10;
            //System.out.println(geciciSayi);
            total+=mod;
            //System.out.println("basamak degeri ara toplam = "+total);
        }System.out.println("Toplam = " + total);





    }
}
