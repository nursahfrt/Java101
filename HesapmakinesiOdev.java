package PaketKosulluifadeler;
import java.util.Scanner;
public class HesapmakinesiOdev {
    public static void main(String[] args) {
        double n1,n2;
        Scanner hesap = new Scanner(System.in);

        System.out.print("1.Sayı=");
        n1=hesap.nextDouble();
        System.out.print("2.Sayı=");
        n2= hesap.nextDouble();

        System.out.print("Topla = 1\nÇıkar = 2\nÇarp = 3\nBöl = 4\n");
        System.out.print("İşlem numarası giriniz=");
        int islem= hesap.nextInt();

        switch (islem){
            case 1:
            System.out.print("Toplama işlemi sonucunuz="+(n1+n2));
            break;
            case 2:
                System.out.print("Çıkarma işlemi sonucunuz="+(n1-n2));
                break;
            case 3:
                System.out.print("Çarpma işlemi sonucunuz="+(n1*n2));
                break;
            case 4:
                if (n2!=0) {
                    System.out.print("Bölme işlemi sonucunuz=" + (n1 / n2));
                }else{
                    System.out.print("Bir sayı 0'a bölünemez");
                }
                break;
            default:
                System.out.print("Hatalı sayı girdiniz...");




        }
    }
}
