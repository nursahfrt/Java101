package PaketDonguler;

// DO WHİLE = KOŞUL SAĞLANMASA DAHİ PROGRAMI BİR KEZ ÇALIŞTIRIR.
// ÇÜNKÜ KOŞUL DÖNGÜNÜN SONUNDA yazıyor. Döngünün sonunda koşul TEST EDİLİR. DO ÜSTTE WHİLE ALTTA YAZIYOR.
// (WHILE'DAN TEK FARKI = KOŞUL SAĞLANMASA DAHİ PROGRAMI BİR KEZ ÇALIŞTIRMASI.)

public class DoWhile1 {
    public static void main(String[] args) {
        int yil=2020;
        do {
            System.out.println("Hoşgeldin "+yil);
            yil++;
        }while (yil>2025);

    }
}
