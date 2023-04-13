package day10_stringManipulation;

public class C05_indexOf {
    public static void main(String[] args) {

        String str = "Java çok ama çok güzel";

        System.out.println(str.indexOf("ç")); // 5. index de olduğu için bunu verdi
        System.out.println(str.indexOf("a")); // 1 --1 den fazla ise ilk bulduğunu verir
        System.out.println(str.indexOf("çok")); // 5  ile başladığı için bunu verdi

        System.out.println(str.indexOf("çok", 6)); //13
        System.out.println(str.indexOf("çok", 5)); // 5

        System.out.println(str.indexOf("java")); // -1-----EĞER DEĞER YOKSA -1 VERİR


        // Verilen bir cümlede, istenen bir string için
        // aşağıdaki cümlelerden uygun olanı yazdırın

        // 1- Aradığınız kelime cümlede 1 kere kullanılmış
        // 2- Aradığınız kelime cümlede 2 kere kullanılmış
        // 3- Aradığınız kelime cümlede 2 den fazla kullanılmış
        // 4- Aradığınız kelime cümlede hiç kullanılmamış

        String cümle="Yaşasın java, iyi ki java öğreniyorum";
        String kelime="Java";

        if (cümle.indexOf(kelime)==(-1)){ // KELİME HİÇ YOK
            System.out.println("Aradığınız kelime cümlede hiç kullanılmamış");
        }else {
            int kelimeİlkİndex=cümle.indexOf(kelime); // 8---8.index de var
            if (cümle.indexOf(kelime,(kelimeİlkİndex+1))==(-1)){ //ilk kelimenin sonrasında (+1) , kelime yoksa (YANİ 1 TANE VAR)
                System.out.println("Aradığınız kelime cümlede 1 kere kullanılmış");
            }else {
                int ikinciKelimeIndex=cümle.indexOf(kelime,(kelimeİlkİndex+1)); // 2. DE VAR
                if (cümle.indexOf(kelime,(ikinciKelimeIndex+1))==(-1)){
                    System.out.println("Aradığınız kelime cümlede 2 kere kullanılmış");
                }else {
                    System.out.println("Aradığınız kelime cümlede 2 den fazla kullanılmış");
                }
            }
        }




    }
}