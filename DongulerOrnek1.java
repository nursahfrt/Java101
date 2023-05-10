package PaketDonguler;
import java.util.Scanner;
public class DongulerOrnek1 {
    public static void main(String[] args) {
        Scanner dongu = new Scanner(System.in);
        //---------------For-------------------------
        int i, k;
        System.out.print("Sayı giriniz: ");
        k = dongu.nextInt();

        for (i = 1; i < k; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "-");
                continue;
            }
        }
        //------------------While----------------------
        System.out.println();
        //----------------------------------------
        int x, y = 1;
        System.out.print("değer:");
        x = dongu.nextInt();

        while (y < x) {
            y++;
            if (y % 2 == 0) {
                System.out.print(y + ",");
                continue;
            }
        }
        //----------------------------------------
        System.out.println();
        //-------------------Do While---------------------

        int xx, yy = 1;
        System.out.print("gir:");
        xx = dongu.nextInt();

        do {
            yy++;
            if (yy % 2 == 0) {
                System.out.print(yy + ",");
                continue;
            }
        }while (yy < xx) ;
    }
}

