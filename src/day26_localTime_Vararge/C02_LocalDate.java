package day26_localTime_Vararge;

import java.time.LocalDate;

public class C02_LocalDate {
    public static void main(String[] args) {
        LocalDate tarih=LocalDate.now();
        System.out.println(tarih);//2023-03-09

        System.out.println(tarih.isLeapYear()); // false
        // artık yıl mı

        LocalDate tarih2=LocalDate.of(2222,10,10);
        System.out.println(tarih2.isLeapYear()); // false

        System.out.println(tarih.plusWeeks(20).plusDays(2)); // 2023-08-09
        // topluyoruz

        System.out.println(tarih.minusMonths(3).minusDays(3));
        // çıkarıyoruz

        System.out.println(tarih.getDayOfYear());//79
        // bu gun yılın 79. günü

        System.out.println(tarih.getMonth()); // MARCH
        // Hangi ayda olduğumuzu verir

        System.out.println(tarih.getMonthValue()); // 3
        // kaçıncı ay old yazıyor

        LocalDate tarih3=LocalDate.of(1990,10,17);
        System.out.println(tarih3.getDayOfWeek()); // WEDNESDAY

        System.out.println(tarih.isBefore(tarih3));// false
      }
}
