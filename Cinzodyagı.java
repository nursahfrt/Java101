package PaketKosulluifadeler;
import java.util.Scanner;
public class Cinzodyagı {
    public static void main(String[] args) {
        Scanner zodyak = new Scanner(System.in);
        int dogumyil,hesap;

        System.out.print("Doğum Yılınız:");
        dogumyil=zodyak.nextInt();

        hesap=dogumyil%12;
        System.out.println("Zodyak değeri="+hesap);

        switch (hesap){
            case 0:
            System.out.print("Hayvan halkası = Maymun");
            break;
            case 1:
                System.out.print("Hayvan halkası = Horoz");
                break;
            case 2:
                System.out.print("Hayvan halkası = Köpek");
                break;
            case 3:
                System.out.print("Hayvan halkası = Domuz");
                break;
            case 4:
                System.out.print("Hayvan halkası = Fare");
                break;
            case 5:
                System.out.print("Hayvan halkası = Öküz");
                break;
            case 6:
                System.out.print("Hayvan halkası = Kaplan");
                break;
            case 7:
                System.out.print("Hayvan halkası = Tavşan");
                break;
            case 8:
                System.out.print("Hayvan halkası = Ejderha");
                break;
            case 9:
                System.out.print("Hayvan halkası = Yılan");
                break;
            case 10:
                System.out.print("Hayvan halkası = At");
                break;
            case 11:
                System.out.print("Hayvan halkası = Koyun");
                break;
            default:
                System.out.print("Hatalı değer girdiniz!");
        }
    }
}
