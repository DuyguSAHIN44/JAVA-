package day05_incrementDecrement_Concatenation;

public class C01_IncrementDecrement {
    public static void main(String[] args) {

        int a=20;

        /*
        a nın değerini 3 arttırın
        ve yeni değerini oluşturacağınız b variable ına atayın
         */

        // a=a+3;
        a+=3;

        //a++;
        //a++;
        //a++;

        int b=a;

        System.out.println("a nın değeri:"+a +", b nin değeri:"+b); // a nın değeri:23, b nin değeri:23

        a=20;

        // a nın değerini b ye atayın
        // sonra a nın değerini 3 arttırın

        b=a;
        a+=3;
        System.out.println("a nın değeri: "+a+ ", b nin değeri: "+b); // a nın değeri: 23, b nin değeri: 20

        // a nın değerini yazdırın ve sonra a yı 5 arttırın

        a=20;

        System.out.println("a nın değeri: " +a); // a nın değeri: 20
        a+=5;
        // burada a yı yazdırsak 25 yazar

        // a nın değerini 2 azaltın ve sonra a nın değerini yazdırın

        a-=2;
        System.out.println("a nın değeri: " +a); // a nın değeri: 23

    }
}
