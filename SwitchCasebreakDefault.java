package PaketKosulluifadeler;
//if else ile aynıdır.
// YALNIZCA BİR DEĞİŞKENİN alacağı değerlere bağlı olarak farklı sonuçlar döndürmesini sağlayan bir yapıdır.
// BU DURUMLARDA if else yerine swich case break default yapısı kullanmak daha mantıklıdır.
// Not: "switch-case" yapısında eğer her case'in sonuna "break" ifadesi koymazsak aramış olduğu koşulu bulsa dahi
// tüm case'lere girip o kod bloklarını çalıştıracaktır.


import java.text.BreakIterator;

public class SwitchCasebreakDefault {
    public static void main(String[] args) {
        int gun=10;
         switch (gun){  //if gibidir.
             case 1:    //else if gibidir.
                 System.out.println("Pazartesi");
                 break;
             case 2:
                 System.out.println("Salı");
                 break;
             case 3:
                 System.out.println("Çarşamba");
                 break;
             case 4:
                 System.out.println("Perşembe");
                 break;
             case 5:
                 System.out.println("Cuma");
                 break;
             case 6:
                 System.out.println("Cumartesi");
                 break;
             case 7:
                 System.out.println("Pazar");
                 break;
             default:   // else gibi. koşul sağlanmazsa bunu çalıştırır.
                 System.out.println("Hatalı giriş yaptınız.");


         }






    }
}
