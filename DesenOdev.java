package PaketMetotlaryaniFonksiyonlar;
import java.util.Scanner;
public class DesenOdev {

    static void deger1(int sayi,int ilksayi){
        if(sayi>0) {
            System.out.print(sayi + " ");
            deger1(sayi - 5, ilksayi);
        } else if (sayi<=0) {
            deger2(sayi,ilksayi);
        }
    }
    static void deger2(int sayi,int ilksayi){
        if(ilksayi>sayi){
            System.out.print(sayi + " ");
            deger2(sayi + 5, ilksayi);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayı : " );
        int ilksayi = scan.nextInt();
        int sayi = ilksayi;
        deger1(sayi,ilksayi);

    }
}
