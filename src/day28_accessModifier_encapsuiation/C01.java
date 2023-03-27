package day28_accessModifier_encapsuiation;

public class C01 {


    String str; // class level daki her class üyesinin access modifier i olur.
               // Eğer access modifier görünmüyorsa Java o class üyesini default access modifier olarak işaretler

    public int sayı;
    static String s;
    public static int a;
    private int b;
    private static int c=10;
    public int d;


    public static void main(String[] args) {

        int sayı=10;

       // public int sayı2 = 20;
       // static String b;
        /*
        Bir method un içerisinde public,private,protected gibi
        access modifier lar veya
        static keyword KULLANILAMAZ
         */

       // System.out.println(b); staticden dolayı ulaşamayız
        System.out.println(c);


       // str="Java"; static değil almadı
        s="hava";

        a=10;
      //  d=20;  static olmadığı için kabul etmedi


    }

    void method1() {
        System.out.println(b); //void de maraba private de maraba sıkıntı yok
        System.out.println(c);

        str="Java"; // ikisi de maraba sorun yok
        s="hava";

        a=10;
        d=20;

    }

    static void metho2() {

    }

    public void method3() {


    }
}

