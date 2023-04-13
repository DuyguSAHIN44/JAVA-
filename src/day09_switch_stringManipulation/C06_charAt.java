package day09_switch_stringManipulation;

public class C06_charAt {
    public static void main(String[] args) {

        String str="Java Candır";

        System.out.println(str.charAt(0)); // J


        // Baştan 6. harfi yazdırın

        System.out.println(str.charAt(5)); // C

        // Sondan 2. harfi yazdırın

        System.out.println(str.charAt(11-2)); // ı

        // son harfi yazdırın

        System.out.println(str.charAt(11-1)); // r

        //System.out.println(str.charAt(11)); // StringIndexOutOfBoundsException--SATIR DIŞI
        System.out.println(str.charAt(15)); // StringIndexOutOfBoundsException--SATIR DIŞI

        /*
        Java da 2 türlü hata ile karşılaşabiliriz:

        1) Syntax olarak hatalı yazılan kodları Java compile ederken anlar ve altını kırmızı çizer
        str=23; String bir variable ye int bir değer atanamayacağını bilir
        ve altını kırmızı ile çizer
        CompileTimeError (CTE) denir

        2) Bazen de syntax da hata olmaz
        Java sorunu çalışmaya başladıktan sonra fark eder
        str.charAt(15)  buradaverilen str dan bir karakter isteniyor
        Compile time da str nin uzunluğunu Java anlamaz
        ama çalışınca 15.index in olmadığını fark eder ve exception fırlatır
        RunTimeError (RTE) denir

         */


    }
}
