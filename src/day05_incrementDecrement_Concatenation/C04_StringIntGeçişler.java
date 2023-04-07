package day05_incrementDecrement_Concatenation;

public class C04_StringIntGeçişler {
    public static void main(String[] args) {

        String st="423";

        // st yi int a çevirmek istersek
        int sayı=Integer.parseInt(st);
        System.out.println(sayı++); // 423
        System.out.println(sayı); // 424

        int a =20;
        int b=40;
        // bu iki sayıyı kullanarak 2040 yazdırın

        System.out.println(a+""+b);// 2040
        System.out.println(""+a+b); // 2040
        System.out.println(a+" "+b); // 20 40



    }
}
