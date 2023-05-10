package PaketDonguler;
import java.util.Scanner;
public class SayikuvvetleriOdev {
    public static void main(String[] args) {
        Scanner odev=new Scanner(System.in);

        int a,b;
        System.out.print("Sayı:");
        a=odev.nextInt();

        for (b=1;b<a;b*=4){
            System.out.print(b+",");
        }
        System.out.println();
        for (b=1;b<a;b*=5) {
            System.out.print(b+",");
        }
    }
}
