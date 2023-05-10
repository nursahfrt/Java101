package PaketKosulluifadeler;
import java.util.Scanner;
public class Kullanicigirisi {
    public static void main(String[] args) {
        String userName, password;
        Scanner kullanici = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız:");
        userName = kullanici.nextLine();

        System.out.print("Şifreniz:");
        password = kullanici.nextLine();

        if (userName.equals("admin") && password.equals("1234")){
            System.out.print("Giriş başarılı");
        }else {
            System.out.print("Hatalı giriş yaptınız...");
        }
    }
}
