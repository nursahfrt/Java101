package PaketKosulluifadeler;
import java.util.Scanner;
public class Sicaklik {
    public static void main(String[] args) {
        Scanner hava = new Scanner(System.in);

        Double sicaklik;

        System.out.println("Hava kaç derece =");
        sicaklik = hava.nextDouble();

        if (sicaklik<5){
            System.out.println("Kayak yapabilirsin.");
        } else if (sicaklik>=5 && sicaklik<=25) {
            if (sicaklik<15) {
                System.out.println("Sinemeya gidebilirsin.");
            }
            if (sicaklik>10) {
                System.out.println("Pikniğe gidebilirsin.");
            }
        } else {
            System.out.println("Yüzmeye gidebilirsin.");
        }
    }
}
