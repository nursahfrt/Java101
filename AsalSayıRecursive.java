package PaketMetotlaryaniFonksiyonlar;
import java.util.Scanner;
public class AsalSayıRecursive {
//asal sayı
//.......
//......  bu sayılardan birine bölündüğünde dur.
//10=1,2,3,4,5,6,7,8,9  --  10%2=0          asal değil.
//9 =1,2,3,4,5,6,7,8,       9%2=0 9%3=0     asal değil
//8 =1,2,3,4,5,6,7          8%2=0           asal değil
//7 =1,2,3,4,5,6            7%2=0 7%3=0 7%4=0 7%5=0 7%6=0   asal sayı
//6 =1,2,3,4,5
//5 =1,2,3,4
//4 =1,2,3
//3 =1,2
//2 =1

  static int asal(int sayi){
      int sayac=0;
      for(int i=2;i<sayi;i++){
          if(sayi%i==0){
              System.out.print( i + ",");
              sayac++;
          }
      }
      System.out.println();
      System.out.println("Toplam bölen sayısı : "+ sayac);
      if(sayac==0)
          System.out.println("Asal sayıdır");
      else
          System.out.println("Asal değildir.");

      return sayi;
  }
  public static void main(String[] args) {

      Scanner odev = new Scanner(System.in);

        System.out.print("Sayı : ");
        int sayi = odev.nextInt();
        asal(sayi);













    }


}
