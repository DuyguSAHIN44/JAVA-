package day26_localTime_Vararge;

import java.util.Arrays;

public class C08_Varargs {
    public static void main(String[] args) {

        topla(4,5); // [4, 5]
        topla(1,2,3,4); // [1, 2, 3, 4]

    }

    public static void topla(int... a ) {
        System.out.println(Arrays.toString(a));
    }
    /*
    Java da bir method parametrelerine uygun argümente sahip
    method kol old çalışır
    örneğin; 2 int parametre varsa
    sadece 2 int argüment ile method call yapıldığında çalışır

    Java aynı data türüne sahip olmak şartıyla
    parametre sayısını

    Varargs bir Array dir.

    Dolayısıyla metthod da array elementlerini
     */
}