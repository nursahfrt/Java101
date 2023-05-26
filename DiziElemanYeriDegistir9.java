package Diziler6;

public class DiziElemanYeriDegistir9 {
    public static void main(String[] args) {

        int[][] array = {
                {1, 2},
                {3, 4},
                {5, 6}
        };
        for (int i = array.length - 1; i >= 0; i--) {          //i=2              i=1               i=0
            for (int j = array[i].length - 1; j >= 0; j--) {   //j=1 j=0          j=1 j=0           j=1 j=0
                System.out.print(array[i][j] + " ");           //array[2][1] = 6  array[1][1] = 4   array[0][1] = 2
            }                                                  //array[2][0] = 5  array[1][0] = 3   array[0][0] = 1
            System.out.println();
        }
    }

}
