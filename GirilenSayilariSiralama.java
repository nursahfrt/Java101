package Diziler6;
import java.util.Arrays;
import java.util.Scanner;
public class GirilenSayilariSiralama {

    public static void main(String[] args) {

        Scanner odev = new Scanner(System.in);
        System.out.print("Dizinin Boyutunı giriniz \t= ");
        int boyut = odev.nextInt();
        int[] dizi = new int[boyut];

        for(int i = 0 ; i < boyut ; i++){
            System.out.print(i+1 +". sayıyı giriniz \t\t\t= ");
            dizi[i] = odev.nextInt();
        }
        Arrays.sort(dizi);
        System.out.print("Küçükten büyüğe sıralama \t=" + Arrays.toString(dizi));




    }

}
