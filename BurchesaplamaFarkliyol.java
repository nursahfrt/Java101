package PaketKosulluifadeler;
import java.util.Scanner;
public class BurchesaplamaFarkliyol {
    public static void main(String[] args) {
        Scanner burc = new Scanner(System.in);

        String neymis = "";
        int ay, gun;
        Boolean Ishata = false;
        // Is.... yazarsan başına = true ya da false döndürcek demek. Başlangıçta hata yok dedik.

        System.out.print("Ayın kaçıda doğdunuz? :");
        gun = burc.nextInt();
        System.out.print("Kaçıncı ayda doğdunuz? :");
        ay = burc.nextInt();

        switch (ay) {
            case 1:
                if (gun > 1 && gun < 22) {
                    neymis = "Oğlak"; // bu şekilde de yapabilirsin
                } else if (gun < 31) {
                    neymis = "Kova";  // bu şekilde de yapabilirsin
                } else {
                    Ishata = true;  // bu şekilde de yapabilirsin
                }
                break;
            case 2:
                if (gun > 1 && gun < 20) {
                    neymis = "Kova";
                } else if (gun < 30) {
                    neymis = "Balık";
                } else {
                    Ishata = true;
                }
                break;
            case 3:
                    if (gun > 1 && gun < 21) {
                        neymis = "Balık";
                    } else if (gun < 31) {
                        neymis = "Koç";
                    } else {
                        Ishata = true;
                    }
                    break;
            case 4:
                    if (gun > 1 && gun < 21) {
                        neymis = "Koç";
                    } else if (gun < 31) {
                        neymis = "Boğa";
                    } else {
                        Ishata = true;
                    }
                    break;
            case 5:
                    if (gun > 1 && gun < 22) {
                        neymis = "Boğa";
                    } else if (gun < 31) {
                        neymis = "İkizler";
                    } else {
                        Ishata = true;
                    }
                    break;
            case 6:
                    if (gun > 1 && gun < 23) {
                        neymis = "İkizler";
                    } else if (gun < 31) {
                        neymis = "Yengeç";
                    } else {
                        Ishata = true;
                    }
                    break;

            case 7:
                    if (gun > 1 && gun < 23) {
                        neymis = "Yengeç";
                    } else if (gun < 31) {
                        neymis = "Aslan";
                    } else {
                        Ishata = true;
                    }
                    break;
            case 8:
                    if (gun > 1 && gun < 23) {
                        neymis = "Aslan";
                    } else if (gun < 31) {
                        neymis = "Başak";
                    } else {
                        Ishata = true;
                    }
                    break;
            case 9:
                    if (gun > 1 && gun < 23) {
                        neymis = "Başak";
                    } else if (gun < 31) {
                        neymis = "Terazi";
                    } else {
                        Ishata = true;
                    }
                    break;
            case 10:
                    if (gun > 1 && gun < 23) {
                        neymis = "Terazi";
                    } else if (gun < 31) {
                        neymis = "Akrep";
                    } else {
                        Ishata = true;
                    }
                    break;

            case 11:
                    if (gun > 1 && gun < 22) {
                        neymis = "Akrep";
                    } else if (gun < 31) {
                        neymis = "Yay";
                    } else {
                        Ishata = true;
                    }
                    break;
            case 12:
                    if (gun > 1 && gun < 22) {
                        neymis = "Yay";
                    } else if (gun < 31) {
                        neymis = "Oğlak";
                    } else {
                        Ishata = true;
                    }
                    break;
            default:
                Ishata =true;
        }

                if (Ishata) {
                    System.out.println("Hatalı değer girdiniz.");
                } else {
                    System.out.println("Burcunuz:" + neymis);
                }

    }
}

