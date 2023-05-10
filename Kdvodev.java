package PaketTemellerDegiskenler;
import java.util.Scanner;
public class Kdvodev {
    public static void main(String[] args) {
        double tutar, kdvorani1=0.18, kdvtutari1,kdvli1, kdvorani2=0.08, kdvtutari2,kdvli2,kosul1;
        Scanner kdvhesap = new Scanner(System.in);

        System.out.print("Tutar:");
        tutar = kdvhesap.nextDouble();

        kdvtutari1=tutar*kdvorani1;
        kdvtutari2=tutar*kdvorani2;

        kosul1 = (0<tutar)&&(tutar<1000) ? kdvtutari1 : kdvtutari2;
        System.out.println(kosul1);



    }
}
