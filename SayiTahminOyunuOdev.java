package Diziler6;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class SayiTahminOyunuOdev {
    public static void main(String[] args) {
        Scanner tahmin = new Scanner(System.in);

        Random sayiUret=new Random();
        int sayi = sayiUret.nextInt(100);
        System.out.println(sayi);

        int hak=0;
        boolean ishatali=false;
        int[] girilenSayilar = new int[5];
        boolean iskazanma = false;

        for (int i = 0; i < 5; i++){
            System.out.println("i degeri = " + i);
            System.out.print("Sayı tahmininiz : ");
            int tahminiSayi=tahmin.nextInt();
            girilenSayilar[hak]=tahminiSayi;

            if(!(tahminiSayi>=0 && tahminiSayi<100)){
                System.out.println("lütfen 0 ile 100 arasında bir sayi girin!");
                if(ishatali){       //true burası.
                    hak++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - hak));
                }else {             // burasıda false oluyor. ilk tanımlanan false lduğu için buraya geliyor.
                    ishatali=true;  //degeri burda true oldu. true oluncada continue ile tekrar döndüğünde  true ya girip onu dönürdü.
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                    i--;
                }

                continue;           // aşağı inmeden kullanıldığı if döngüsünü tekrar döndürüyor.
            }
            if(tahminiSayi==sayi) {
                System.out.println("Doğru değer girdiniz...");
                iskazanma=true;
                break;
            } else{
                if (tahminiSayi<sayi){
                    hak++;
                    System.out.println("Küçük değer girdiniz. Daha büyük değer giriniz..." + "kalan hak = " +(5-hak) );
                } else {
                    hak++;
                    System.out.println("Büyük değer girdiniz. Daha küçük değer giriniz..." + "kalan hak = " +(5-hak) );
                }
            }
        }
        if(iskazanma){
            System.out.println("Kazandınız..." );
        }else{
            System.out.println("Kaybettiniz..." );
        }
        System.out.println("Sayı = " +sayi );
        System.out.println(Arrays.toString(girilenSayilar));


    }
}
