package PaketDonguler;
import java.util.Scanner;
public class TersUcgenOdev {
   public static void main(String[] args){
       Scanner odev = new Scanner(System.in);

   /*           *********            // 5          0            9
                 *******             // 4          1            7
                  *****              // 3          2            5
                   ***               // 2          3            3
                    *                // 1          4            1
                                    sira = n    bosluk= n-i     yildiz=2*i+1

 */
       System.out.print("Satır : ");
       int satir = odev.nextInt();

       for(int i=satir;i>=1;i--){
           for (int x=0;x<satir-i;x++){
               System.out.print(" ");
           }
           for (int j=2*i-1;j>=1;j--){
               System.out.print("*");
           }
           System.out.println();
       }
   }
}
