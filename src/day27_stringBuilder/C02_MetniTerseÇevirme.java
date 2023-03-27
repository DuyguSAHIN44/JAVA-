package day27_stringBuilder;

public class C02_MetniTerseÇevirme {
    public static void main(String[] args) {

        //  Verilen bir metni tersine çevirme

        String str="Java candır";

        StringBuilder sb=new StringBuilder(str);

        sb.reverse();

        System.out.println(sb); // rıdnac avaJ=== tersine çevirdik
    }
}
