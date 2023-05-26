package Diziler6;

public class ToplaDizi7 {
    public static void main(String[] args) {

                int[][] arr = new int[3][];
                arr[0] = new int[1];    // { a }
                arr[1] = new int[2];    // { b, c }
                arr[2] = new int[3];    // { d, e, f }

                int sum = 0;

                for (int i = 0; i< 3; ++i){             //i=0           i=1                       i=2
                    for (int j = 0; j < i + 1; ++j){    //j=0 (j<1)     j=0 j=1 (j<2)             j=0 j=1 j=2 (j<3)
                        arr[i][j] = j + 1;              //arr[0][0]=1   arr[1][0]=1 arr[1][1]=2   arr[2][0]=1 arr[2][1]=2 arr[2][2]=3
                        System.out.print(arr[i][j]+ ", ");
                    }
                    System.out.println();
                }

                System.out.println("====================================");

                for (int i = 0; i < 3; ++i){
                    for (int j = 0; j < i + 1; ++j) {
                        sum += arr[i][j];
                        System.out.print(sum+ ", ");
                    }
                    System.out.println();
                }

        System.out.println("====================================");

                System.out.print(sum);
    }
}

