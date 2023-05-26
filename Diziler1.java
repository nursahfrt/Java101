package Diziler6;

public class Diziler1 {
    public static void main(String[] args) {
        //dizi tanımlama
        // [] yazarsak dizi tanımladk demek oluyor.
        //önce diziyi ve uzunluğunu tanımlayıp sonra elemanılarını tanımlayabilirsin.

        int[] liste1 = new int[10];          // maksimum 10 eleman alabilen "double" veri tipinde olan bir dizi oluşturulmuştur.
        double liste2[] = new double[10]; //ya da
        int[] liste3 = {10,20,30,40,50,60,70,80,90,100,110};    //ya da diziyi liste elemalarıyla birlikte de oluşturabilirsin.
        System.out.println("liste 3 ün dizi uzunluğu \t\t\t\t\t= " + liste3.length);


        int[] sayilar = new int[15]; // bu tanımlamayı kullanma.
        sayilar[0]=10;  // dizinin 1. sayısını tanımladık.
        sayilar[1]=20;  // dizinin 2. sayısı
        sayilar[2]=30;  // dizinin 3. sayısı
        System.out.println("Sayıların 1. elemaını ya da 0. indisi \t\t= " + sayilar[0]);
        System.out.println(".length dizinin uzunluğunu verir. Uzunluğu  = " + sayilar.length);
        System.out.println(" ========================================= ");

        int[] kullan = new int[10]; // bu tanımlamayı kullan.
        for (int i=0;i<kullan.length;i++){
            kullan[i]=(i*10)+10;
            System.out.println(kullan[i]);
        }







    }
}
