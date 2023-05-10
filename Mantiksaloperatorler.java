package PaketKosulluifadeler;

public class Mantiksaloperatorler {
    public static void main(String[] args) {
    int x=5,y=10,z=15;

       x= (x<y)&&(y>z) ? x+y: z-y;     // && (ve)
        System.out.println("x="+ x);
       y= (x<y)||(y>z)? x+y:x-y;     // || (veya)
        System.out.println("y="+y);
       x= !(x<y)&&!(y>z) ? x+y:z-y;  // ! (Değili)
        System.out.println("yeni x="+x);
        y= !(x<y)||!(y>z) ? x+y:x-y ;  // ? (if-else gibidir. koşul sağlanıyorsa bunu sağlanmıyorsa şunu yaz diyoruz.)
        System.out.println("yeni y="+ y);

        boolean kosul1,kosul2;
    kosul1=(x==y);
    kosul2= (y<z);

    System.out.println("x="+x);
    System.out.println("y="+y);
        System.out.println(kosul1 && kosul2);   // && (ve)
        System.out.println(kosul1 || kosul2);   // || (veya)
        System.out.println(!(kosul1));          // ! (Değili)
        System.out.println(x>y ? x : y);        // ? (if-else gibidir. koşul sağlanıyorsa bunu sağlanmıyorsa şunu yaz diyoruz.)


}
}
