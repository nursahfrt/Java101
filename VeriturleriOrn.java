package PaketTemellerDegiskenler;

public class VeriturleriOrn {
    public static void main(String[] args) {
        int numberOne=10, numberTwo=20, numberThree, numberFour;
        int alan, cevre,topla;       //int etiketini kullanarak = Bu değerler bir integer sayıdır (değişkendir) dedik.
                                    //Öncelikle değişken türünü tanımlamalısın ve bunu bir defa tanımlaman yeterli.
        numberOne=5;              // numberOne değerini değiştirmek için yeni değeri yaz. int i 2. kez kullanmana gerek yok.Tanımladın zaten yukarıda.
                                 // Yeni bir değeri tanımlamak için veri türü bir defalık tanımlanır. (int)
        numberThree=50;
        alan=numberOne * numberTwo;
        cevre=2*( numberOne + numberTwo );
        topla = numberOne + numberTwo + numberThree;

        System.out.println(alan);
        System.out.println(cevre);
        System.out.println(topla);
    }
}
