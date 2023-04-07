package day06_bağımsızİfCümleleri;

import java.util.Scanner;

public class C05__İfElseStatement {

    public static void main(String[] args) {

        /*
        Eğer bir olay için sadece 2 olasılık varsa
        ve bu olasılıklardan birisi mutlaka çalışacaksa
        İf Else Statement kullanırız

        İf Else Statement de if body si
        veya else body si MUTLAKA ÇALIŞIR

        İkisinin birden çalışma ihtimali YOKTUR
        İkisinin de çalışmama ihtimali YOKTUR  ----EĞER HAVA GÜZEL OLURSA GEZMEYE GİDERİZ, GÜZEL OLMAZSA EVDE OTURURUZ


        1 ŞART ( BUNUN TRUE VEYA FALSE OLMASINA GÖRE) 2 AYRI SONUÇ
         */

        // SORU 5: Kullanıcıdan notunu alın
        // 50 veya daha büyükse "Sınıfı geçtin",
        // 50 den küçükse "Maalesef kaldın" yazdırın


       Scanner scan=new Scanner(System.in);
       System.out.println("Lütfen notunuzu giriniz");
       double girilenNot= scan.nextDouble();


      if (girilenNot>=50){
        System.out.println("Sınıfı geçtin");
     }else {
        System.out.println("Maalesef kaldın");
     }


        // Kullanıcıdan pozitif bir tamsayı alın
        //sayının tek sayı veya çift sayı olduğunu yazdırın
;
        System.out.println("Lütfen pozitif bir tamsayı giriniz");
        int girilenSayı= scan.nextInt();

        if (girilenSayı % 2 ==0){
            System.out.println("Girilen sayı çift sayıdır");
        }else {
            System.out.println("Girilen sayı tek sayıdır");
        }


        // Kullanıcıdan pozitif bir tamsayı alın
        // 5 ile bölünüp bölünmediğini yazdırın

        System.out.println("Lütfen pozitif bir tamsayı giriniz");
        int sayı= scan.nextInt();

        if (sayı % 5 == 0){
            System.out.println("Girilen sayı 5 in tam katı");
        }else {
            System.out.println("Girilen sayı 5 in tam katı değil");
        }


    }
}
