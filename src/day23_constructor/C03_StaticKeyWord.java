package day23_constructor;

public class C03_StaticKeyWord {
    static String hastaneİsmi="Yıldız Hastanessi";
    static String hastaneTelefonu="265655";
    static String başHekimİsmi="Kemal Al";

    String persİsmi;
    String perAdresi;
    String perTel;

    public static void main(String[] args) {

        C03_StaticKeyWord personel1=new C03_StaticKeyWord();

        System.out.println(personel1.persİsmi); //null
        System.out.println(hastaneİsmi); //Yıldız
        System.out.println(personel1.başHekimİsmi); // kemal

        C03_StaticKeyWord personel2=new C03_StaticKeyWord();
        personel2.persİsmi="Doğan";

        System.out.println(personel2.persİsmi); // Doğan
        System.out.println(personel1.persİsmi); // null

        personel2.başHekimİsmi="Gülten kadir";
        System.out.println(personel1.başHekimİsmi);



        /*
        1) Static variable lartüm class için geçerlidir (class variable)
        2)Statik variable lar tüm objeler için aynı değeri taşıdıkları için
        her able için ayrıca oluşturulmaz, sadece 1 variable olur.
        3)Statik variablelere ulaşmak veya update etmek için
        obje ismi kullanmaya gerek yoktur.Direkt ulaşılabilir.

        Başka class dan static variable e ulaşmak için
        classismi.staticvariableismi yazılır.
         */
    }
}
