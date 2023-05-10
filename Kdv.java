package PaketTemellerDegiskenler;
import java.util.Scanner;
public class Kdv {
    public static void main(String[] args) {
        double tutar,kdvtutar,kdvoran=0.18,kdvli;
        Scanner input = new Scanner(System.in);

        System.out.print("Tutar:");
        tutar=input.nextDouble();

        kdvtutar=tutar*kdvoran;
        kdvli=tutar+kdvtutar;

        System.out.println("Kdv Oranı:"+kdvoran);
        System.out.println("Kdv Tutarı:" + kdvtutar);
        System.out.println("Kdvli Tutar:" + kdvli);




    }
}
