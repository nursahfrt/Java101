package BitirmeProjesi7;
import java.util.Scanner;
import java.util.Random;
//private = sadece ait olduğu sınıftan doğrudan erişilebilir olduğunu ve
//          o sınıfın dışındaki kod parçacıklarından doğrudan erişilemeyeceğini tanımlar.
//public =  sadece olduğu sınıf için değil, diğer sınıflar tarafından doğrudan erişilebilir olmasını sağlar.
//static =  Eğer sınıa ait metotlardan bir yada birden fazlasının önüne "static" deyimi yazılırsa,
//          o metotlar sınıf metodu olurlar.
//          Sınıf metotlarının en önemli özelliği, ilgili sınıfa ait nesne oluşturmadan sınıf metodu çağırılabilir.
public class MayinTarlasiOyunu1 {
    private Scanner mayinOynu = new Scanner(System.in);
        private Random bomba= new Random();
        private int satirUzunluk ;
        private int sutunUzunluk;
        private String[][] satirSutun ;
        private String[][] mayinUret ;
        private int bombaSayisi;

        public void baslangic() {

            System.out.println("Mayın tarlası Oynuna hoşgeldiniz... ");
            System.out.print("Satır uzunluğu = ");
            satirUzunluk = mayinOynu.nextInt();
            System.out.print("Sütun uzunluğu =");
            sutunUzunluk = mayinOynu.nextInt();

            satirSutun = new String[satirUzunluk][sutunUzunluk];
            mayinUret = new String[satirUzunluk][sutunUzunluk];

            for (int satir = 0; satir < satirSutun.length; satir++) {
                for (int sutun = 0; sutun < satirSutun[satir].length; sutun++) {

                    satirSutun[satir][sutun] = "-";
                    mayinUret[satir][sutun] = "-";
                }
            }
            bombaSayisi = (satirUzunluk * sutunUzunluk / 4);

            while (bombaSayisi > 0) {
                int satir = bomba.nextInt(satirUzunluk);
                int sutun = bomba.nextInt(sutunUzunluk);
                if (mayinUret[satir][sutun].equals("-")) {

                    mayinUret[satir][sutun] = "*";
                    bombaSayisi--;
                }
            }
            BombaliMatrisYazdir();
            MatrisYazdir();
            akis();
        }

        private void akis() {
            boolean isbitis = false;

            while (!isbitis) {
                System.out.print("Satır giriniz = ");
                int secilenSatir = mayinOynu.nextInt();
                System.out.print("Sütun giriniz = ");
                int secilenSutun = mayinOynu.nextInt();
                int numara = 0;

                if (secilenSatir < satirUzunluk && secilenSutun < sutunUzunluk) {
                    if (mayinUret[secilenSatir][secilenSutun].equals("-") && satirSutun[secilenSatir][secilenSutun].equals("-")) {
                        for (int i = secilenSatir - 1; i < secilenSatir + 2; i++) {
                            for (int j = secilenSutun - 1; j < secilenSutun + 2; j++) {
                                if (i >= 0 && j >= 0 && i < satirUzunluk && j < sutunUzunluk && mayinUret[i][j].equals("*")) {
                                    numara++;
                                    satirSutun[secilenSatir][secilenSutun] = Integer.toString(numara);
                                } else {
                                    satirSutun[secilenSatir][secilenSutun] = Integer.toString(numara);
                                }
                            }
                        }
                        MatrisYazdir();
                        if (!kazananKontrol()){
                            System.out.println("kazandınız...");
                            BombaliMatrisYazdir();
                            isbitis=true;
                        }
                    } else {
                        System.out.println("kaybettiniz...");
                        BombaliMatrisYazdir();
                        isbitis=true;
                    }
                } else {
                    System.out.println("Lütfen alan dışından seçim yapmayınız.\n Hatalı seçim.");
                }
            }
        }
    private void MatrisYazdir(){
        for(int satir=0 ; satir<satirSutun.length;satir++){
            for(int sutun = 0; sutun<satirSutun[satir].length;sutun++ ){

                System.out.print(satirSutun[satir][sutun] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
    }
    private void BombaliMatrisYazdir(){
        System.out.println("---------------------------");

        for(int satir=0 ; satir<mayinUret.length;satir++){
            for(int sutun = 0; sutun<mayinUret[satir].length;sutun++ ){
                System.out.print(mayinUret[satir][sutun]+ " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------");

    }
    private boolean kazananKontrol() {
        int sayac = 0;
        int mayinNo = 0;
        for (int i = 0; i < satirSutun.length; i++) {
            for (int j = 0; j < satirSutun[i].length; j++) {

                if (satirSutun[i][j].equals("-")) {
                    sayac++;
                    System.out.println(sayac);
                }
                if (mayinUret[i][j].equals("*")) {
                    mayinNo++;
                    System.out.println(mayinNo);
                }
            }
        }
        if (mayinNo == sayac) {
            return false;
        }
        return true;
    }













}
