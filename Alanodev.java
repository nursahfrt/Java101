package PaketTemellerDegiskenler;
import java.util.Scanner;

public class Alanodev {
    public static void main(String[] args) {
        double a,b,c,u,cevre,alan;
        Scanner girdi=new Scanner(System.in);

        System.out.print("1.Kenar uzunluğu:");
        a=girdi.nextDouble();

        System.out.print("2.kenar uzunluğu:");
        b=girdi.nextDouble();

        System.out.print("3.kenar uzunluğu:");
        c=girdi.nextDouble();

        u=(a+b+c)/2;
        cevre=2*u;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c)); //karekök alma kodu

        System.out.println("Çevresi: "+ cevre);
        System.out.println("Alanı: "+ alan);



    }


}
