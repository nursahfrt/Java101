package BitirmeProjesi7;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class MineSweeper2 {
    private
    Scanner mineSweeper = new Scanner(System.in);
    private
    Random random = new Random();
    private
    int satir;
    private
    int sutun;
    private
    String[][] panel;
    private
    String[][] bombaliPanel;
    private
    int secSatir;
    private
    int secSutun;
    private
    int bombaSayisi;
    private
    boolean isbitis;
    private
    int tikli;




    private void oyunPaneli(String[][] panel){
        for(int i = 0 ; i< panel.length; i++){
            for( int j = 0 ; j< panel[i].length; j++){
                panel[i][j]="-";
            }
        }
    }
    private void yazdir(String[][] panel){
        System.out.println("==============");
        for(int i = 0; i< panel.length; i++){
            for(int j = 0 ; j< panel[i].length; j++){
                System.out.print(panel[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("==============");
    }
    private void bombaPaneli(String[][] bombaliPanel){
        oyunPaneli(bombaliPanel);
        bombaSayisi = (satir*sutun)/4;
        for (int i =0 ;i<bombaSayisi; i++){
            int rndSatir = random.nextInt(satir);
            int rndSutun = random.nextInt(sutun);
            if(bombaliPanel[rndSatir][rndSutun].equals("-")){
                bombaliPanel[rndSatir][rndSutun]="*";
            }
        }
    }
    private void bombaSayisi(String[][] bombaSayisi){
        int bombaSay=0;
        for (int i =secSatir-1; i <= secSatir+1;i++){
            for(int j = secSutun-1 ; j <= secSutun+1;j++){
                if(i>=0 && j>=0 && i<satir && j<sutun){
                    if (bombaSayisi[i][j]=="*"){
                        bombaSay++;
                        panel[secSatir][secSutun]=Integer.toString(bombaSay);
                    }else{
                        panel[secSatir][secSutun]=Integer.toString(bombaSay);
                    }
                }
            }
        }
    }
    public void baslangic(){    // Oyun tarlalarımı Oluşturdum.
        System.out.println("Bomba Oyununa Hoşgeldiniz...");

        boolean ishatali=true;
        while (ishatali) {
        System.out.print("Kaç satırdan oluşsun \t= ");
        satir = mineSweeper.nextInt();
        System.out.print("Kaç sütundan oluşsun \t= ");
        sutun = mineSweeper.nextInt();
            if (satir == 0 || sutun == 0) {
                System.out.println("Satir ve ya sutun \"0\" olamaz. \t ");
                ishatali=true;
            }else{
                ishatali=false;
            }
        }
        panel = new String[satir][sutun];
        oyunPaneli(panel);

        bombaliPanel = new String[satir][sutun];
        bombaPaneli(bombaliPanel);

        yazdir(panel);
        yazdir(bombaliPanel);
        basla();
    }

    private void basla(){
        isbitis=true;
        while (isbitis){
            System.out.print("Seçilen satir indeksi \t= ");
            secSatir = mineSweeper.nextInt();
            System.out.print("Seçilen sutun indeksi \t= ");
            secSutun = mineSweeper.nextInt();

            if (secSatir>=satir || secSutun>=sutun || secSatir<0 || secSutun<0) {
                System.out.println("Girilen sayı aralığı aşmaktadır. Kontrol ediniz...");
            }else{
                if(panel[secSatir][secSutun].equals("-") && bombaliPanel[secSatir][secSutun].equals("-")){
                    bombaSayisi(bombaliPanel);
                    yazdir(panel);

                }else if(bombaliPanel[secSatir][secSutun].equals("*")){
                    System.out.println("Kaybettiniz... ");
                    yazdir(bombaliPanel);
                    isbitis=false;
                    break;
                }else{
                    System.out.println("Daha önce seçtiniz...");
                }
            }
            kazanan();
        }

    }
    private void kazanan(){
        tikli=0;
        for(int i=0; i< panel.length;i++){
            for (int j =0; j< panel[i].length;j++){
                if (panel[i][j]=="-"){
                    tikli++;
                }
            }
        }
        if(tikli==bombaSayisi){
            System.out.println("Kazandınız...");
            yazdir(bombaliPanel);
            isbitis=false;
        }else{
            isbitis=true;
        }
    }
}
