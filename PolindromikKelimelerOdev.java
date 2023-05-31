package Diziler6.MathveStringSinifi7;
import java.util.Scanner;
public class PolindromikKelimelerOdev {
    static boolean isPolindromik(String kelime){
        int i = 0;
        int j = kelime.length()-1;
        while (i<j){
            if(kelime.charAt(i)!=kelime.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    static boolean isPolindromik2(String kelime){
        String ters= "";
        for(int i = kelime.length()-1; i>=0; i--){
            ters+=kelime.charAt(i);
            //System.out.println(ters);
        }
        if(kelime.equals(ters)){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner odev = new Scanner(System.in);
        boolean isdevam=true;

        do {
            System.out.println("-------------------");
            System.out.print("1 - Polindromik kelime sorgulama \n2 - Çıkış\nİşlem numarası giriniz = ");
            int islem = odev.nextInt();

            if (islem==1) {
            System.out.print("Polindromik kelime giriniz = ");
            String kelime = odev.next();
            System.out.println(isPolindromik(kelime));
            }
            else if(islem==2) {
            System.out.print("Hoşçakalın... ");
            isdevam=false;
            break;
            }else {
                System.out.print("Hatalı numara girdiniz.\n");
            }
        }while (isdevam);
    }

}
