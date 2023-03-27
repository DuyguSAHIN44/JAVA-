package day26_localTime_Vararge;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DateTimeFormatter {
    public static void main(String[] args) {

        /*
        Java tarih ve zamanı kendi formatında oluşturur.
        Ancak bizim istediğimiz formata uygun olarak çeirmemize
         veya yazdırmamıza izin verir.

         */

        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);


        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("d / MMM / yyyy");

        System.out.println(ldt.format(dtf)); // 9 / Mar / 2023

        DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("EEEE hh: mm a");
        System.out.println(ldt.format(dtf4)); // Perşembe 10: 18 ÖS öğlenden sonra







    }
}
