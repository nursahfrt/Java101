package Diziler6;
import java.util.Arrays;
//Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.
//Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının yer değiştirmesi demektir.
// Bu işlem sonucu elde edilen matris, başlangıçtaki matrisin transpozudur (devriğidir).
// Bu aşamada kxn’lik bir matrisin transpozu (devriği) nxk’lik bir matris olur.
// Örneğin bir A matrisimiz olsun.
// Bu A matrisinin transpozu (devriği), A^T (A üzeri T) ile gösterilir.

//Örneğin aşağıdaki 2x3’lik A matrisinin transpozu (devriği), 2x3’lük bir A^T matrisidir.

//Senaryo

//Matris :
//2    3    4
//5    6    4
//Transpoze :
//2    5
//3    6
//4    4

//Matris :
//1    2    3
//4    5    6
//Transpoze :
//1    4
//2    5
//3    6
public class MatrisTranspozuOdev {
    public static void main(String[] args) {
        int[][] matris = {
                {1,2,3},
                {4,5,6}
        };

        int[][] matrisT= new int[matris[0].length][matris.length];
       // System.out.println(matrisT.length);
       // System.out.println(matrisT[0].length);

        for (int i=0 ; i< matris[0].length;i++){
           for( int j=0; j<matris.length;j++){
               matrisT[i][j]=matris[j][i];
               System.out.print(matrisT[i][j] + " ");
           }
            System.out.println();
        }

    }

}
