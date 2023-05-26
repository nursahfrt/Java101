package Diziler6;

public class RandomUretDizi8 {
    public static void main(String[] args) {

        int[][] uret = new int[3][4];
        for (int satir = 0; satir < uret.length ; satir++){
            for(int sutun = 0; sutun < uret[satir].length; sutun++){
                uret[satir][sutun]=(int) (Math.random()*100);
                System.out.print(uret[satir][sutun] + ", ");
            }
            System.out.println();
        }
    }
}
