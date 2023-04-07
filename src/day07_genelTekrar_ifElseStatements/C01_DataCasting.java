package day07_genelTekrar_ifElseStatements;

public class C01_DataCasting {
    public static void main(String[] args) {

        //Java da bazı data türleri asla başka data türlerineÇEVRİLEMEZ

      /*
         String str1=false;
        String str2=20;
        boolean bl='a';
        int sayı1="Merhaba";

       */

        // Özellikle sayısal data türündeki değerler,
        // başka sayısal data türündeki variable lara atanabilir

        double db1=23;
        short sh1=122;
        int sayı2=sh1;


        // daha dar data türündeki değeri, daha geniş data türündeki variable a atamaya
        // OUTOWIDENİNG denir ve java bunu OTOMATİK YAPAR

        sh1=(short) sayı2;
        sayı2=(int)db1;

        // daha geniş data türündeki değeri, daha dar data türündeki variable a atamaya
        // EXPLICIT NARROWİNG denir ve java bunu OTOMATİK YAPMAZ
        // BİZDEN ONAY İSTER

        sayı2='k';

        if (sayı2>'a'){

        }
        System.out.println('k'+1); // 108

        // Eğer bu işlemin char olarak değerini yazdırmak istersek
        //sayısal değerler char a cast edilebilir

        System.out.println((char) ('k'+1));// l


    }
}
