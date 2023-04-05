package day03_scanner_dataCasting;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {
        /*
        Soru 5: Kullanıcıdan ismini,soyismini ve yaşını alıp
        aşağıdaki formatta yazdırın
        Girilen bilgiler:J Doe,44
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi, soyisminizi ve yaşınızı giriniz.\nHer bilgiden sonra enter a basınız");
        char isim= scan.nextLine().charAt(0);

        // Scanner methodlarında nextchar yoktur
        //Bundan dolayı önce next() veya nextLine() yazıp sonra chartAt(0) yazmalıyız

        String soyisim=scan.nextLine();
        double yaş=scan.nextDouble();

        System.out.println("Girilen bilgiler : " +isim+" "+soyisim +" , " +yaş);

        // " ":Boşluk bırakmaya yarar AYNI ZAMANDA " \t " de aynı işe yarar
    }
}
