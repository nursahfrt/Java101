package PaketDonguler;
import java.util.Scanner;
public class OrtalamaHesapla {
    public static void main(String[] args) {
        Scanner odev= new Scanner(System.in);
        int sayi, degergir,toplam=0,ort;
        System.out.print("Deger giriniz:");
        degergir= odev.nextInt();

        for (sayi=1;sayi<degergir;sayi++){
            if (sayi%3==0 && sayi %4 ==0){
                System.out.print(sayi+",");
                toplam+=sayi;
            }
        }System.out.println();
        System.out.println("Toplam="+toplam);
        ort=toplam/4;
        System.out.println("ortalama="+ort);



    }
}
