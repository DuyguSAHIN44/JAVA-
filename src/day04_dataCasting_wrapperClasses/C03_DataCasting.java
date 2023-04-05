package day04_dataCasting_wrapperClasses;

public class C03_DataCasting {
    public static void main(String[] args) {

        int a=20;
        int b=6;
        System.out.println(a/b); // 3 --- int tamsayı verir.


        double c=6;
        System.out.println(a/c); // 3.3333333333333335 ---double ondalık kesir de verir

        float d=6f;
        System.out.println(a/d); // 3.3333333


        // a/b işleminin sonucunu ondalık olarak nasıl yazdırabiliriz
        System.out.println((double) (a/b)); // 3.0

        // İşlem önceliği a/b dedir bundan dolayı ilk önce burayı yapar sonra double atar bundan dolayı tamsayı olur sonuç
        // bölme işleminin sonucunun double olması için işleme girenlerden biri double olmalıdır

        System.out.println(a/(double)b); // 3.3333333333333335

        int e=1467;
        System.out.println(e=e/10); // 146
        System.out.println(e); // 146

        e=e/10;
        System.out.println(e); // 14

        e=e/10;
        System.out.println(e); // 1

        e=e/10;
        System.out.println(e); // 0


    }
}
