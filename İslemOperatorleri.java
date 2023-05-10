package PaketTemellerDegiskenler;

public class İslemOperatorleri {
    public static void main(String[] args) {
        System.out.println("Atama Operatörleri (=)");
        int x=8, y=6;
        x = y;      //x = y demek. x==y denktir demektir sorgu operatorüdür. Karıştırma.
        y += x;     //y = y+x demek
        x -=y;      //x= x-y demek
        x *=y;      //x=x*y demek
        x /=y;      //x=x/y demek
        y %=y;      //y=(y/x nin mod değeri)

        System.out.println(x);
        System.out.println(y);

//-------------------------------------------

        System.out.println("Aritmetik (Matematiksel işlem) Operatörler");
        int a=10,b=5;
        int topla, cikar, carp, bol, mod, arttir,arttir1, azalt,azalt1;
        topla = a+b;
        cikar = a-b;
        carp  = a*b;
        bol   = a/b;
        mod   = a%b;
        arttir= ++a ; // bir arttır demek
        azalt = --b; // bir azalt demek.

        System.out.println(topla);
        System.out.println(cikar);
        System.out.println(carp);
        System.out.println(bol);
        System.out.println(mod);
        System.out.println(arttir);
        System.out.println(azalt);
//---------------------------------------------
        System.out.println("Karşılaştırma Operatörleri");
        int k=20, l=15;
        boolean sonuc, sonuc1, sonuc2, sonuc3, sonuc4, sonuc5;
//System.out.println(k==l); //Böyle yazarsan göster dersin. Bir değere atama yapmak için aşağıdaki gibi yaz.

        sonuc   = k==l; //denktir. k=l ise atama operatörüdür. K==l Sorgulama operatörüdür eşit demiyoruz denktir diyoruz..
        sonuc1  = k!=l; //denk değildir.
        sonuc2  = k>l;   // büyüktür.
        sonuc3  = k<l; //küçüktür.
        sonuc4  = k>=l; //büyük eşittir.
        sonuc5  = k<=l; //Küçük eşittir.

        System.out.println(sonuc);
        System.out.println(sonuc1);
        System.out.println(sonuc2);
        System.out.println(sonuc3);
        System.out.println(sonuc4);
        System.out.println(sonuc5);
//----------------------------------------------------------
System.out.println("Mantıksal Operatörler");
        boolean kosul, kosul1, kosul2,kosul3;

        //kosul =(k==l)&&(k!=l); //Böyle de yazılabilir.
        kosul =  sonuc&&sonuc1; //false ve(&&) true = false
        kosul1 = !(sonuc&&sonuc1); // değili(!)(false ve true) = değili(false) = true
        kosul2 = sonuc||sonuc1; //false veya(||) true = True
        kosul3 = !(sonuc||sonuc1); // değili(!)(false veya(||) true) = değili(true) = false

        String kosul4 = (k==l) ? "Doğru":"Yanlış" ; // eğer koşul doğruysa(?) Doğru yaz yaz, yanlışsa Yanlış yaz demek.
        String kosul5 = !(k==l) ? "Doğru":"Yanlış" ; // eğer koşul doğruysa(?) Doğru yaz yaz, yanlışsa Yanlış yaz demek.

        int kosul6 = (k==l) ? 1:0; // eğer koşul doğruysa(?) 1 yaz, yanlışsa 0 yaz demek.
        int kosul7 = !(k==l) ? 1:0; // eğer koşul doğruysa(?) 1 yaz, yanlışsa 0 yaz demek.

        System.out.println(kosul);
        System.out.println(kosul1);
        System.out.println(kosul2);
        System.out.println(kosul3);
        System.out.println(kosul4);
        System.out.println(kosul5);
        System.out.println(kosul6);
        System.out.println(kosul7);






    }
}
