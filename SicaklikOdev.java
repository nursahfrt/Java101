package PaketKosulluifadeler;
import java.util.Scanner;
public class SicaklikOdev {
    public static void main(String[] args) {
        Scanner hava=new Scanner(System.in);
        double sicaklik;

        System.out.println("Sıcaklık kaç derece=");
       sicaklik = hava.nextDouble();

       if (sicaklik<5){
           System.out.println("Kayak yapmaya gidebilirsiniz.");
       } else if (sicaklik>=5 && sicaklik<15) {
           System.out.println("Sinemeya gidebilirsiniz.");
       } else if (sicaklik>=15 && sicaklik<25) {
           System.out.println("Pikniğe gidebilirsiniz.");
       }else{
           System.out.println("Yüzmeye gidebilirsiniz.");
       }
    }
}
