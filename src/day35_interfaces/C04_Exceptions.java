package day35_interfaces;

import java.util.Scanner;

public class C04_Exceptions {
    public static void main(String[] args) {
        int sayı1 = 20;
        int sayı2 = 0;

        System.out.println(sayı1 / sayı2); // aritmetik xceptions oluştu

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı giriniz");
        int sayı3 = 0;//InputMismatchException

        if (sayı3==0){
            System.out.println("Sıfır giremezsiniz");
        }else {
            System.out.println(sayı1/sayı3); //
            // 0 girip girmemesini kontrol edbiliyorum
            // Ama String girerse bunu kontrol edemem
            // Yani bu durumu if else ile çözemem
        }



        System.out.println(sayı1/sayı2);// exception verir




    }
}



