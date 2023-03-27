package day26_localTime_Vararge;

import java.time.LocalDate;
import java.time.Period;

public class C06_PeriodTime {
    public static void main(String[] args) {

        LocalDate doğumTarihi=LocalDate.of(1990,10,17);
        LocalDate bugün=LocalDate.now();

        System.out.println(Period.between(doğumTarihi,bugün)); // P32Y4M20D



    }
}
