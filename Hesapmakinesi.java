package PaketKosulluifadeler;
import java.util.Scanner;
public class Hesapmakinesi {
    public static void main(String[] args) {
        double n1,n2,islem;
        Scanner hesap = new Scanner(System.in);

        System.out.print("1.Sayı=");
        n1= hesap.nextInt();

        System.out.print("2.Sayı=");
        n2= hesap.nextDouble();

        System.out.print("Topla = 1\nÇıkar = 2\nÇarp = 3\nBöl = 4\n");
        System.out.print("İşlem numarası giriniz=");
        islem= hesap.nextDouble();

        if (islem==1){
            System.out.println("Toplama işlem sonucunuz = "+(n1+n2));
        } else if (islem==2){
            System.out.println("Çıkarma işlem sonucunuz = "+(n1-n2));
        }else if (islem==3){
            System.out.println("Çarpma işlem sonucunuz = "+(n1*n2));
        }else if (islem==4) {
            if (n2!=0){
            System.out.println("Bölme işlem sonucunuz = "+(n1/n2));
        }   else{
                System.out.println("Bir sayı 0'a bölünemez!");
            }
        }
            else{
            System.out.println("hatalı sayı girdiniz!");
        }
    }
}

