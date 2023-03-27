package day26_localTime_Vararge;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class C04_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt); // 2023-03-09T21:54:15.214322300

        System.out.println(ldt.toLocalDate()); // 2023-03-09


    }
}
