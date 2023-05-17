package NesneYonelimliProgramlama;

public class Hoca {
    String isim;
    String tel;
    String brans;

    Hoca(String isim, String tel, String brans){
        this.isim   =isim;
        this.tel    =tel;
        this.brans  =brans;
    }
    void print(){
        System.out.println("=============================");
        System.out.println("Hoca Ad \t:" + this.isim );
        System.out.println("Hoca Tel \t:" + this.tel);
        System.out.println("Hoca Branş \t:" + this.brans);
    }




}
