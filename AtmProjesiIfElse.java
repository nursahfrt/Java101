package PaketDonguler;
import java.util.Scanner;
public class AtmProjesiIfElse {
    public static void main(String[] args) {
        Scanner odev = new Scanner(System.in);
        String kullaniciad,sifre;
        int giris = 3;
        int islem;
        double bakiye=0;
        double parayatir,paracek;

        while (giris>0) {
            System.out.print("Kullanıcı ad:");
            kullaniciad = odev.nextLine();
            System.out.print("Şifre:");
            sifre = odev.nextLine();

            if (kullaniciad.equals("admin") && sifre.equals("1234")) {
                System.out.println("Sanal Bankaya hoşgeldiniz... ");
                System.out.println("1- Para yatırma\n" +
                        "2- Para çekme \n" +
                        "3 - Bakiye Sorgula \n" +
                        "4 - Çıkış yap");
                do {
                    System.out.print("Lütfen işlem saçiniz : ");
                    islem = odev.nextInt();

                    switch (islem){
                        case 1:
                        System.out.print("Yatıtılacak para miktarı : ");
                        parayatir = odev.nextDouble();
                        bakiye += parayatir;
                        System.out.println("Güncel bakiyeniz : " + bakiye);
                        break;
                        case 2:
                        System.out.print("Çekilecek para miktarı : ");
                        paracek = odev.nextDouble();
                        if (bakiye>=paracek){
                            bakiye -= paracek;
                            System.out.println("Güncel bakiyeniz : " + bakiye);
                        }else {
                            System.out.println("bakiyeniz yetersiz.");
                        }
                        break;
                        case 3:
                        System.out.println("Güncel bakiyeniz : " + bakiye);
                        break;
                    }
                }while (islem != 4);

                System.out.println("İyi günler dileriz...");
                break;

            } else {
                giris--;
                if (giris == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Bankayla iletişime geçiniz...");
                }else{
                    System.out.println("Hatalı giriş.");
                    System.out.println("Kalan hakkınız : " + giris);
                }
            }
        }

    }
}
