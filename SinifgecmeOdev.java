package PaketKosulluifadeler;
import java.util.Scanner;
public class SinifgecmeOdev {
    public static void main(String[] args) {
        Scanner sinif=new Scanner(System.in);
        double mat,fiz,kim,turk,muz,gecer=55, ort;

        System.out.print("Matematik not=");
        mat = sinif.nextDouble();
        System.out.print("Fizik not=");
        fiz = sinif.nextDouble();
        System.out.print("Kimya not=");
        kim = sinif.nextDouble();
        System.out.print("Türkçe not=");
        turk = sinif.nextDouble();
        System.out.print("Müzik not=");
        muz = sinif.nextDouble();

        if (0<=mat && mat<=100){
            System.out.println(mat);
        }else {
            mat=0;
            System.out.println(mat);
        }
        if (0<=fiz && fiz<=100){
            System.out.println(fiz);
        }else {
            fiz=0;
            System.out.println(fiz);
        }
        if (0<=kim && kim<=100){
            System.out.println(kim);
        }else {
            kim=0;
            System.out.println(kim);
        }
        if (0<=turk && turk<=100){
            System.out.println(turk);
        }else {
            turk=0;
            System.out.println(turk);
        }
        if (0<=muz && muz<=100){
            System.out.println(muz);
        }else {
            muz=0;
            System.out.println(muz);
        }
        ort=(mat+fiz+kim+turk+muz)/5;

        if (ort>=55){
            System.out.println("Sınıf geçme notunuz:"+ort);
        }else {
            System.out.println(ort+" ile Sınıfta kaldınız.");
        }




    }
}
