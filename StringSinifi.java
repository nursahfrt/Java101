package Diziler6.MathveStringSinifi7;

import java.util.Arrays;

public class StringSinifi {
    //Merhaba değerli Kodlama Vakti takipçileri, Bu dersimizde Java'da String Sınıfı Kullanımı öğreneceğiz.
    //Java'da String sınıfları char türünden verilerden oluşmuş bir kümedir yani karakterlerden oluşur.
    // Java işlerimizi kolaylaştırmak ve String ifadelerle işlem yapmak için String sınıfını sunar.


    public static void main(String[] args) {

        //Java String Sınıfı Metotları

        // Metot	                Açıklama	                                                               Veri Dönüş Tipi

        //iNDİS KARŞILIĞINDAKİ KAREKTERİ VERİR...

        // charAt()	            Belirtilen indisteki karakteri verir.                                               char
        String deneme= "Merhaba";
        System.out.println(" 1) "+deneme.charAt(2));

        //kARAKTERİN İNDEKSİNİ BULMA...

        // indexOf()	        Bir dizede belirtilen karakterlerin ilk bulunan oluşumunun konumunu verir	        int
        String S9 = "Harun.xyz";
        System.out.println(" 2) "+S9.indexOf("x")); // String aratabiliriz         // 6 değeri döner
        System.out.println(" 2) "+S9.indexOf('H')); // Karakter aratabiliriz       // 0 değeri döner

        // lastIndexOf()	    Bir dizede belirtilen karakterlerin son bulunan oluşumunun konumunu verir	        int


        //iNDİS KARŞILIĞINDAKİ UNICODU VERİR...

        // codePointAt()	    Belirtilen indisteki karakterin Unicode'unu verir.	                                int
        System.out.println(" 3) "+deneme.codePointAt(2));

        // codePointBefore()	Belirtilen indisteki önceki karakterin Unicode'unu verir.                           int
        System.out.println(" 4) "+deneme.codePointBefore(2)); //e nin unicodu

        // codePointCount()	    Bu dizenin belirtilen metin aralığındaki Unicode'u KARAKATERLERİNİ SAYIP döndürür.  int
        System.out.println(" 5) "+deneme.codePointCount(2,5));

        //BİRLEŞTİRME...

        String S1 = "Merhaba";
        String S2 = " Harun Blog";
        String S3 = S1 + S2; // + Simgesiyle birleştirme
        System.out.println(" 6) "+S3);

        //SONUNA BİRLEŞTİRME(EKLEME) YAPAR...

        // concat()	            Başka bir String'in sonuna bir karakter ekler.	                                    String

        System.out.println(" 7) "+S1.concat(" dünya!"));

        String S4 = S1.concat(S2); // concat metodunu kullanmak
        System.out.println(" 7) "+S4);

        //KARŞILAŞTIRMA YAPAR (EŞİTLİK) ...

        // compareTo()	        İki dizeyi sözlükbilimsel olarak karşılaştırır.	                                    int
        //                      compareTo Normal Karşılaştırır
        //                      compareToIgnoreCase Büyük-Küçük Harf Ayrımı Yapmaz

        String S14 = "ABC";
        String S15 = "ABc";
        System.out.println(" 8) "+S15.compareTo(S14));

        // compareToIgnoreCase() Büyük / küçük harf farklılıklarını göz ardı ederek;                                int
        //                      iki dizgeyi sözlükbilimsel olarak karşılaştırır
        //                      compareTo Normal Karşılaştırır
        //                      compareToIgnoreCase Büyük-Küçük Harf Ayrımı Yapmaz
        System.out.println(" 9) "+S15.compareToIgnoreCase(S14));

        // equals()	            İki dizgiyi karşılaştırır. Dizeler eşitse doğru, değilse yanlış döndürür.           boolean
        String deneme10 = "Soyadınız:";
        System.out.println(" 10) "+deneme10.equals("Soyadınız:"));

        // equalsIgnoreCase()	Büyük / küçük harfe ilişkin hususları göz ardı ederek iki dizeyi karşılaştırır	    boolean
        System.out.println(" 11) "+deneme10.equalsIgnoreCase("SOYADINIZ:"));

        //ARAMA YAPAR (İÇİNDE VAR MI?)...

        // contains()	        Bir dizenin bir dizi karakter içerip içermediğini kontrol eder	                    boolean
        //                      STRİNG İÇİNDE arama yapar.
        String deneme4 = "Hello";
        System.out.println(" 12) "+deneme4.contains("ello"));
        System.out.println(" 12) "+deneme4.contains("mello"));

        // contentEquals()	    Bir dizenin belirtilen CharSequence veya StringBuffer                               boolean
        //                      ile aynı karakter dizisini içerip içermediğini kontrol eder.
        //                      Kelime içi arama yapar.

        String deneme5 = "adınız:";
        System.out.println(" 13) "+deneme5.contentEquals("ınız:"));
        System.out.println(" 13) "+deneme5.contentEquals("adınız:"));

        // BELİRTİLEN KARAKTERLE BAŞLAYIP/ BİTTİĞİNİ KONTROL EDER...

        // startsWith()	        Bir dizenin belirtilen karakterlerle başlayıp başlamadığını kontrol eder	        boolean
        // endsWith()	        Bir dizenin belirtilen karakter (ler) ile bitip bitmediğini kontrol eder            boolean

        String S25 = "merhaba_dunya@gmail.com";

        if(S25.endsWith("@gmail.com")){
            System.out.println(" 14) "+"Gmail Kullanıyor");

            if(S25.startsWith("merhaba_dunya")){
                System.out.println(" 14) "+"Aranan Mail");
            }
        }

        //TAMAMEN BÜYÜK YA DA KÜÇÜK HARFE ÇEVİRME...

        // toLowerCase()	    Bir dizeyi küçük harflere dönüştürür	                                            String
        String S10 = "Harun.XYZ";
        System.out.println(" 15) "+S10.toLowerCase()); // Tamamen Küçültmek için

        // toUpperCase()	    Bir dizeyi büyük harflere dönüştürür	                                            String
        System.out.println(" 15) "+S10.toUpperCase()); // Tamamen Büyültmek için

        //VERİ TİPİ DÖNÜŞTÜRME YAPAR...

        String S20 = "25";
        byte sayiByte       = Byte.valueOf(S20);    // Byte.valueOf()	  Bir String nesnesinin Bayt ye dönüştürür.   String
        System.out.println(" 16.1) "+sayiByte);
        short sayiShort     = Short.valueOf(S20);   // Short.valueOf()	  Bir String nesnesinin Short a dönüştürür.   String
        System.out.println(" 16.2) "+sayiShort);
        int sayiInt         = Integer.valueOf(S20); // Integer.valueOf()  Bir String nesnesinin integer a dönüştürür. String
        System.out.println(" 16.3) "+sayiInt);
        long sayiLong       = Long.valueOf(S20);    // Long.valueOf()	  Bir String nesnesinin Long a dönüştürür.    String
        System.out.println(" 16.4) "+sayiLong);

        String S21 = "25.55";
        float sayiFloat     = Float.valueOf(S21);   // Float.valueOf()	  Bir String nesnesinin Float a dönüştürür.   String
        System.out.println(" 16.5) "+sayiFloat);
        double sayiDouble   = Double.valueOf(S21);  // Double.valueOf()	  Bir String nesnesinin Double ye dönüştürür. String
        System.out.println(" 16.6) "+sayiDouble);

        // String.valueOf()     Bir integer nesnesinin String e dönüştürür.                                         String
        //                      String.valueOf metodu sayısal, karakter, object bir veriyi Stringe dönüştürür
        String S17 = "";

        int sayi18 = 45;
        float sayi19 = 50.5f;
        S17 = String.valueOf(sayi18);
        System.out.println(" 17) "+S17);
        S17 = String.valueOf(sayi19);
        System.out.println(" 17) "+S17);

        // copyValueOf()	    Char Dizinin İstenilen Kısmını Stringe Dönüştürür.               	                String
        //                      copyValueOf() Char Dizinin İstenilen Kısmını Stringe Dönüştürür
        char[] charArray = {'M','E','R','H','A','B','A'};

        String S23 = String.copyValueOf(charArray); // Tamamanı Stringe Döker
        System.out.println(" 18) "+S23); // MERHABA

        String S24 = String.copyValueOf(charArray,1,5); // 1. indisten başlayıp 5 tane karakteri kopyalar
        System.out.println(" 18) "+S24); // ERHAB

        // STRİNGİ DİZİYE (ARRAY) DÖNÜŞTÜRME...

        // toCharArray()	    Bu dizeyi yeni bir karakter dizisine dönüştürür	                                    char[]
        //                      Stringi diziye çevirir.
        //                      toCharArray() Stringin Her Harfini Char Dizisine Aktarır
        String S22 = "Merhaba Dünya";
        char[] dizi= S22.toCharArray();
        System.out.println(" 19) "+dizi[0]);

        //STRINGİ ALT DİZİLERE BÖLÜP DÖNÜŞTÜRME...

        // split()	            Bir dizeyi bir alt dizeye böler	                                                    String[]
        //                      Split ile metni parçalarız
        //                      Burada metni boşluklarından 3 farklı parçaya bölüp diziye aktardı
        String S13 = "Merhaba Java Dersi";
        String[] kelimeler = S13.split(" ");

        System.out.println(" 20) "+kelimeler[0]); // Merhaba
        System.out.println(" 20) "+kelimeler[1]); // Java
        System.out.println(" 20) "+kelimeler[2]); // Dersi

        // subSequence()	    Bu dizinin bir alt dizisi olan yeni bir karakter dizisi verir	                    CharSequence


        // substring()	        Karakterleri bir dizeden, belirtilen bir başlangıç konumundan başlayarak            String
        //                      ve belirtilen karakter sayısıyla ayıklar
        String S7 = "Merhaba Harun.xyz";
        String S8 = S7.substring(0,7);
        System.out.println(" 21) "+S8);


        // ÇIKTI BİÇİMLNDİRME...

        // format()	            Belirtilen yerel ayarı, biçim dizesini ve bağımsız değişkenleri kullanarak          String
        //                      biçimlendirilmiş bir dize döndürür
        String S5 = "Harun.xyz";
        byte sayi1 = 0;
        short sayi2 = 25;
        int sayi3 = 50;
        long sayi4 = 75;
        float sayi5 = 99.99f;
        double sayi6 = 149.99d;

        System.out.format(" 22.1) "+"%s  \n",S5);// String biçimlemek için %s kullanılır
        System.out.println(" 22.2) "+String.format(S1));
        System.out.printf(" 22.3) "+"%d %d %d %d \n" ,sayi1, sayi2, sayi3, sayi4); // Tam Sayıları biçimlemek için %d kullanılır
        System.out.printf(" 22.4) "+"%.2f %.4f  \n",sayi5, sayi6); // Ondalıklı Sayıları biçimlemek için %f kullanılır

        //KELİMEYİ YENİSİYLE DEĞİŞTİRME...

        // replace()	        Belirli bir değer için bir dize arar ve belirtilen değerlerin değiştirildiği        String
        //                      yeni bir dize döndürür.
        //                      replace() ilk parametresi hedef kelime
        //                      ikinci parametresi yeni kelime olarak doldurulur

        String S16 = "Merhaba Dünya Nasılsın? ";
        System.out.println(" 23) "+S16.replace("Nasılsın?", "Selam")); // Geçici Değişiklik
        S16 = S16.replace("Nasılsın?", "Selam"); // Kalıcı Değişiklik

        // replaceFirst()	    Verilen normal ifadeyle eşleşen bir alt dizenin ilk oluşumunu                       String
        //                      verilen değiştirmeyle değiştirir

        // replaceAll()	        Verilen normal ifadeyle eşleşen bu dizenin her bir alt dizesini                     String
        //                      verilen değiştirmeyle değiştirir

        //EKRANA YAZDIRMA...

        // toString()	        Bir String nesnesinin değerini verir	                                            String
        char[] gelis = {'M','E','R','H','A','B','A'};
        System.out.println(" 24) "+Arrays.toString(gelis));

        //SAĞ SOL BOŞLUKLARI SİLME...

        // trim()	            Bir dizenin her iki ucundaki(SAĞ/SOL) boşluğu kaldırır	                            String
        //                      Bu metot genellikle yanlışlıkla boşluk girilmişse
        //                      temizlemek için kullanılır.

        String S11 = " Harun.xyz ";
        System.out.println(" 25) "+S11);
        System.out.println(" 25) "+S11.trim());

        String S12 = S11.trim(); // Bu şekilde boşlukları temizlenen String depolanabilir
        System.out.println(" 25) "+S12);

        //İÇERİK BOŞ MU KONTROL EDER...

        // isEmpty()	        Bir dizenin boş olup olmadığını kontrol eder.	                                    boolean
        String S30 = "Merhaba Harun Blog";
        System.out.println(" 26) "+S30.isEmpty());

        //UZUNLUK...

        // length()	            Belirtilen bir dizenin uzunluğunu verir	                                            int
        String S6 = "Merhaba Harun Blog";
        System.out.println(" 27) "+S6.length());

        //KAÇIŞ KARAKTERLERİ...

        System.out.println(" 28) "+" \' ");             // Tek Tırnak eklemek
        System.out.println(" 28) "+" \" ");             // Çift Tırnak eklemek
        System.out.println(" 28) "+" \\ ");             // Eğik Çizgi eklemek
        System.out.println(" 28) "+"Merhaba \r 28) Hello"); // Satırı bu karakterden sonra başlatır. Öncesini yazdırmaz.
        System.out.println(" 28) "+"1234\bTEST");       // Bir boşluk geri gider.
        System.out.println(" 28) "+"1234\fTEST");       // Form Feed ekler.


        // getBytes()	        Bu dizeyi adlandırılmış karakter kümesini kullanarak bir bayt dizisine kodlar,      byte[]
        //                      sonucu yeni bir bayt dizisinde saklar

        // getChars()	        Karakterleri bir dizeden bir karakter dizisine kopyalar	                            void


        // hashCode()	        Bir dizenin karma kodunu verir	                                                    int



        // intern()	            Aramayı belirtilen dizinde başlatarak, belirtilen karakterin ilk oluşumunun         String
        //                      bu dizge içindeki dizini döndürür.


        // offsetByCodePoints()	CodePointOffset kod noktaları tarafından verilen dizinden uzak olan bu dize         int
        //                      içindeki dizini döndürür

        // matches()	        Normal bir ifadeye karşı bir eşleşme için bir dize arar ve eşleşmeleri döndürür.    boolean


        // regionMatches()	    İki dizi bölgesinin eşit olup olmadığını test eder	                                boolean




    }
}
