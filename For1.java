package PaketDonguler;
// FOR = DÖNGUNUN KAÇ KEZ DÖNECEĞİNİ BİLİYORSAK FOR DÖNGÜSÜNÜ KULLANIRIZ.
// DEĞİŞKENİN İLK DEĞERİ =İLK KISMA,
// HANGİ KOŞULDA ÇALIŞACAĞI = 2. KISIMDA
// DEĞİŞKENİN ARTTIRILIP , AZALTILACAĞİ = 3. KISIMDA
// for (int i=0; i<10; i++) { }
public class For1 {
    public static void main(String[] args) {

        for (int i=1; i<=10; i += 2){
            System.out.println(i);
        }
        System.out.println("-----------");

        int k=1;
        while (k<=10) {
            System.out.println(k);
            k+=2;
        }
        System.out.println("-----------");

        int m=1;
        do {
            System.out.println(m);
            m +=2;
        }while(m<10);

        System.out.println("-----------");

        for (int x=7;x<=77;x+=7){
            System.out.print(x+",");
        }

    }
}
