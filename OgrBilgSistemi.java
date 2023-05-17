package NesneYonelimliProgramlama;

public class OgrBilgSistemi {
    public static void main(String[] args) {

        Hoca hoca1 = new Hoca("Mahmut Hoca","0543 543 55 43","TRH");         //hoca1.print();
        Hoca hoca2 = new Hoca("Kül Yutmaz", "0543 665 66 55","BİYO");   // hoca2.print();
        Hoca hoca3 = new Hoca("Şener Şen", "0543 665 66 54","BDN");   // hoca2.print();

        Ders tarih = new Ders("Tarih","TRH","Tarih");
        tarih.hocaEkle(hoca1);
        //tarih.print();
        //tarih.hocaEkleYazdir();

        Ders biyoloji = new Ders("Biyoloji","BİYO","Biyoloji");
        biyoloji.hocaEkle(hoca2);

        Ders beden = new Ders("Beden","BDN","Beden");
        beden.hocaEkle(hoca3);

        Ogrenci Ogr1 = new Ogrenci("Nurşah Fırat","149","5",tarih,biyoloji,beden);
        Ogr1.notEkle(100,70,50);
        Ogr1.sozlunotuEkle(80,80,80);
        //Ogr1.notYazdir();
        Ogr1.Isgecti();

        Ogrenci Ogr2 = new Ogrenci("Sezer Fırat", "249","5",tarih,biyoloji,beden);
        Ogr2.notEkle(70,80,50);
        Ogr2.sozlunotuEkle(80,80,80);
        Ogr2.Isgecti();




    }
}
