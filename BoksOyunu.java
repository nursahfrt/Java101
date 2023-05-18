package NesneYonelimliProgramlama;

public class BoksOyunu {
    public static void main(String[] args) {
        Boksor muhammed= new Boksor("Muhammed",10,100,100,30);
        Boksor ali = new Boksor("Ali",20,85,85,40);
        Mac mac = new Mac(muhammed,ali,85,100);
        mac.calistir();


    }





}
