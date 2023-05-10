package PaketTemellerDegiskenler;

public class VeriturleriKarakterveMantıksal {
    public static void main(String[] args) {
        System.out.println("Karakter (char) ve Mantıksal (boolean) Veri Tipleri");
 /*Karakter (Char) Veri Tipleri =
        karakterler char ile saklanır.
        char, java unicode karakter setini kullanır ve tüm dillerini içerir.
        Char veri tipleri birleşerek string sınıfında bir yapıya dönüşür.
        char =       16 bit uzunluğunda.
*/
        char bir ='b';
        char iki = 98; // aski kod karşılığı 98 = b
        char uc = 'j';
        char dort = 'a';
        char bes = 'v';
        char alti = 'a';

        System.out.println(bir);
        System.out.println(iki);
        System.out.println(uc+dort+bes+alti); // Sayısal karşılığını yazar. (aski kod karşılığı)
        System.out.println(""+uc+dort+bes+alti); // ""+ yazrsan başına = karakter karşılığını yazar.
/*
Mantıksal / Boolean (True/False) Veri Tipleri =
        Ekrana çıktı vermek için kullanılır.
        Mantıksal değerler boolean ile saklanır.
        Boolean sadece 2 değer alabilir.(True/False)
        Genellikle koşul ve döngü işlemlerinde kontrol amaçlı kullanılır.
 */
        boolean aydin = true;
        boolean ahmet = false;
        System.out.println(aydin);
        System.out.println(ahmet);



    }
}
