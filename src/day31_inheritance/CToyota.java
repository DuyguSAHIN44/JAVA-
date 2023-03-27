package day31_inheritance;

public class CToyota extends BAraba{
    protected String str2="Toyota";
    protected CToyota(){
        this("Java");
        System.out.println("Parametresiz Toyota con çalıstı");

    }
    protected CToyota(int sayı){
        System.out.println("İnt" );
    }
    protected CToyota(String s){
        System.out.println("Str");

    }
}
