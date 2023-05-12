package PaketMetotlaryaniFonksiyonlar;
import java.util.Scanner;
public class PalindromSayisiRecursive {
    //    sayi
    //                        247 % 10 = 7
    // 247 / 10 = 24          24 % 10 = 4    (7*10)+4  = 74
    //  24 / 10  = 2           2 % 10 = 2    (74*10)+2 = 742
    // sayi/10 = kalan          kalan%10 = deger        deger*10

    //siralama

    // basamak sayısı kadar dönecek = kalan>0 olacak
    //kalan = sayi%10
    //sonuc = (kalan*10)+deger
    //deger = sayi/10

    static int palindrom(int sayi) {


        int sonuc = 0, basamak = 0;
        while (sayi != 0) {                       //           1. döngü             2. döngü            3.döngü
            basamak = sayi % 10;              // basamak = 247 % 10 = 7        24 % 10 = 4         2 % 10 = 2
            sonuc = (sonuc * 10) + basamak;       // sonuc   = (0 * 10) + 7 = 7    (7 * 10) + 4 = 74   (74 * 10) + 2 =742
            sayi /= 10;                       // sayi    = 247 / 10 = 24 =     24 / 10 = 2         2 / 10 = 0
        }
        //System.out.println(sonuc);
        return sonuc;
    }


        public static void main (String[] args){
            Scanner palindrom = new Scanner(System.in);

            System.out.print("Sayi:");
            int sayigir = palindrom.nextInt();
            int x = palindrom(sayigir);

            if (x==sayigir)  System.out.println(x + " => Polindrom sayıdır.");
            else System.out.println(x + " => Polindrom sayı değildir!");


    }
}


