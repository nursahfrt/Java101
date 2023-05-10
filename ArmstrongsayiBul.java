package PaketDonguler;
import java.util.Scanner;
//N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse,
// böyle sayılara Armstrong sayı denir.
public class ArmstrongsayiBul {
    public static void main(String[] args) {
        Scanner arm = new Scanner(System.in);

       /* Basamak sayısı hesabı
       *  2451/10=245
       *  245/10=24
       *  24/10=2
       *  2/10=0
       *  0/10=0
        */
        int sayi;
        System.out.print("sayı:");
        sayi=arm.nextInt();

        int geciciSayi=sayi;
        int basamakSayisi=0;
        while (geciciSayi!=0){
            geciciSayi/=10;
            basamakSayisi++;
        }//System.out.println("Basamak Sayısı="+basamakSayisi);

        /* Basamak değerleri
         * 2451 % 10=1
         * 245 % 10=5
         * 24 % 10=4
         * 2 % 10=2
         * 0 % 10=0
         */
        geciciSayi=sayi;
        int sayiDegeri=0;
        int toplam=0;
        int sayidegeritoplam=1;
        while (geciciSayi!=0){
            sayiDegeri=geciciSayi%10;
            sayidegeritoplam=1;

            /* Basamak değerinin basamak sayısı kuvveti
             * (2451 % 10) ^4 = 1*1*1*1
             * (245 % 10) ^4 = 5*5*5*5
             * (24 % 10) ^4 = 4*4*4*4
             * (2 % 10) ^4 = 2*2*2*2
             * (0 % 10) ^4 = 0
             */
            for (int i=1;i<=basamakSayisi;i++){
                sayidegeritoplam*=sayiDegeri;
                //System.out.println("sayi degeri="+sayiDegeri);
                //System.out.println("sayi degeri toplam="+sayidegeritoplam);
            }//System.out.println("basamak degeri toplam="+sayidegeritoplam);
            toplam+=sayidegeritoplam;
            geciciSayi/=10;
            //System.out.println("Ara toplam=" + toplam);
        }
        if (sayi==toplam){
            System.out.println("Armstrong sayi = " + toplam);
        }else System.out.println("Armstrong sayi değil!! = " + toplam);












    }
}
