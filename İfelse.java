package PaketKosulluifadeler;

public class İfelse {
    public static void main(String[] args) {
        int x = 10, y = 35, z = 2;

        if (x < y && x < z) {
            System.out.println("En küçük Sayı=x");
        } else if (y < x && y < z) {
            System.out.println("En küçük Sayı=y");
        } else {
            System.out.println("En küçük Sayı=z");
        }

        int gun=7;

        if (gun==1){
            System.out.println("Pazartesi");
        } else if (gun==2) {
            System.out.println("Salı");
        } else if (gun==3) {
            System.out.println("Çarşamba");
        } else if (gun==4) {
            System.out.println("Perşembe");
        } else if (gun==5) {
            System.out.println("Cuma");
        } else if (gun==6) {
            System.out.println("Cumartesi");
        } else if (gun==7) {
            System.out.println("Pazar");
        }else {
            System.out.println("Hatalı giriş yaptınız");
        }

    }
}