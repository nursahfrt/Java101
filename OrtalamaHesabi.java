package Diziler6;

public class OrtalamaHesabi {
    static double ortalama(int[] list){
        double ortalama;
        int topla = 0;
        for(int i = 0; i<list.length; i++){
            topla += list[i];
        }
        System.out.println("Toplam \t\t= " + topla);
        ortalama = topla / list.length;
        System.out.println("Ortalama \t= " + ortalama);
           return ortalama;
    }

    static double harmonikOrtalama(int[] list){
        double seri=0.0;
        double ortalama=0.0;

        for(int i= 0; i< list.length; i++){
            seri += 1.0/list[i];

            //System.out.println(seri);
        }
        System.out.println(seri);
        ortalama=list.length/seri;
        System.out.println(ortalama);

        return ortalama;
    }

    public static void main(String[] args) {
        int[] liste = {10,20,30,40,50};
        ortalama(liste);
        harmonikOrtalama(liste);





    }




}
