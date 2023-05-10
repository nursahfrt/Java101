package PaketTemellerDegiskenler;
import java.util.Scanner;
public class Dairealancevre {
    public static void main(String[] args) {
        Scanner daire =new Scanner(System.in);
        double r,pi=3.14, aci,alan,cevre,dilim;

        System.out.print("Yarıçap:");
        r=daire.nextDouble();

        System.out.print("Açı:");
        aci=daire.nextDouble();

        alan=pi*r*r;
        cevre=2*pi*r;
        dilim=pi*r*r*aci/360;

        System.out.println("Daire çevresi:" + cevre);
        System.out.println("Daire Alanı:" + alan);
        System.out.println("Daire dilimi alanı:" + dilim);




    }
}