package Diziler6;

public class ForEach10 {
    public static void main(String[] args) {
        //ForEach Kullanımı

        //Java'da ForEach deyimi adında da anlaşılacağı gibi bir döngüyü ifade eder.
        // Genelde dizilerdeki ve listelerdeki elemanları daha hızlı şekilde ulaşmak için kullanılan kısa bir yöntemdir.
        // Kısacası for döngüsünün modifiye edilmiş halidir.

        //for (veritipi degisken: diziAdi) {
        //  // kod bloğu
        //}

        //Örnekte Java'da ForEach kullanımını görmektesiniz,
        // yine bir for döngüsü oluşturuyoruz ama iki parametreyi iki nokta ile ayırıyoruz.
        // İlk kısmında dizinin döndüreceği veri tipini ve for içinde dizinin elemanı olarak kullanacağınız değişkeni tanımlıyorsunuz, diğer kısımda ise dizimizin ismini yazıyoruz.

        String[] araba = {"Bmw", "Audi", "Mercedes", "Ferrari"};

        for (int i = 0; i < araba.length; i++)         // aynı kod = for (String sec: araba)
            System.out.print(araba[i] + ", ");

        System.out.println("\n=========");

        for (String sec : araba)                     // üstteki kodun kısalmış halidir. for diye tanımlanır.
            System.out.print(sec + ", ");

        System.out.println("\n=====================================================");

        int[] deger = {1, 2, 3, 4, 5};

        for (int i = 0; i < deger.length; i++) {
            System.out.print(deger[i] + ", ");
        }

        System.out.println("\n=========");

        for (int goster : deger) {                     //kısası
            System.out.print(goster + ", ");
        }
        System.out.println("\n=========");

        int sum = 0;                                  //toplama
        for (int topla : deger) {
            sum += topla;
            System.out.print(sum + ",");
        }
        System.out.print("\n" + sum + ",");

        System.out.println("\n=====================================================");

        int[][] dizi = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi[i].length; j++) {
                System.out.print(dizi[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println("\n=========");

        for (int[] satir : dizi) {                  // coklu dizi ise bir tane [] kullan
            for (int sutun : satir) {
                System.out.print(sutun + ", ");
            }
            System.out.println();
        }

        System.out.println("\n=========");

        for (int[] satir : dizi) {                  // sadece  indeksi 0 olan satırları yaz dedim.
            System.out.println(satir[0] + ", ");
        }
        System.out.println();

        System.out.println("\n=========");









    }
}
