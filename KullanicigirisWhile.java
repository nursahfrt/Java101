package PaketDonguler;

import java.util.Scanner;

public class KullanicigirisWhile {
    public static void main(String[] args) {
        Scanner kullanici = new Scanner(System.in);
        String kullaniciad, sifre;
        boolean isbasarili = false;

        while(!isbasarili){
            System.out.print("Kullanıcı Ad :");
            kullaniciad=kullanici.next();

            System.out.print("Şifre :");
            sifre=kullanici.next();

            if (kullaniciad.equals("admin") && sifre.equals("1234")) {
                System.out.println("Başarılı Giriş");
                isbasarili=true;
            }else {
                System.out.println("Hatalı Giriş");
                isbasarili=false;
            }
        }
    }
}
