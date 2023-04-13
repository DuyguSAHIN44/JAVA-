package day10_stringManipulation;

import java.util.Scanner;

public class C04_endsWith {
    public static void main(String[] args) {

        // SORU :Kullanıcıdan bir mail alın
        // -mail @ içermiyorsa "Geçersiz mail",
        // - mail @gmail.com içermiyorsa, "Mail gmail olmalı",
        // -mail @gmail.com ile bitmiyorsa "Mailde yazım hatası var" yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfem e mail adresinizi yazınız");
        String mail= scan.nextLine();

        if (!mail.contains("@")){
            System.out.println("Geçersiz mail");
        } else if (!mail.contains("@gmail.com")) {
            System.out.println("Mail gmail olmalı");
        } else if (!mail.endsWith("@gmail.com")) {
            System.out.println("Mailde yazım hatası var" );
        }
    }
}
