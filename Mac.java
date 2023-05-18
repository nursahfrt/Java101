package NesneYonelimliProgramlama;

public class Mac {
    Boksor boksor1;
    Boksor boksor2;
    int maxKilo;
    int minKilo;



    Mac(Boksor boksor1,Boksor boksor2, int minKilo, int maxKilo){
        this.boksor1=boksor1;
        this.boksor2=boksor2;
        this.maxKilo=maxKilo;
        this.minKilo=minKilo;


    }
    boolean isKontrol(){
        return (this.boksor1.kilo>=minKilo&&this.boksor1.kilo<=maxKilo)&&
                (this.boksor2.kilo>=minKilo&&this.boksor2.kilo<=maxKilo);
    }
    public void calistir(){
        if(isKontrol()){
            while (this.boksor1.can>=0 && this.boksor2.can>=0){
                System.out.println("===YENİ RAUND====");

               if(iskimBaslayacak()){
                   this.boksor1.can=this.boksor2.vurus(boksor1);
               }else
                   this.boksor2.can=this.boksor1.vurus(boksor2);

                if (isSonuc()){
                    break;
                }
                this.boksor1.can=this.boksor2.vurus(boksor1);
                if (isSonuc()){
                    break;
                }
                skor();
            }
        }else {
            System.out.println("Sporcuların sikletleri uymuyor.");
        }
        skor();
    }
    boolean isSonuc(){
        if(boksor1.can==0){
            System.out.println("======================");
            System.out.println("Kazanan =>" + boksor2.isim);
            return true;
        }
        if(boksor2.can==0) {
            System.out.println("======================");
            System.out.println("Kazanan =>" + boksor1.isim);
            return true;
        }
        return false;
    }
    void skor(){
        System.out.println(boksor2.isim+"\t\t : " + this.boksor2.can);
        System.out.println(boksor1.isim +" : " + this.boksor1.can);
    }
    boolean iskimBaslayacak(){
        double randomNumara = Math.random()*100;
        //System.out.println(randomNumara);
        if(randomNumara<=50) {
            return true;
        }
        return false;
    }



}
