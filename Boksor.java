package NesneYonelimliProgramlama;

public class Boksor {
    String isim;
    int hasar;
    int can;
    int kilo;
    int bloklama;

    Boksor(String isim,int hasar, int can, int kilo,int bloklama ){
        this.isim=isim;
        this.hasar=hasar;
        this.can=can;
        this.kilo=kilo;
        if(bloklama>=0 && bloklama<=100){
            this.bloklama=bloklama;
        }else{
            this.bloklama=0;
        }

    }
    int vurus(Boksor rakip){
        System.out.println(this.isim + " => "+ rakip.isim + "'e " + this.hasar + " hasar yarattı.");

        if(isBloklama()){
            System.out.println(rakip.isim +" Gelen hasarı blokladı.");
            return rakip.can;
        }
        if(rakip.can-this.hasar<0){
            return 0;
        }else {
        return rakip.can - this.hasar;
        }
    }
    boolean isBloklama(){
        double randomNumara = Math.random() * 100;
    //    System.out.println(randomNumara);
        return randomNumara <= this.bloklama;

    }





}
