package Diziler6;
import java.util.Arrays;

public class DegerTekrarSayisi {
    public static void main(String[] args) {

        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};

        int sayac = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i] == list[j]) {
                    if (j < i) {
                        break;
                    }
                    else{
                        sayac++;
                    }
                }
            }
            if (sayac > 0) {
                //System.out.println(arr[i]+" sayisi "+ count + " kere yazilmistir.");
                System.out.printf("%d sayisi %d kere yazilmistir.\n", list[i], sayac);
                sayac = 0;
            }
        }

    }
}
