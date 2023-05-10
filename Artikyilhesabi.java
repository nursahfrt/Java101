package PaketKosulluifadeler;
import java.util.Scanner;
public class Artikyilhesabi {
    public static void main(String[] args) {
        Scanner artik= new Scanner(System.in);
        int yil,hesap;

        System.out.print("Yıl :");
        yil = artik.nextInt();
        if (yil%4==0){
            if(yil%100==0) {
                if (yil%400==0 ){
                    System.out.print(yil+"= Artık yıl");
                }else {
                    System.out.print(yil+"= Artık yıl değildir.");
                }
            } else {
                System.out.print(yil+"= Artık yıldır.");
            }
        }
    }
}
