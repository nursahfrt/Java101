//Kullanıcıdan veri almak için Scanner sınıfı kullanılır.
//Aşağıdaki kod satırını projenin en başına yazmak zorundasın.
// import java.util.Scanner;
//ayrıca kullanıcıdan alınan veriyi bir değişkene atamak zorundasın.(İnput adında bir nesne oluşturup ona atayalım.)
// Bu nedenle Scanner sınıfından bir nesne tanımlaması yapmalısın.
//Scanner input = new Scanner(System.in);
//değişkenin türü neyse onu ekranda bekleyen kod satırına onun türünü yazmalısın.
// Örn:
/*      nextLine() -> String
        nextInt() -> Integer
        nextByte() -> Byte
        nextFloat -> Float
        nextDouble -> Double*/
//Int a,b;
//a=input.nextInt;

package PaketTemellerDegiskenler;
import java.util.Scanner;                        //Burada = Kullanıcıdan veri alıcam dedin.
//import = dahil etmek
//Java.until = Kütüphane
// Scanner = sınıf   // tüm bu başlangıç kodu = java script kütüphanesindeki scanner sınıfını burada kullanıcam demek.
public class Verialma {
    public static void main(String[] args) {
        Scanner cikti = new Scanner(System.in);  //veriyi almak için = scanner sınıfını kullandın.
        int dogum,yas;                                // veri tipi belirledin.
        String adsoyad,yer;

        System.out.print("Doğum tarihiniz:"); //kullanıcıdan ne istediğini belirttin.
        dogum= cikti.nextInt();      //kullanıcının integer tipinde bir sayı girmesini bekle dedin.

        System.out.print("yaşınız:");
        yas=cikti.nextInt();

        System.out.print("Adınız Soyadınız:");
        adsoyad=cikti.nextLine();

        System.out.print("Doğum Yeriniz:");
        yer=cikti.nextLine();

        System.out.println(dogum);  // a değerini ekrana yaz dedşn.
        System.out.println(yas);
        System.out.println(adsoyad);
        System.out.println(yer);




    }
}
