package day38_exceptions_Finalize;

public class C01_ThrowKeyWord {
    public static void main(String[] args) {

        // sayı 0 dan küçükse şartlı satırlar çalışmasın

        int sayı=10;

        try {
            if (sayı<0){
                throw new IllegalArgumentException("Sayı negatif olmamalı");
            }
            System.out.println("Şartlı çalışacak satır 1");
            System.out.println("Şartlı çalışacak satır 2");
            System.out.println("Şartlı çalışacak satır 3");
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        System.out.println("Yola devam");
    }
}
