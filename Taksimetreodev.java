package PaketTemellerDegiskenler;
import java.util.Scanner;
public class Taksimetreodev {
    public static void main(String[] args) {
        double x, km=2.20, tutar,goster;
        int acilis=10,min=20;
        Scanner taksi = new Scanner(System.in);

        System.out.print("Km giriniz:");
        x = taksi.nextDouble();
        tutar= acilis+x*km;
        goster = tutar<min ? min:tutar;
        System.out.println("Taksimetre Tutarı:"+goster);



    }
}
