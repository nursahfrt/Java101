package Diziler6;
import java.util.Arrays;
// static kullanarak nesne tanımlaması yapmaya gerek kalmaz.
// Array sınıfı metotlarını kullanmak istiyorsan bunu yazmak zorundasın. ( Arrays.toString vs..)

public class ArraySinifMetotlariAciklamali11 {
    public static void main(String[] args) {

        int[] list = {1,2,3,4,5};
        double[] list2 = {1,2,3,4,5};

        // static kullanarak nesne tanımlaması yapmaya gerek kalmadı.
        System.out.print("\nNesne oluşturarark çağırma : " );
        ArrayMetotSinifi11 yardim = new ArrayMetotSinifi11();
        yardim.yazdir(list);
        //---------------------------------------------
        System.out.print("\nStatik kullanarak çağırma (nesne oluşturmadan) : " );
        ArrayMetotSinifi11.yazdir(list); //  aynı şey = System.out.print(Arrays.toString(list));

        System.out.print("\nArrays.toString(list) = Arrays sınıfınının fill metodunu kullanarak;" +
                "\nelemanlarının hepini ekrana basmak : " );
        System.out.print(Arrays.toString(list)); // başta tanımladığın Arrays sinıfına bu şekilde attın!
        //---------------------------------------------
        System.out.print("\n\nStatik kullanarak çağırma (nesne oluşturmadan) : " );
        ArrayMetotSinifi11.yazdir(list2);

        System.out.print("\nArrays.toString(list2) = Arrays sınıfınının fill metodunu kullanarak;" +
                "\nelemanlarının hepini ekrana basmak : " );
        System.out.print(Arrays.toString(list2)+"\n"); //Diziye ait elemanları direk ekrana basmak için kullanılan bir metottur.

        //---------------------------------------------
        System.out.print("\nArrays.fill(list,10) = Arrays sınıfınının fill metodunu kullanarak;" +
                "\ntüm elemanlarının değerleri atananl değiştirme : " );
        Arrays.fill(list,10); //listedeki tüm elemanların değerlerini yazdığın değeri değiştirir.
        ArrayMetotSinifi11.yazdir(list);

        System.out.print("\nArrays.fill(list,2,3,20) = Arrays sınıfının fill metodunu kullanarak;" +
                "\n belirli indis aralıklarını değiştirme : " );
        Arrays.fill(list,2,3,20);   //listedeki 2.indisinden başlayarak 3. indise e kadar olan elemanların değerlerini yazdığın değerle değiştirir.
        ArrayMetotSinifi11.yazdir(list);

        //---------------------------------------------
        int[] list3 = {18,12,-55,-22,3,44,15,55,22,-1,-100};
        double[] list4 = {18,12,-55,-22,3,44,15,55,22,-1,-100};

        System.out.print("\n\nListe 3; = " );
        ArrayMetotSinifi11.yazdir(list3);

        System.out.print("\n\nListe 4; = " );
        ArrayMetotSinifi11.yazdir(list4);

        //---------------------------------------------
        System.out.print("\n\nArrays.sort(list3); = Arrays sınıfınının sort metodunu kullanarak;" +
                "\nküçükten büyüge sıralama : " );
        Arrays.sort(list3);
        ArrayMetotSinifi11.yazdir(list3);

        System.out.print("\nArrays.sort(list4,0,6); = Arrays sınıfının sort metodunu kullanarak; " +
                "\n0.indisle 6. indis aralığını küçükten büyüge sıralama : " );
        Arrays.sort(list4,0,6);
        ArrayMetotSinifi11.yazdir(list4);

        //---------------------------------------------
        System.out.print("\n\nArrays.binarySearch(list3,55); = Arrays sınıfının binarySearch metodunu kullanarak; " +
                "\naranılan değerin indeksini bulma: " );
        System.out.print(Arrays.binarySearch(list3,55));

        System.out.print("\nArrays.binarySearch(list4,18); = Arrays sınıfının binarySearch metodunu kullanarak; " +
                "\naranılan değerin indeksini bulma: " );
        System.out.print(Arrays.binarySearch(list4,18));

        //---------------------------------------------
        System.out.print("\n\n int[] list5 = Arrays.copyOf(list3,7); = Arrays sınıfının copyOf metodunu kullanarak;" +
                "\nlist3 un 7. indeksine kadar olan elemanını kopyalama : list5 = " );
        int[] list5 = Arrays.copyOf(list3,7);
        ArrayMetotSinifi11.yazdir(list5);

        System.out.print("\n\n int[] list6 = Arrays.copyOfRange(list3,1,4); = Arrays sınıfının copyOfRange metodunu kullanarak;" +
                "\nlist3 un 1. indisten başlayarak 4. indise kadar olan aralığını kopyalama : list6 = " );
        int[] list6 = Arrays.copyOfRange(list3,1,4);
        ArrayMetotSinifi11.yazdir(list6);

        //---------------------------------------------
        System.out.print("\n\nListe 3; = " );
        ArrayMetotSinifi11.yazdir(list3);

        System.out.print("\n\nListe 5; = " );
        ArrayMetotSinifi11.yazdir(list5);
        //---------------------------------------------

        System.out.print("\n\nArrays.equals(list3,list5); = Arrays sınıfının equals metodunu kullanarak;" +
                "\nlist3 ile list5 eşittir  : " );
        System.out.print(Arrays.equals(list3,list5));


    }
}
