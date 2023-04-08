package day07_genelTekrar_ifElseStatements;

import java.util.Scanner;

public class C06_İfElseİf {
    public static void main(String[] args) {

        /*
        SORU 2: Kullanıcıdan kilo(kg) ve boyunu(cm) isteyin
        vucüt kitle indeksini hesaplayın (kilo*10000 / (boy*boy))
        vucüt kitle indeksi 30 dan büyüksa obez,
        25-30 arası ise kilolu,
        20-25 arası ise normal,
        20 den küçükse zayıf yazdırın
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz");
        double kilo = scan.nextDouble();
        System.out.println("Lütfen boyunuzu giriniz");
        double boy = scan.nextDouble();

       double kitleİndeksi= (kilo*10000 / (boy*boy));

        if (kilo<=0 || boy<=0|| boy>300|| kilo>500) {
            System.out.println("Yanlış giriş yaptınız tekrar deneyin");

        } else if (kitleİndeksi <20 ) {
            System.out.println("Zayıfsınız");

        } else if (kitleİndeksi <25  ) {
            System.out.println("Normal kilodasınız");

        } else if (kitleİndeksi < 30) {
            System.out.println("Kilolusunuz");
        }else {
            System.out.println("Obezsiniz");
        }
        System.out.println("Vucüt kitle indeksiniz: "+kitleİndeksi);
    }
}