package day10_stringManipulation;

public class C06_lastIndexOf {
    public static void main(String[] args) {

        String str="Java bazen beyin yakar";

        System.out.println(str.indexOf("a")); // 1
        System.out.println(str.lastIndexOf("a")); //20
        System.out.println(str.indexOf("a",2)); //3
        System.out.println(str.lastIndexOf("a",19)); // 18
        System.out.println(str.indexOf("a",4)); // 6
        System.out.println(str.lastIndexOf("a",17)); // 6

        System.out.println(str.indexOf('e')); // 8
        System.out.println(str.lastIndexOf('e'));// 12----CHAR DA YAPABİLİYORUZ

        System.out.println(str.lastIndexOf("Mustafa")); // -1 ---OLMAYINCA -1 VERİYOR



        // Verilen bir cümlede, istenen bir string için
        // aşağıdaki cümlelerden uygun olanı yazdırın

        // 1- Aradığınız kelime cümlede 1 kere kullanılmış
        // 2- Aradığınız kelime cümlede 1 den fazla kullanılmış
        // 3- Aradığınız kelime cümlede hiç kullanılmamış

        String cümle="Yaşasın java, iyi ki java öğreniyorum";
        String kelime="java";

        int ilkIndex=cümle.indexOf(kelime); // 8. index de kullanılmış
        int lastIndex=cümle.lastIndexOf(kelime); // 21, index de kullanılmış

        if (ilkIndex==(-1)){
            System.out.println("Aradığınız kelime cümlede hiç kullanılmamış");
        } else if (ilkIndex==lastIndex) {
            System.out.println("Aradığınız kelime cümlede 1 kere kullanılmış");
        }else {
            System.out.println("Aradığınız kelime cümlede 1 den fazla kullanılmış"); // 8 ile 21 eşit olmadığı için
        }

    }
}
