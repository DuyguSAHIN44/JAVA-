package day05_incrementDecrement_Concatenation;

public class C02_Preincrement_Postincrement {
    public static void main(String[] args) {

        /*
        Eğer sayının değeri SADECE 1 artacak veya azalacaksa

        arttırıp sonra yazdırma/atama
        yazdırıp sonra arttırma/atama

        işlemlerini tek satırda yapabiliriz
         */

         /*
        a nın değerini 1 arttırın
        ve yeni değerini oluşturacağınız b variable ına atayın
         */
        int a=20;

        int b= ++a;// ÖNCE a nını değerini ARTTIRDI ,SONRA ATADI
        /*a++;
        int b=a;

         */
        System.out.println("a nın değeri:"+a +", b nin değeri:"+b); // a nın değeri:21, b nin değeri:21

        // a nın değerini b ye atayın
        // sonra a nın değerini 1 arttırın

        a=20;
        b=a++;// ÖNCE a yı b ye ATADI, SONRA a yı ARTTIRDI

      /* b=a;
        a++;

       */
        System.out.println("a nın değeri:"+a +", b nin değeri:"+b); // a nın değeri:21, b nin değeri:22

        /*
        Bu işlemleri istersek daha kısa şekilde yapabiliriz
         */


        // a nın değerini yazdırın ve sonra a yı 1 arttırın
        a=20;
        System.out.println("a nın değeri: " +a);// a:20
        a++;
        System.out.println("-------------------------");

        a=20;
        System.out.println("a nın değeri: " +a++); //  20
        System.out.println("Bir sonraki satırda a nın değeri: "+a);// 21

        // a nın değerini 1 azaltın sonra a nın değerini yazdırın

        System.out.println(--a);
        System.out.println("Bir sonraki satırda a nın değeri: "+a); // 20

    }
}
