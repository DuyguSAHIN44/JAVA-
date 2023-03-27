package day29_inheritance;

public class C04_Child extends C03_ParentClass{

    int c=20;
    int a;
    String s="Child class";

    public void method1(){
        System.out.println("child class method1");
    }

    public static void main(String[] args) {
        C03_ParentClass obj=new C03_ParentClass();


        C04_Child objC04=new C04_Child();
        objC04.a=50;
        objC04.c=20;

        objC04.b=8;
        objC04.t="y";


        /*
        Bir class ın baska bir class daki TÜM ÖZELLİKLERİ
        otomatik olarak edinmesini istiyorsak class ımızı extends keyword
        ile class achild yaparız.
        SİZİ BABAM YAPTIM
         */
    }



}



