package PaketKosulluifadeler;
import java.util.Scanner;
public class BurchesaplamaOdev {
    public static void main(String[] args) {
        Scanner burc =new Scanner(System.in);

        String ay;
        int gun;

        System.out.print("Doğduğunuz gün :");
        gun=burc.nextInt();
        System.out.print("Doğduğunuz ay :");
        ay=burc.next();

        if (ay.equals("Ocak")){
            if (gun>1 && gun<22){
                System.out.print("Burcunuz: Oğlak");
            } else if (gun<31) {
                System.out.print("Burcunuz: Kova");
            }else {
                System.out.print("Hatalı veri girdiniz.");
            }
        }
        if (ay.equals("Şubat")){
            if (gun>1 && gun<20){
                System.out.print("Burcunuz: Kova");
            } else if (gun<30) {
                System.out.print("Burcunuz: Balık");
            }else {
                System.out.print("Hatalı veri girdiniz.");
            }
        }
        if (ay.equals("Mart")){
            if (gun>1 && gun<21){
                System.out.print("Burcunuz: Balık");
            } else if (gun<31) {
                System.out.print("Burcunuz: Koç");
            }else {
                System.out.print("Hatalı veri girdiniz.");
            }
        }
        if (ay.equals("Nisan")){
            if (gun>1 && gun<21){
                System.out.print("Burcunuz: Koç");
            } else if (gun<31) {
                System.out.print("Burcunuz: Boğa");
            }else {
                System.out.print("Hatalı veri girdiniz.");
            }
        }
        if (ay.equals("Mayıs")) {
            if (gun > 1 && gun < 22) {
                System.out.print("Burcunuz: Boğa");
            } else if (gun < 31) {
                System.out.print("Burcunuz: İkizler");
            } else {
                System.out.print("Hatalı veri girdiniz.");
            }
        }
        if (ay.equals("Haziran")){
            if (gun > 1 && gun < 23){
                System.out.print("Burcunuz: İkizler");
            } else if (gun < 31) {
                System.out.print("Burcunuz: Yengeç");
            }else {
                System.out.print("Hatalı veri girdiniz.");
            }
        }
        if (ay.equals("Temmuz")){
            if (gun > 1 && gun < 23){
                System.out.print("Burcunuz: Yengeç");
            } else if (gun < 31) {
                System.out.print("Burcunuz: Aslan");
            }else {
                System.out.print("Hatalı veri girdiniz.");
            }
        }
        if (ay.equals("Ağustos")){
            if (gun > 1 && gun < 23){
                System.out.print("Burcunuz: Aslan");
            } else if (gun < 31) {
                System.out.print("Burcunuz: Başak");
            }else {
                System.out.print("Hatalı veri girdiniz.");
            }
        }
        if (ay.equals("Eylül")){
            if (gun > 1 && gun < 23){
                System.out.print("Burcunuz: Başak");
            } else if (gun < 31) {
                System.out.print("Burcunuz: Terazi");
            }else {
                System.out.print("Hatalı veri girdiniz.");
            }
        }
        if (ay.equals("Ekim")){
            if (gun > 1 && gun < 23){
                System.out.print("Burcunuz: Terazi");
            } else if (gun < 31) {
                System.out.print("Burcunuz: Akrep");
            }else {
                System.out.print("Hatalı veri girdiniz.");
            }
        }
        if (ay.equals("Kasım")){
            if (gun > 1 && gun < 22){
                System.out.print("Burcunuz: Akrep");
            } else if (gun < 31) {
                System.out.print("Burcunuz: Yay");
            }else {
                System.out.print("Hatalı veri girdiniz.");
            }
        }
        if (ay.equals("Aralık")){
            if (gun > 1 && gun < 22){
                System.out.print("Burcunuz: Yay");
            } else if (gun < 31) {
                System.out.print("Burcunuz: Oğlak");
            }else {
                System.out.print("Hatalı veri girdiniz.");
            }
        }
    }
}
