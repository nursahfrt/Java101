package PaketDonguler;
import java.util.Scanner;
public class FibonacciSerisiOdev {
    public static void main(String[] args) {
        Scanner odev =new Scanner(System.in);
//Fibonacci dizisi, 0'dan başlar ve sonsuza kadar. Her rakam, bir önceki rakamla toplanır.
// Elde edilen sonuç rakamın sağ tarafına yazılır.
// Fibonacci dizisinin ilk on sayısı şu şekildedir:
    /*
       9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
         s1  s2  top
         0 + 1 = 1              s1+s2=toplam yeni s1 değeri artık s2 değeri oldu s1=s2. yeni s2 değeri toplam oldu.
         1 + 1 = 2
         1 + 2 = 3
         2 + 3 = 5
         3 + 5 = 8
         5 + 8 = 13
         13 + 8 = 21
         21 + 8 = 34
    */
        System.out.print("Eleman Sayısı : ");
        int elemansayisi = odev.nextInt();
        int s1=0;
        int s2=1;
        int topla =0;

        for(int i=0;i<=elemansayisi;i++){
            System.out.println(s1);
                topla=s1+s2;
                s1=s2;
                s2=topla;

        }




    }
}
