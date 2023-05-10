package PaketTemellerDegiskenler;
import java.util.Scanner; // 2.kutuphaneyi ekle.
public class Ortalama {
    public static void main(String[] args) {

// 1.değişkenleri oluştur.
        double mat,fiz,kim,bio,geo;

// 2.Scanner sınıfını tanımla.
        Scanner puan = new Scanner(System.in);

// 3. Kullanıcıdan değerleri al.
        System.out.print("Matemetik Notunuz:");
        mat = puan.nextDouble();

        System.out.print("Fizik Notunuz:");
        fiz=puan.nextDouble();

        System.out.print("Kimya Notunuz:");
        kim=puan.nextDouble();

        System.out.print("Biyoloji Notunuz:");
        bio=puan.nextDouble();

        System.out.print("Geometri Notunuz:");
        geo=puan.nextDouble();


        double toplam= mat+fiz+kim+bio+geo;
        double sonuc=(toplam/5);
        System.out.println("Toplam puan:" + toplam);
        System.out.println("Ortalamanız:" + sonuc);

        String kosul = (sonuc<60) ? "Sınıfta Kaldı":"Geçti ama nasıl?";
        System.out.println(kosul);

        String kosul1 = (sonuc>=60)&&(sonuc<80) ? "Ortalama üstü ile Sınıfı Geçti":"Geçti ama nasıl?";
        System.out.println(kosul1);

        String kosul2 = (sonuc>=80) ? "Başarı ile Sınıfı Geçti":"";
        System.out.println(kosul2);


    }
}
