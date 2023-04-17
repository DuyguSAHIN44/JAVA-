package day11_StringManipulations_ForLoop;

public class C05_replaceAll {
    public static void main(String[] args) {

        String str="  J&ava54 C+an@dır,,,  ";

        // str ı "Java Candır" şekline getirin

        str=str.trim(); // J&ava54 C+an@dır,,,---TIRNAK İŞARETLERİNİ SİLER
        System.out.println(str);

       str= str.replaceAll("\\d","");
        System.out.println(str); // J&ava C+an@dır,,,

        str=str.replaceAll(" ","5");
        System.out.println(str); // J&ava5C+an@dır,,,

        str=str.replaceAll("\\W","");
        System.out.println(str); // Java5Candr

        str=str.replaceAll("\\d"," ");
        System.out.println(str); // Java Candr



    }
}
