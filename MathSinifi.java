package Diziler6.MathveStringSinifi7;

public class MathSinifi {

    public static void main(String[] args) {


    //Math Sınıfı ve Metotları

    // Java bazı durumları bizim için önceden yazdığı sınıflar ile bizlerin işini kolaylaştırmıştır.
    // Bunlardan bir tanesi de Math sınıfıdır.
    // Adında da anlaşılacağı gibi Java'da Math sınıfı matematiksel fonksiyonlar sunmaktadır.
    // Java Math sınıfı, sayılar üzerinde matematiksel işlemler gerçekleştirmenize izin veren birçok metoda sahiptir.

    //Math sınıfının kullanımı şu şekildedir;

    //Math.MethodAdi(Parametreler)
    //Metot	        Tanım	                                        Örnek

    //abs(x)	    x değişekeninin mutlak değeri                   Math.abs(9.2) = 9.2
    //              Türkçesi = mutlak                               Math.abs(-9.2) = 9.2
    int sayi1 = -5;
    System.out.println(" 1) "+ Math.abs(sayi1));

    //ceil(x)	    x degişkenini bir üst tamsayıya dönüştürür 	    Math.ceil(9.2) = 10
    //              (türkçesi : tavan)                              Math.ceil(-9.8) = -9
    double sayi2 = 5.1;
    System.out.println(" 2) "+ Math.ceil(sayi2));

    double sayi3 = 5.6;
    System.out.println(" 2) "+ Math.ceil(sayi3));

    //floor(x)	    x değişkenini bir alt tamsayıya dönüştürür.     Math.floor(9.2) = 9
    //              (türkçesi : taban)                              Math.floor(-9.8) = -10
   double sayi4 = 5.1;
   System.out.println(" 3) "+ Math.floor(sayi4));

   double sayi5 = 5.6;
   System.out.println(" 3) "+ Math.floor(sayi5));

    //cos(x)	    x in trigonometrik cosünisü                 	Math.cos(1.0)=0.54030230568
    //              (x radyan cinsinden tanımlanmıştır.)
   double sayi6 =Math.cos(30);
   System.out.println(" 4) "+ sayi6);

    //sin(x)	    x in trigonometrik sinüsü	                    Math.sin(1.0)=0.8414709840709
    //              (x radyan cinsinden tanımlanmıştır.)
    double sayi7 =Math.sin(60);
    System.out.println(" 5) "+ sayi7);

    //tan(x)	    x in trigonometrik tanjantı                     Math.tan(1.0)=1.557040724655
    //              (x radyan cinsinden tanımlanmıştır.)
    double sayi8 =Math.tan(30);
    System.out.println(" 6) "+ sayi8);

    //acos(x)	    x in trigonometrik cosünisünün tersi            Math.acos(0.54030230568)=1.0
    //              (sonuç radyan cinsindendir)
    double sayi9 =Math.acos(0.15425144988758405);
    System.out.println(" 7) "+ sayi9);

    //asin(x)	    x in trigonometrik sinüsü                       Math.asin(0.8414709840709)=1.0
    //              (sonuç radyan cinsindendir)
    //atan(x)       x in trigonometrik tanjantı                     4.0*Math.atan(1.0)=3.14159265359
    //atan2(x,y)    x,y noktanın x,ykoordinatlarıdır                4.0*Math.atan2(1.0,1.0)=3.14159265359
    //              (x radyan cinsinden tanımlanmıştır.)
    // exp(x)	    e(2.7182818284590452354) nin x inci kuvveti	    Math.exp(1.0) =2.718281828459
    //                                                              Math.exp(2.0) =7.389056098931

    //log(x)	    e tabanına göre logaritma	                    Math.log(2.718281828459)=1.0
    System.out.println(" 8) "+Math.log(100));

    //pow(x,y)	    x in y inci kuvveti	                            Math.pow(3,2)=9.0
    double a = Math.pow(2,3);
    System.out.println(" 9) "+a);

    //max(x,y)	    x ve y nin büyük olanı	                        Math.max(2.3,12.7)=12.7
    System.out.println(" 10) "+Math.max(2,7));

    //min(x,y)	    x ve y nin küçük olanı	                        Math.min(2.3,12.7)=2.3
    System.out.println(" 11) "+Math.min(-75.6,17.2));

    //random()	    Raslantısal sayı (0 ile 1 arasinda)	            Math.random() = 0 ila bir arasında her sayı çıkabilir.

       int x = (int) (Math.random()*100); // 0 ile 100 arasında int sayı üretir.
       System.out.println(" 12) "+ x);

       int y = (int) (Math.random()*10);// 0 ile 10 arasında int sayı üretir.
       System.out.println(" 13) "+ y);

       double w = (double) (Math.random()*10);// 0 ile 10 arasında double sayı üretir.
       System.out.println(" 13) "+ w);

       double z =  Math.random();
       System.out.println(" 14) "+ z);// 0 ile 1 arasında double sayı üretir.


}
}
