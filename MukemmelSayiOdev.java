package PaketDonguler;
import java.util.Scanner;
public class MukemmelSayiOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı
// kendisine eşit olan sayıya mükemmel sayı denir.
//  28 = 1,2,4,7,14 = 1+2+4+7+14

        System.out.print("Sayı :");
        int n1 = input.nextInt();
        int toplam=0;

        for(int i=1; i<n1;i++){
            if(n1%i==0){
                toplam+=i;
                System.out.print(i+" , ");
            }
        }System.out.println();
        System.out.println("Toplam = "+ toplam);
        if(n1==toplam){
            System.out.println(n1 + " = "+ toplam + " Mükemmel sayıdır.");
        }else{
            System.out.println(n1 + " = "+ toplam + " Mükemmel sayı değildir.");
        }
    }
}
