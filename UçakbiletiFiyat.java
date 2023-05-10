package PaketKosulluifadeler;
import java.util.Scanner;
public class UçakbiletiFiyat {
    public static void main(String[] args) {
        Scanner ucak = new Scanner(System.in);
        String adsoyad;
        int yas,tip,mesafe;
        double kmbasi=0.10, tutar,isk1,isk2,isk3,isk4;

        System.out.print("Ad Soyad : ");
        adsoyad=ucak.nextLine();

        System.out.print("Yaşınız : ");
        yas=ucak.nextInt();

        System.out.println("Tekyön = 1");
        System.out.println("Gidiş - Dönüş = 2");
        System.out.print("Yolculuk Tipiniz : ");
        tip=ucak.nextInt();

        System.out.print("Uçuş mesafesi(km) : ");
        mesafe =ucak.nextInt();

        if (tip==1 && mesafe>0 && yas>0){
            tutar= kmbasi * mesafe;
            System.out.println("Uçuş Tutarınız (indirimsiz): "+tutar);
            if(yas<12){
                isk1=tutar*0.5;
            } else if (yas>=12 && yas<=24) {
                isk1=tutar*0.9;
            }else if (yas>=25 && yas<=65){
                isk1=tutar;
            } else {
                isk1=tutar*0.7;
            }
            System.out.print("İndirimli Tutar: "+isk1);
        }else if(tip==2 && mesafe>0 && yas>0) {
            tutar= 2*kmbasi * mesafe;
            System.out.println("Uçuş Tutarınız (indirimsiz) : "+tutar);
            if(yas<12){
                isk1=(tutar*0.5)*0.8;
            } else if (yas>=12 && yas<=24) {
                isk1=(tutar*0.9)*0.8;
            }else if (yas>=25 && yas<=65){
                isk1=tutar*0.8;
            } else {
                isk1=(tutar*0.7)*0.8;
            }
            System.out.print("İndirimli Tutar: "+isk1);
        }else{
            System.out.println("Hatalı veri Girdiniz!");
        }










    }
}
