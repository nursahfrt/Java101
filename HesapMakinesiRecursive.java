package PaketMetotlaryaniFonksiyonlar;
import java.util.Scanner;
public class HesapMakinesiRecursive {
    static double topla(double x,double y){
        return x+y;
    }
    static double cikar(double x,double y){
        return x-y;
    }
    static double carp(double x,double y){
        return x*y;
    }
    static double bol(double x,double y){
        if (y==0) {
            System.out.println("Bölüm sayısı 0 olamaz!");
            //return 0;
        }
        return x/y;
    }
    static double ussu(double x,double y){
        int sonuc=1;
        for(double i=1; i<=y;i++){
            sonuc *=x;
        }
        return sonuc;
    }
    static double faktoriyel(double x){
        if (x==1)return 1;
        x*=faktoriyel(x-1);
        return x;
    }
    static double mod(double x,double y){
        if (y==0){
            System.out.println("Bölüm sayısı 0 olamaz!");
        //return 0;
        }
        return x%y;
    }

    static double dairealan(double x){
        return 3.14*x*x;
    }
    static double dairecevre(double x){
        return 2*3.14*x;
    }
    static double dikdortgenalan(double x,double y){
        return x*y;
    }
    static double dikdortgencevre(double x,double y){
        return 2*(x+y);
    }


    public static void main(String[] args) {
        Scanner makine = new Scanner(System.in);

        System.out.println("1- Toplama İşlemi \n"+
                "2- Çıkarma İşlemi\n"+
                "3- Çarpma İşlemi\n"+
                "4- Bölme işlemi\n"+
                "5- Üslü Sayı Hesaplama\n"+
                "6- Faktoriyel Hesaplama\n"+
                "7- Mod Alma\n"+
                "8- Daire Alan ve Çevre Hesabı\n"+
                "9- Dikdörtgen Alan ve Çevre Hesabı");


        boolean isdevam=true;
        do{
            System.out.print("İşlem numarası giriniz: ");
            int islem = makine.nextInt();

            if(islem>=1 && islem<=9) {
                System.out.print("1.sayı: ");
               double n1 = makine.nextInt();

                switch (islem) {
                    case 1:
                        System.out.print("2.sayı: ");
                        double n2 = makine.nextInt();
                        System.out.println("Toplama => " + topla(n1, n2));
                        isdevam = true;
                        break;
                    case 2:
                        System.out.print("2.sayı: ");
                        double n3 = makine.nextInt();
                        System.out.println("Çıkarma => " + cikar(n1, n3));
                        isdevam = true;
                        break;
                    case 3:
                        System.out.print("2.sayı: ");
                        double n4 = makine.nextInt();
                        System.out.println("Çarpma => " + carp(n1, n4));
                        isdevam = true;
                        break;
                    case 4:
                        System.out.print("2.sayı: ");
                        double n5 = makine.nextInt();
                        System.out.println("Bölme => " + bol(n1, n5));
                        isdevam = true;
                        break;
                    case 5:
                        System.out.print("2.sayı: ");
                        double n6 = makine.nextInt();
                        System.out.println("Üssü => " + ussu(n1,n6));
                        isdevam = true;
                        break;
                    case 6:
                        System.out.println("Faktöriyeli => " + faktoriyel(n1));
                        isdevam = true;
                        break;
                    case 7:
                        System.out.print("2.sayı: ");
                        double n7 = makine.nextInt();
                        System.out.println("Modu => " + mod(n1,n7));
                        isdevam = true;
                        break;
                    case 8:
                        System.out.println("Alanı => " + dairealan(n1));
                        System.out.println("Çevresi => " + dairecevre(n1));
                        isdevam = true;
                        break;
                    case 9:
                        System.out.print("2.sayı: ");
                        double n8 = makine.nextInt();
                        System.out.println("Alanı => " + dikdortgenalan(n1,n8));
                        System.out.println("Çevresi => " + dikdortgencevre(n1,n8));
                        isdevam = true;
                        break;
                }
            } else{
                    System.out.println("Hatalı islem numarası girdiniz.");
                    System.out.print("Çıkış yapmak istiyor musunuz? : ");
                    String cikis = makine.next();

                    if (cikis.equals("evet")){
                        isdevam = false;
                    System.out.println("Hoşçakalın");
                    }else isdevam = true;
                }
        }while (isdevam);
    }
}
