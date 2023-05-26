package Diziler6;
import java.util.Arrays;

public class AharfiYazdir {
    static void aharfi(String[][] list){
        for(int i=0; i < list.length; i++){
            for(int j=0; j < list[i].length ; j++){
                if(i==0 || i==list.length/2-1){
                    list[i][j]=" * ";
                }else if(j==0 || j==list[i].length-1){
                    list[i][j]=" * ";
                }else{
                    list[i][j]="   ";
                }
                System.out.print(list[i][j]);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        String[][] list = new String[6][4];
        aharfi(list);

        System.out.println("------------------");

        String[][] list2 = new String[10][6];
        aharfi(list2);




    }


}
