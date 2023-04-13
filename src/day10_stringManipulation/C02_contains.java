package day10_stringManipulation;

public class C02_contains {
    public static void main(String[] args) {

         String str="Java öğren, işi kap";

        System.out.println(str.contains("Java")); // true

        String s="ka";
        System.out.println(str.contains(s)); // true
        System.out.println(str.contains("a")); // true
        System.out.println(str.contains(" ")); // true
        System.out.println(str.contains(""));// true
        System.out.println(str.contains("java")); // false---KÜÇÜK BÜYÜK HARF ÖNEMLİ


    }
}
