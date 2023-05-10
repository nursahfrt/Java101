package PaketDonguler;
import java.util.Scanner;
public class While1 {
    public static void main(String[] args) {
        Scanner dongu = new Scanner(System.in);

        // While = KULLANICI DOĞRU VERİYİ GİRENE KADAR programı çalıştırır. (Örn = login olma)

        int i=1,k;
        while(i<=5){
            System.out.println(i);
            i++;
            k=1;
            while (k<=10){
                System.out.print(k + ",");
                k++;
            }
            System.out.println(); // boşluk ver demek.
        }
        System.out.println("Program bitti.");
    }
}
