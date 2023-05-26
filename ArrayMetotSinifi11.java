package Diziler6;
public class ArrayMetotSinifi11 {

    static void yazdir(int[] yazdirin){
        System.out.print("[");
        for(int i = 0; i< yazdirin.length; i++ ){
            System.out.print(yazdirin[i] + ", ");
        }
        System.out.print("]");
    }
    static void yazdir(double[] yazdirin){
        System.out.print("[");
        for(int i = 0; i< yazdirin.length; i++ ){
            System.out.print(yazdirin[i] + ", ");
        }
        System.out.print("]");
    }

    static void fill(int[] list, int degistirilecekDeger){
        for(int i=0;i<list.length;i++){
            list[i]=degistirilecekDeger;
        }
        yazdir(list);
    }
    static void fill(double[] list, int degistirilecekDeger){
        for(int i=0;i<list.length;i++){
            list[i]=degistirilecekDeger;
        }
        yazdir(list);
    }
    static void fillAralik(int[] list,int indis1, int indis2,int degistirilecekDeger){
        for(int i = indis1; i < indis2; i++){
            list[i]=degistirilecekDeger;
        }
        yazdir(list);
    }

    //int[] liste1= {1,5,12,-13,77,45,8,94,-5,-12,71};
    static void sort(int[] list){
        int gecici;
        for(int i=0; i < list.length-1; i++){
            for(int j=i+1;j<list.length;j++){
                if(list[i]>list[j]){
                    gecici=list[i]; // list[i] degeri kaybolmasın diye bir değişkene atayarak tutuyoruz.

                    list[i]=list[j]; // list[i] ye yeni küçük değer olan list[j] nin değerini atıyoruz.
                    list[j]=gecici; // yeni list[j] değeri de list[i] nin değeri kayolmasın diye atadığımız geçici değeri oluyor.
                }
            }
        }
        yazdir(list);
    }

    static void binarySearch(int[] list,int indeksiHesaplanacakDeger){
        int sayac=0;
        for (int i=0 ; i<list.length;i++){
            if(list[i]==indeksiHesaplanacakDeger){
                break;
            }
            sayac++;
        }
        System.out.print(sayac);
    }

    static void kopyala(int[] list,int uzunluk){
       int[] yeniListe = new int[uzunluk];
       for(int i=0; i<uzunluk; i++){
           yeniListe[i]=list[i];
       }
       yazdir(yeniListe);
    }

    static void kopyalaAralik(int[] list, int baslgIndis, int bitisIndis){
        int[] yeniListe =new int[list.length];
        for(int i=baslgIndis;i<bitisIndis;i++){
            yeniListe[i]=list[i];
        }
        yazdir(yeniListe);
    }

 static boolean esitlikKontrol(int[] list, int[] list1){
        if (list.length!=list1.length){
            return false;
        }
        for (int i = 0; i < list.length; i++) {
                if (list[i] != list1[i]) {
                    return false;
                }
            }
        return true;
 }


}
