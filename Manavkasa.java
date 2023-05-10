package PaketTemellerDegiskenler;
import java.util.Scanner;
public class Manavkasa {
    public static void main(String[] args){
        double armut =2.14, elma=3.67, domates=1.11, muze= 0.95, patlican=5,
                armutkg, elmakg, domateskg, muzekg, patlicankg,tutar;
        Scanner manav = new Scanner(System.in);

        System.out.print("Armut kaç kg:");
        armutkg = manav.nextDouble();

        System.out.print("Elma kaç kg:");
        elmakg = manav.nextDouble();

        System. out.print("Domates kaç kg?:");
        domateskg = manav.nextDouble();

        System.out.print("Muze kaç kg?:");
        muzekg= manav.nextDouble();

        System.out.print("Patlıcan kaç kg?:");
        patlicankg= manav.nextDouble();

        tutar=armut*armutkg+elma*elmakg+domates*domateskg+muze*muzekg+patlican*patlicankg;
        System.out.print("Total Tutar:"+ tutar);







    }
}
