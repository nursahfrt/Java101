package PaketDonguler;
import java.util.Scanner;
public class KombinasyonOdev {
    public static void main(String[] args) {
        Scanner kombi = new Scanner(System.in);

        int n,r,c,x,ntotal,y,rtotal,z,nrtotal;

        System.out.println("C(n,r) için sayiları giriniz.");
        System.out.print("n:");
        n=kombi.nextInt();
        System.out.print("r:");
        r=kombi.nextInt();
        ntotal =1;
        for (x=1;x<=n;x++){
            ntotal=ntotal*x;
        }//System.out.println(ntotal);

        rtotal=1;
        for (y=1;y<=r;y++){
            rtotal=rtotal*y;
        }//System.out.println(rtotal);

        nrtotal=1;
        for (z=1;z<=(n-r);z++){
            nrtotal=nrtotal*z;
        }//System.out.println(nrtotal);

        c=ntotal/(rtotal*nrtotal);
        System.out.println("C(n,r)="+c);




    }
}
