package PaketMetotlaryaniFonksiyonlar;
import java.util.Scanner;
public class UssuHesabiRecursive {
    static int us(int taban, int ussu){
        int sonuc =1;
        for(int i=1;i<=ussu;i++)
        sonuc *= taban;
        System.out.println("Üssü (For) hesabı: " + sonuc);
        return sonuc;
    }
    static int recursiveUs(int taban,int ussu){
        if (ussu==0) return 1;
        taban*=recursiveUs(taban,ussu-1);
        return taban;
    }

    public static void main(String[] args) {
        boolean devamet = true;

        do{
        Scanner odev = new Scanner(System.in) ;
        System.out.print("Taban degeri giriniz : ");
        int taban = odev.nextInt();
        System.out.print("Us degeri giriniz : ");
        int ussu = odev.nextInt();

         us(taban,ussu);
        System.out.println("Üssü (Recursive) hesabı: " + recursiveUs(taban,ussu));

        System.out.print("devam mı, tamam mı?: ");
        String devam=odev.next();

        if (devam.equals("devam")){
            devamet = true;
        }else devamet = false;

    }while(devamet);




    }


}
