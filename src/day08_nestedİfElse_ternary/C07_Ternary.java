package day08_nestedİfElse_ternary;

import java.util.Scanner;

public class C07_Ternary {
    public static void main(String[] args) {

        //Soru 2: Kullanıcıdan bir üçgenin 3 kenar uzunluğunu alın,
        // üçgen eşkenar ise "Eşkenar üçgen" yazdırın
        // değilse "Eşkenar değil" yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen üç kenar uzunluğu girinz");
        int kenar1=12;
        int kenar2=12;
        int kenar3=12;

        System.out.println(kenar1==kenar3 && kenar1==kenar2 && kenar1>0
                ? "Eşkenar üçgen" :
                "Eşkenar değil");


    }
}
