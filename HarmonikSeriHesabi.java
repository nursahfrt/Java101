package PaketDonguler;
import java.util.Scanner;
public class HarmonikSeriHesabi {
    public static void main(String[] args) {
        Scanner harmonik = new Scanner(System.in);
       double sayi;
        System.out.print("Sayi: ");
        sayi=harmonik.nextInt();

        double toplam=0;
        for (double i=1; i<=sayi;i++){
            toplam+=1/i;
            //System.out.println(toplam);
        }System.out.println(toplam);



    }
}
