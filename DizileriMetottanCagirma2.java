package Diziler6;

public class DizileriMetottanCagirma2 {

    static void sayiUret(int[] sayi){
        for (int i = 0; i < sayi.length; i++){
            sayi[i]=(i*10)+10;
            System.out.println(sayi[i]);
        }
    }

    static void sayiUret(double[] sayi){
        for (int i = 0; i < sayi.length; i++){
            sayi[i]=(i*10)+10;
            System.out.println(sayi[i]);
        }
    }

    static void yazdir(double yaz[]){
        for (int i = 0; i < yaz.length; i++) {
            System.out.println(yaz[i]);
        }
    }

    public static void main(String[] args) {

        int[] cagir1 = new int[10];
        sayiUret(cagir1);

        System.out.println(" ========================================= ");

        double[] cagir2 = new double[5];
        sayiUret(cagir2);

        System.out.println(" ========================================= ");

        double[] cagir3 = {2.2, 4.2, 6.5, 8.8};
       yazdir(cagir3);



    }
}
