package PaketDonguler;

public class While2 {
    public static void main(String[] args) {

        int sag=100, sol=200;
        while (++sag < --sol){ // işleme 100 den değil 101 den başlar.
            // Çünkü ++sag önce arttır sonra hesapla demek.Önce arttır sonra hesapla demek.
            // sag++ olsaydı 100 den başlayacaktı. Ekrana yazdırırken bir arrtırıp 101 yazacaktı.Önce hesapla sonra arttır demek.
            // sağı bir attırarak, solu bir azaltarak gider = tam ortadaki sayıyı bulmamızı sağlar.
            System.out.print(sag+",");
        }
        System.out.println();
        System.out.println();
        System.out.println(sol);
    }
}
