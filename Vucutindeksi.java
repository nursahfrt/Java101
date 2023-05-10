package PaketTemellerDegiskenler;
import java.util.Scanner;
public class Vucutindeksi {
    public static void main(String[] args) {
        double boy, kilo,index;
        Scanner vucut = new Scanner(System.in);

        System.out.print("Boyunuz(mt):");
        boy= vucut.nextDouble();

        System.out.print("Kilonuz(kg):");
        kilo = vucut.nextDouble();

        index= kilo/(boy*boy);
        System.out.println("Vücut indeksiniz:"+index);

    }
}
