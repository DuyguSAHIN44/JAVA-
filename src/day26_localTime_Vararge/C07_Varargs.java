package day26_localTime_Vararge;

public class C07_Varargs {
    public static void main(String[] args) {

        /*
        Verilen 2 sayıyı toplayıp yazdıran bir method oluşturun
         */
        topla(3, 6);
        topla(3, 4,5);

    }

    public static void topla(int a, int b) {
        System.out.println(a + b);
    }

    public static void topla(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}