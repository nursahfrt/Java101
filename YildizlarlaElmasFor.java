package PaketDonguler;
import java.util.Scanner;
public class YildizlarlaElmasFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       /*
              *                // 1          5            1
             ***               // 2          4            3
            *****              // 3          3            5
           *******             // 4          2            7
          *********            // 5          1            9
         ***********           // 6          0            11
                           sira = i   bosluk=satir-i     yildiz = 2*i+1
          *********            // 5          0            9
           *******             // 4          1            7
            *****              // 3          2            5
             ***               // 2          3            3
              *                // 1          4            1
                            sira = n    bosluk= n-i     yildiz=2*i+1

         */
        int satir;
        System.out.print("Enter number :");
        satir = input.nextInt();

        for (int i=0; i<=satir;i++){

            for(int x=0;x<=satir-i;x++){
                System.out.print(" ");
            }
            for (int y=1;y<=2*i+1;y++){
                System.out.print("*");
            }
            System.out.println();
        }
            for (int i=satir;i>=0;i--){

                for (int x=satir-i;x>=0;x--){
                    System.out.print(" ");
                }
                for (int y=2*i+1;y>=1;y--){
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}
