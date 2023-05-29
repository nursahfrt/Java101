package Diziler6;
import java.util.Arrays;
public class TekrarEdenCiftSayi {

    static boolean birDefayaz(int[] list, int deger){
        for(int i:list){
           if(i == deger){
               return true;
           }
        }
        return false;
    }

    static void tekrarliCiftSayilar(int[] list) {
        //int[] list1 = {5,20,7,7,9,12,9,5,25,78,36,25,20,12};
        //int[] list1 = {-,20,7,7,9,12,9,5,25,78,36,25,20,12};
        int[] tekrarliCift = new int[list.length];
        int baslangic = 0;

        for(int i=0; i < list.length; i++){
            for(int j=0; j < list.length; j++){
                if((i!=j) && list[i]==list[j] && list[j]%2==0){
                    if(!birDefayaz(tekrarliCift,list[j])){
                        tekrarliCift[baslangic++] = list[j];
                    }
                }
            }
        }
        //System.out.print(Arrays.toString(tekrarliCift));
         for(int deger:tekrarliCift){
            if(deger!=0){
                System.out.print(deger + ", ");
            }
        }
    }
    public static void main(String[] args) {

        int[] list1 = {5,20,7,7,9,12,9,5,25,78,36,25,20,12};
        tekrarliCiftSayilar(list1);

    }
}
