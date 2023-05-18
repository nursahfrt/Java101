package NesneYonelimliProgramlama;

public class Calisanlar {
    String isim;
    double maas;
    double hftCalismaSaati;
    int basYili;
    Calisanlar(String isim, double maas, double calismaSaati,int basYili){
        this.isim=isim;
        this.maas=maas;
        this.hftCalismaSaati=calismaSaati;
        this.basYili=basYili;
        }
        double vergi(){
        if(this.maas<1000)
            return  0;
        else
            return this.maas*0.03;
    }
    double bonus(){
        int bonus;
        if(this.hftCalismaSaati<40)
            return 0;
        else
            return (this.hftCalismaSaati-40)*30;
    }
    double maasZammi(){
        if(2021-this.basYili<10)
            return maas*0.05;
        if (2021-this.basYili>=10 && 2021-this.basYili<20){
            return this.maas*0.1;
        }else
            return this.maas*0.15;
    }
    double toplamMaas(){
        vergi();
        bonus();
        maasZammi();
        return this.maas-vergi()+bonus()+maasZammi();
    }


    public void yazdir(){
        System.out.println("Ad Soyad \t \t: " + this.isim);
        System.out.println("Maaş\t \t \t: " + this.maas);
        System.out.println("Çalışma Saati \t: " + this.hftCalismaSaati);
        System.out.println("Başlangıç Yılı \t: " + this.basYili);
        System.out.println("Vergi\t \t \t: " + vergi());
        System.out.println("Bonus\t \t \t: " + bonus());
        System.out.println("Maaş Artışı\t \t: " + maasZammi());
        System.out.println("Maaş+Bonus-vergi: " + (this.maas+bonus()-vergi()));
        System.out.println("Maaş+maaş Artışı: " + (this.maas+maasZammi()));
        System.out.println("Toplam Hakediş\t: " + toplamMaas());
    }



}
