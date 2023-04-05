package day04_dataCasting_wrapperClasses;

public class C01_AsciiTable {
    public static void main(String[] args) {

        /*
        24==>11000
        a===>97===>10100010
         */

        // char data türündeki variable ve değerler
        // sayısal data türlerine atanırsa veya
        // sayısal data türündeki datalarla işleme sokulursa
        // ASCII table deki değerleri ile işleme girer.

        System.out.println(5+'a'); // 102--- 5+97=102 ( a nın ASCII deki değeri)

        char ilkHarf=101;
        System.out.println(ilkHarf); // e


        // Kullanıcının verdiği harften bir sonraki harfi yazdırın

        char girilenChar='f';
        System.out.println(girilenChar+1); // 103
        //biz 103 ü değil, 103 ün karşılığı olan char ifadeyi yazdırmak istersek
        //explicit casting yaparız

        System.out.println("Girilen harfin bir sonrası: " +(char) (girilenChar+1)); // g

        //verilen bir harften 2 önveki harfi yazdırın

        System.out.println("Girilen harften iki önceki harf: "+(char)(girilenChar-2)); // Girilen harften iki önceki harf: d
    }
}
