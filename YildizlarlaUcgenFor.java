package PaketDonguler;
import java.util.Scanner;
public class YildizlarlaUcgenFor {
    public static void main(String[] args) {
        Scanner ucgen = new Scanner(System.in);
     /*
              *                // 1          5            1
             ***               // 2          4            3
            *****              // 3          3            5
           *******             // 4          2            7
          *********            // 5          1            9
         ***********           // 6          0            11

i=1'den satir e kadar.         satir=6    bosluk=satir-i   yildizSayisi=2*i-1

         */
        int satir;
        System.out.print("satir:");
        satir = ucgen.nextInt();

        for (int i=0; i<=satir;i++){

            for(int x=0;x<=satir-i;x++){
                System.out.print(" ");
            }
            for (int y=1;y<=2*i+1;y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
