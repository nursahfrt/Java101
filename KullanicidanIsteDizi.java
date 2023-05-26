package Diziler6;
import java.util.Scanner;
public class KullanicidanIsteDizi {
    public static void main(String[] args) {
        Scanner matrix = new Scanner(System.in);


        int[][] dizi = new int[3][4];
        System.out.print( "Giriş : " + "Satır uzunluğu : " + dizi.length +" Sütun uzunluğu : " + dizi[0].length + "\n");
       for (int satir = 0; satir < dizi.length; satir++){
           for(int sutun = 0; sutun < dizi[satir].length ; sutun++){
               dizi[satir][sutun] = matrix.nextInt();
           }
           System.out.println();
       }





    }
}
