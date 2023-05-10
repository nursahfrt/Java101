package PaketKosulluifadeler;
import java.util.Scanner;
public class KullaniciOdev {
    public static void main(String[] args) {
        Scanner kullanici = new Scanner(System.in);
        String kullaniciad, sifre, sifirla,yenisifre;

        System.out.print("Kullanıcı Adınız:");
        kullaniciad = kullanici.nextLine();
        System.out.print("Şifreniz:");
        sifre = kullanici.nextLine();

        if (kullaniciad.equals("admin") && sifre.equals("1234")){
            System.out.print("Giriş Başarılı");
        }else {System.out.println("Hatalı Giriş Yaptınız.");
            System.out.println("Şİfre Sıfırlansın mı? (evet/hayır).");
            sifirla = kullanici.nextLine();
            if(sifirla.equals("evet")){
                System.out.print("Yeni Şifreniz:");
                yenisifre=kullanici.nextLine();
                if (yenisifre.equals("1234")){
                    System.out.println("Eski şifre yeni şifreden farklı olmalıdır. Şİfre oluşturulamadı.");
                }else {
                    System.out.println("Şifre Oluşturuldu.");
                }
            }else{
                System.out.println("İstemiyorsan oluşturmayız.");
            }
        }
    }
}
