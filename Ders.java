package NesneYonelimliProgramlama;

public class Ders {
    Hoca hoca;       //String hoca; demiyoruz çünkü hoca sayfasındaki tanımlı verilerden faydalanacağız.
    String isim;
    String kod;
    String onEk;
    int not;
    int sozlunotu;

    Ders(String isim, String kod, String onEk){
        this.isim   =isim;
        this.kod    =kod;
        this.onEk   =onEk;
        this.not    =0;
    }
    void hocaEkle(Hoca hoca){
        if (hoca.brans.equals(this.kod)){
            this.hoca=hoca;
        } else
            System.out.println("Öğretmen ve Ders kodları uyuşmadı. (Brans / kod)");
    }
    void hocaEkleYazdir(){
            this.hoca.print();
    }
    void print(){
        System.out.println("=============================");
        System.out.println("Ders \t\t:"     +this.isim);
        System.out.println("Ders kodu \t:"  +this.kod);
        // System.out.println("Ders Ön Ek \t:" +this.onEk);
        System.out.println("Ders Notu \t:"  +this.not);
    }





}
