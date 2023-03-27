package day26_localTime_Vararge;

import java.time.LocalDate;
import java.util.Scanner;

public class C03_KimBüyük {
    public static void main(String[] args) {

        /*
        Kullanıcıdan 2 farklı kişinin isim ve doğum tarihinin gün,ay ve yılını alıp
        hangi tarihte doğan kişinin daha büyük old yaz
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("İlk kişinin ismini giriniz");
        String isim1=scan.nextLine();

        System.out.println("İkinci kişinin ismini giriniz");
        String isim2=scan.nextLine();

        System.out.println(" İlk kişinin doğum tarihini gün,ay, yıl olarak girin");
        int gün=scan.nextInt();
        int ay= scan.nextInt();
        int yıl= scan.nextInt();

        LocalDate tarih1=LocalDate.of(yıl,ay,gün);

        System.out.println(" İkinci kişinin doğum tarihini gün,ay, yıl olarak girin");
        gün=scan.nextInt();
        ay= scan.nextInt();
        yıl= scan.nextInt();

        LocalDate tarih2=LocalDate.of(yıl,ay,gün);

        System.out.println(tarih2.isAfter(tarih1)  ?
                           "Büyük olan : " + isim1 :
                            "Büyük olan : " + isim2 );

    }
}
