package day08_nestedİfElse_ternary;

import java.util.Scanner;

public class C05_Ternary {
    public static void main(String[] args) {

        //Kullanıcıdan bir tamsayı alın
        //mutlak değerine çevirip yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tamsayı girinz");
        int sayı= scan.nextInt();

        if (sayı>=0){
            System.out.println(sayı);
        }else {
            sayı=sayı*(-1);
            System.out.println(sayı);
        }


        sayı=sayı>=0 ?sayı :sayı*(-1);
        System.out.println(sayı);
    }
}
