package day26_localTime_Vararge;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {

        LocalTime saat1=LocalTime.of(20,15);
        System.out.println(saat1);//20:15

        LocalTime saat = LocalTime.now();
        System.out.println(saat);

        //LocalTime objesi olan saat variable i canlı
       // bir saat değeildir
        // Oluşturulduğu andaki local time i sistemden alıp
       // kaydettiğimiz sabit bir değerdir
        //Kodun ilerleyen saatlerinde ne kadr süre geçtiğini
        // görmek için ssati yeniden almak gerekirse
        // yeni bir LocalTime daha oluşturmalıyız

        System.out.println(saat.getHour()); // 18
        // get methodları local time objesinin saat, dakika, saniye ve nano değerlerini getirir

        System.out.println(saat.plusHours(2).plusMinutes(10));
        // Şuandaki saate 2 saat 10 dakika ekledik

        System.out.println(saat.minusMinutes(10).minusSeconds(10));
        // Şuandaki saatten 10 dakika, 10 saniye çıkardık

        System.out.println(saat.withSecond(0).withNano(0));//13.15
        // saniye ve nano yu 0 yaptı

        System.out.println(saat.compareTo(saat1)); // aynı ise 0 döner.

        System.out.println(saat.isAfter(saat1)); // true
        System.out.println(saat.isBefore(saat1));//
        // false

        System.out.println(saat.toSecondOfDay()); // 76321
    }
}
