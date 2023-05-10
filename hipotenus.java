package PaketTemellerDegiskenler;
import java.util.Scanner;
public class hipotenus {
    public static void main(String[] args) {
        double a,b,c;
        Scanner girdi = new Scanner(System.in);

        System.out.print("1.dik kenar uzunluğu:");
        a=girdi.nextDouble();

        System.out.print("2.dik kenar uzunluğu:");
        b=girdi.nextDouble();

        c= Math.sqrt(a*a+b*b) ; // karekök alma kodu.

        System.out.println("Hipotenüs:" + c);




    }
}
