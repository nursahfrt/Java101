package PaketDonguler;
import java.util.Scanner;
public class MinMaxOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
  /* Java ile klavyeden girilen
         N tane sayma sayısından en büyük ve en küçük sayıları bulan ve
          bu sayıları ekrana yazan programı yazın.*/

        int miktar;
        System.out.print("Kaç tane sayı gireceksiniz : ");
        miktar = input.nextInt();

        int i;
        int sayi;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(i=1;i<=miktar;i++){

            System.out.print( i+". sayıyı giriniz:");
            sayi=input.nextInt();

            if(sayi>max) {
                max = sayi;
            }
             else if (sayi<min) {
                min = sayi;
            }
        }
        System.out.println("en büyük değer: "+max);
        System.out.println("en küçük değer: "+min);

    }
}
