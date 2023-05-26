package Diziler6;

public class Multiple5 {

    public double[][] multiplyMatrices(double[][] firstMatrix, double[][] secondMatrix) {

        // firstMatrix.length ile ilk matrisin satır sayısını buluyoruz. örneğimizde 3 olarak gelecektir.
        // secondMatrix[0].length ile ikinci matrisin sütun sayısını buluyoruz. örneğimizde 4 olarak gelecektir.

        // C matrisi olacak olan matrisi tanımlıyoruz.
        double[][] result = new double[firstMatrix.length][secondMatrix[0].length];

        // matrislerde çarpma, toplama gibi işlemleri yapabilmek için iç içe 3 tane döngüye ihtiyaç duyarız.
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[row].length; col++) {
                result[row][col] = multiplyMatricesCell(firstMatrix, secondMatrix, row, col);
            }
        }
        return result;
    }


    double multiplyMatricesCell(double[][] firstMatrix, double[][] secondMatrix, int row, int col) {
        // A matrisinin satırı ile B matrisinin sütunu çarpma işlemi.
        /*
         *   row = 3, col = 4  olarak gelecektir.
         *   i = 0 ise
         *   firstMatrix[3][0] * secondMatrix[0][4]
         *   i = 1 ise
         *   firstMatrix[3][1] * secondMatrix[1][4]
         *   i = 2 ise
         *   firstMatrix[3][2] * secondMatrix[2][4]
         * şeklinde i değişerek satır ve sütun çarpılır.
         */
        double cell = 0;
        for (int i = 0; i < secondMatrix.length; i++) {
            cell += firstMatrix[row][i] * secondMatrix[i][col];
        }
        return cell;
    }




}
