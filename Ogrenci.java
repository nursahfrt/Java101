package NesneYonelimliProgramlama;

public class Ogrenci {
    Ders ders1;
    Ders ders2;
    Ders ders3;
    String isim;
    String ogrencino;
    String sinif;
    double ortalama;
    boolean isgecti=true;   // ilerde kullanırız diye yazdık. kalsın.

    Ogrenci(String isim, String ogrencino, String sinif,Ders ders1,Ders ders2,Ders ders3){
        this.isim       = isim;
        this.ogrencino  = ogrencino;
        this.sinif      = sinif;
        this.ders1      = ders1;
        this.ders2      = ders2;
        this.ders3      = ders3;
        this.ortalama   =0.0;
        this.isgecti    =false;
    }

    void dersEkle(Ders ders1, Ders ders2, Ders ders3){
        this.ders1=ders1;
        this.ders2=ders2;
        this.ders3=ders3;
    }
    void notEkle(int not1, int not2, int not3){
        if(not1>=0&&not1<=100) {
            ders1.not = not1;
        }
        if(not2>=0&&not2<=100) {
            ders2.not = not2;
        }
        if(not3>=0&&not3<=100) {
            ders3.not = not3;
        }
    }
    void ortalamahesapla(){
        this.ortalama=((ders1.not*0.8 + ders1.sozlunotu*0.2)+
                (ders2.not*0.8 + ders2.sozlunotu*0.2)+
                (ders3.not*0.8 + ders3.sozlunotu*0.2))/3;
    }
    void Isgecti(){
        ortalamahesapla();
       // this.ortalama=(this.ders1.not+this.ders2.not+this.ders3.not)/3.0;
        if (this.ortalama>55){
            System.out.println(this.isim + " = Sınıfı Geçtiniz.\n"+"Ortalamanız \t\t:"   + this.ortalama);
            isgecti=true;
        }else{
            System.out.println(this.isim + " = Sınıfta kaldınız.\n\"+Ortalamanız \t\t:"   + this.ortalama);
        isgecti=false;
        }
        notYazdir();
    }
    void sozlunotuEkle(int sozlunotu1,int sozlunotu2, int sozlunotu3){
        this.ders1.sozlunotu=sozlunotu1;
        this.ders2.sozlunotu=sozlunotu2;
        this.ders3.sozlunotu=sozlunotu3;
    }

    void notYazdir(){

        System.out.println("=============================");
        System.out.println( this.ders1.isim +" Notu\t\t\t\t:"   + this.ders1.not);
        System.out.println( this.ders1.isim +" Sözlü Notu \t\t:"  + this.ders1.sozlunotu);
        System.out.println( this.ders2.isim +" Notu\t\t\t:"     + this.ders2.not);
        System.out.println( this.ders2.isim +" Sözlü Notu \t:"  + this.ders2.sozlunotu);
        System.out.println( this.ders3.isim +" Notu \t\t\t\t:"  + this.ders3.not);
        System.out.println( this.ders3.isim +" Sözlü Notu \t\t:"  + this.ders3.sozlunotu);
        System.out.println("=============================");


    }








}
