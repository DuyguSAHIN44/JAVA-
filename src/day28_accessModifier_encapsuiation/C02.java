package day28_accessModifier_encapsuiation;

public class C02 {
    public static void main(String[] args) {

        C01 obj=new C01();
       // System.out.println(C01.b);  access modifier private old için ulaşamıyoruz
        //System.out.println(C01.c); access modifier private (sadece kendi klass ında ulaşırız)

        obj.str="tava";
        C01.s="Tava";

        C01.a=50;
        obj.d=40;
    }
}
