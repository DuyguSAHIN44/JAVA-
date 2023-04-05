package day03_scanner_dataCasting;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
        /*
        Soru3:Kullanıcıdan ismini,
        soyismini ve yaşını alıp aşağıdaki formatta yazdırın
        İsminiz:John
        Soyisminiz:Doe
        Yaşınız:44
        Kaydınız başarıyla tamamlanmıştır
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isim=scan.nextLine();
        System.out.println("Lütfen soyisminizi giriniz");
        String soyisim=scan.nextLine();
        System.out.println("Lütfen yaşınızı giriniz");
        double yaş= scan.nextDouble();

        System.out.println("İsminiz : "+isim+"\n Soyisminiz : "+soyisim+ "\nYaşınız : "+yaş);
        System.out.println("Kaydınız başarıyla tamamlanmıştır");

        // System.out.println BURADAKİ ''ln '' alt satıra geçmeyi sağlar
        // sadece PRINT yazarsak yan tana yazar

        // System.out.println sadece bir taneyle birden fazla satır yazdırmak istersek
        //  "\n " ile yapmamız gerekir
    }
}
