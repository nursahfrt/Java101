package Diziler6;

public class MetottanDiziDondurme3 {

    static int[] tersDondur(int[] dondur){
        int[] cevir = new int[dondur.length];
        for (int i=0 , j=dondur.length-1; i < dondur.length; i++,j-- ){
            cevir[i]=dondur[j];
        }
        return cevir;
    }
    static void yazdir(int[] yaz){
        for (int i=0;i<yaz.length;i++)
        System.out.println(yaz[i]);
    }

    public static void main(String[] args) {

        int[] sayi = {10,20,30,40,50,60,70,80,90,100};
        //tersDondur(sayi);
        //yazdir(sayi);

        System.out.println(" ========================================= ");

        int[] yeniDeger = tersDondur(sayi);
        yazdir(yeniDeger);

        System.out.println(" ========================================= ");


    }

}
