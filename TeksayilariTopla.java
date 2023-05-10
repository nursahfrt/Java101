package PaketDonguler;
import java.util.Scanner;
public class TeksayilariTopla {
    public static void main(String[] args) {
        Scanner odev = new Scanner(System.in);
        int sayi;
        int topla=0;
        do {
            System.out.print("Değer giriniz:");
            sayi = odev.nextInt();
            if (sayi%2!=0 && sayi>0){
                topla+=sayi;
            }
        }while (sayi>0);
        System.out.print(topla);
    }
}



