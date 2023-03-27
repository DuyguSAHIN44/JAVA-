package day31_inheritance;

public class BAraba {
   protected BAraba(){
        System.out.println("Araba parametresiz con calıştı");

    }
    protected BAraba(String str){
        System.out.println("Araba str parametreli c çalıştı");

    }
    protected BAraba(int a,int b){
        System.out.println("Araba 2 int parametreli c çalıştı");


    }
}
