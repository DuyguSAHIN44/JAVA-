package day11_StringManipulations_ForLoop;

public class C01_isEmpty_isBlank {
    public static void main(String[] args) {

        String str = "Java candır";
        System.out.println(str.isEmpty()); // false---BOŞ MU
        System.out.println(str.isBlank()); // false --- BOŞLUKLARDAN MI OLUŞUYOR


        str="   ";

        System.out.println(str.isEmpty()); // false
        System.out.println(str.length()); // 3---3 tane space var

        System.out.println(str.isBlank()); // true--- BOŞLUKLARDAN OLUŞUYOR


        str="";

        System.out.println(str.isEmpty()); // true
        System.out.println(str.length()); // 0

        System.out.println(str.isBlank()); // true--- BOŞLUKTAN OLUŞUYOR



    }
}