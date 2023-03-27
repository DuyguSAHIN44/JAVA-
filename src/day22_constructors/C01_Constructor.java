package day22_constructors;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.List;

public class C01_Constructor {
    public static void main(String[] args) {
        /*
        Bir obje ancak bir classtan oluşturulabilir
        Bir objeyi oluşturduğumuz class aynı zamanda o objenin data türüdür.

        Her obje oluşturulduğu class ın özelliklerini taşır

        Eğer bir programda ortak özelliklere sahip
       objeler üretmek üzere tasarladığımız bir class varsa main method olması ŞART DEĞİLDİR
        O classlar kalıphane gibi çalışır. Yani o classlardan aynı özelliklere sahip
        objeler üretmemizi sağlar.

         */

        Scanner scan = new Scanner(System.in);

        List<String> isimler = new ArrayList<>();

        Random rnd = new Random();

        String str = new String("Duygu");

        C02_Hemşire hemşire1 = new C02_Hemşire();
        System.out.println(hemşire1.mesaiÜcretiHesapla(5));
        // 100

        String str2;
        Random rnd2;
        List<String> harfler;

    }
}
