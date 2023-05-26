package Diziler6;
import java.util.Arrays; //Array sınıfı metotlarını kullanmak istiyorsan bunu yazmak zorundasın.

public class ArrayCalismaSayfasi11 {
    public static void main(String[] args) {

        System.out.print("ArrayMetotSinifi11.yazdir(liste1)\t= ");
        int[] liste1= {1,5,12,-13,77,45,8,94,-5,-12,71};
        ArrayMetotSinifi11.yazdir(liste1);              //Ekrana yazdır. (static kullanımıyla kullanabildik.)

        System.out.print("\nArrays.toString(liste1);\t\t\t= ");
        System.out.print(Arrays.toString(liste1));   //Ekrana yazdır. (import java.util.Arrays; kullanımıyla kullanabildik.)


        //--------------------Arrays.fill(dizi,deger);----------------------------
        System.out.print("\nArrays.fill(liste2,5);\t\t\t\t= ");
        int[] liste2= Arrays.copyOf(liste1,liste1.length); // kopyala
        Arrays.fill(liste2,5);
        ArrayMetotSinifi11.yazdir(liste2);

        //Arrays.fill-Tüm değerleri değiştirme (Metot sınıfndan çek)
        System.out.print("\nArrayMetotSinifi11.fill(liste3,5); = Metot sınıfndan çek\t\t\t= ");
        int[] liste3 = Arrays.copyOf(liste1,liste1.length);
        ArrayMetotSinifi11.fill(liste3,5);

        //-------------Arrays.fill(dizi,başl.index,bitiş index,deger);------------------
        System.out.print("\nArrays.fill(liste4,4,7,10);\t\t\t= ");
        int[] liste4 = Arrays.copyOf(liste1,liste1.length);
        Arrays.fill(liste4,4,7,10);
        ArrayMetotSinifi11.yazdir(liste4);

        //Arrays.fill -Atanan indis değerler aralığını değiştirme (Metot sınıfndan çek)
        System.out.print("\nArrayMetotSinifi11.fillAralik(liste5,4,7,10)= Metot sınıfndan çek\t= ");
        int[] liste5=Arrays.copyOf(liste1,liste1.length);
        ArrayMetotSinifi11.fillAralik(liste5,4,7,10);

        //--------------------Arrays.sort(dizi);----------------------------
        System.out.print("\nArrays.sort(liste6);\t\t\t\t= ");
        int[] liste6= Arrays.copyOf(liste1,liste1.length);
        Arrays.sort(liste6);                                //Küçükten büyüğe sırala.
        ArrayMetotSinifi11.yazdir(liste6);

        //Arrays.sort(dizi); - (Metot sınıfndan çek)
        System.out.print("\nArrayMetotSinifi11.sort(liste7); = Metot sınıfndan çek\t\t\t\t= ");
        int[] liste7 = Arrays.copyOf(liste1,liste1.length);
        ArrayMetotSinifi11.sort(liste7);

        //-----------Arrays.binarySearch(dizi,deger); ---------------
        System.out.print("\nArrays.binarySearch(liste6,45)\t\t\t\t= ");
        System.out.print(Arrays.binarySearch(liste6,45));
        System.out.print("\nDoğru çalışması için önce küçükten büyüğe sıralamak zorundasın.");

        //Arrays.binarySearch(dizi,deger); - (Metot sınıfndan çek)
        System.out.print("\nArrayMetotSinifi11.binarySearch(liste6,-5);\t= ");
        ArrayMetotSinifi11.binarySearch(liste6,-5);

        //------------Arrays.copyOf(dizi,uzunluk);------------------------
        System.out.print("\nArrays.copyOf(liste1,8)\t\t\t\t\t= ");
        int[] liste10 = Arrays.copyOf(liste1,8);
        ArrayMetotSinifi11.yazdir(liste10);

        //Arrays.copyOf(dizi,uzunluk); - (Metot sınıfndan çek)
        System.out.print("\nArrayMetotSinifi11.kopyala(liste1,8);\t= ");
        ArrayMetotSinifi11.kopyala(liste1,8);

        //----------Arrays.copyOfRange(dizi,baslIndis,bitisIndis);----------------
        System.out.print("\nArrays.copyOfRange(liste6,2,5)\t\t\t\t\t= ");
        int[] liste11 = Arrays.copyOfRange(liste1,2,5);
        ArrayMetotSinifi11.yazdir(liste11);

        //Arrays.copyOfRange(dizi,baslIndis,bitisIndis); - (Metot sınıfndan çek)
        System.out.print("\nArrayMetotSinifi11.kopyala(liste1,8);\t= ");
        ArrayMetotSinifi11.kopyalaAralik(liste1,2,5);

        //--------------------------
        System.out.print("\nlist12 = \t\t\t\t= ");
        int[] liste12 = Arrays.copyOf(liste1,liste1.length);
        System.out.print(Arrays.toString(liste12)+"\n");

        System.out.print("\nlist5 = \t\t\t\t= ");
        System.out.print(Arrays.toString(liste5)+"\n");

        System.out.print("\nlist1 = \t\t\t\t= ");
        System.out.print(Arrays.toString(liste1)+"\n");

        //----------Arrays.equals(dizi1,dizi2);----------------
        System.out.print("\nArrays.equals(liste1,liste12)\t\t\t\t= ");
        System.out.print(Arrays.equals(liste1,liste12));

        //Arrays.equals(dizi1,dizi2); - (Metot sınıfndan çek)
        System.out.print("\nArrayMetotSinifi11.esitmi(liste1,liste12);\t= ");
        System.out.print(ArrayMetotSinifi11.esitlikKontrol(liste1, liste12));

        System.out.print("\nArrayMetotSinifi11.esitmi(liste1,liste5);\t= ");
        System.out.print(ArrayMetotSinifi11.esitlikKontrol(liste1, liste5));



















    }
}
