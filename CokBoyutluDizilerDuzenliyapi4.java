package Diziler6;

public class CokBoyutluDizilerDuzenliyapi4 {
    public static void main(String[] args) {

        // cokBoyut[satır][sütun]

        int[][] satirSutun =new int[5][6];
        System.out.println(" Satır sayısını verir. =  "+satirSutun.length);
        System.out.println(" Sütun sayısını verir. =  "+satirSutun[0].length);

        System.out.println(" ========================================= ");

        int[][] cokBoyut = {
                {0,1,2,3,4},
                {5,6,7,8,9},
                {10,11,12,13,14}
        };

        System.out.println(" Satır sayısını verir. =  "+cokBoyut.length);
        System.out.println(" Sütun sayısını verir. =  "+cokBoyut[0].length);

        System.out.print(cokBoyut[0][0] + ", ");
        System.out.print(cokBoyut[0][1] + ", ");
        System.out.print(cokBoyut[0][2] + ", ");
        System.out.print(cokBoyut[0][3] + ", ");
        System.out.println(cokBoyut[0][4]);


        System.out.println(" ========================================= ");

        int[][] olustur= new int[3][4];

        int numara = 1;
        for (int satir=0; satir < olustur.length; satir++){
            for (int sutun=0; sutun < olustur[satir].length; sutun++){
                olustur[satir][sutun] = numara++;
                System.out.print(olustur[satir][sutun]+", ");
            }
            System.out.println(); // Satirin tamamlanmasının ardında bir alt satıra geç der.
        }

        System.out.println(" ========================================= ");
        numara =1;
        for (int satir = 0; satir < olustur.length; satir++){
            for (int sutun = 0; sutun < olustur[satir].length; sutun++){
                olustur[satir][sutun] = numara++;
            }
        }
        System.out.println(olustur[2][3]);

        System.out.println(" ========================================= ");




    }
}
