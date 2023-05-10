package PaketDonguler;
import java.util.Scanner;
public class For2 {
    public static void main(String[] args) {
        Scanner dongu = new Scanner(System.in);

        //-------------------For---------------------------
        //koşul2 = run ile run==true aynı şey.
        // koşul3 =boş bırak ki ne kadar döneceği belli olmayan dongu yazalım. (while gibi kullandık do yapısını.)

        int sayi;
        for (boolean run=true;run;) {
            System.out.println("Sayı giriniz: ");
            sayi= dongu.nextInt();
            if(sayi<0){
                run=false;
            }
        }
        //--------------------While-------------------------
        System.out.println("Değer gir: ");
        int a= dongu.nextInt();
        while (a>0){
            System.out.println("Değer gir: ");
            a= dongu.nextInt();
        }
        //---------------------DoWhile------------------------ bu olay için en kolay yol=  do while oldu.
        int b;
        do {
            System.out.println("Birşeyler giriniz: ");
            b= dongu.nextInt();
        }while (b>0);

    }
}
