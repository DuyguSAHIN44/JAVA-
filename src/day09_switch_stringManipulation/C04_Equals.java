package day09_switch_stringManipulation;

public class C04_Equals {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "JAVA";
        String str3 = "java";
        String str4 = "JaVa";

        System.out.println(str2.equals(str3)); // false
        System.out.println(str4.equals(str1)); // false

        //Eğer büyük küçük harfle dikkat etmeden Stringleri karşılaştırmak istersek

        System.out.println(str2.equalsIgnoreCase(str3)); // true
        System.out.println(str4.equalsIgnoreCase(str1)); // true


        String str5 = "Java";
        String str6 = "Ja";
        String str7 = "va";
        String str8 = str6.concat(str7);

        System.out.println(str8); // Java

        System.out.println(str1 == str5); // true---Java-Java
        System.out.println(str1 ==str3 ); // false---Java-java

        /*
        == ile Stringleri karşılaştırırsak hem metin değerlerini hem de refaranslarına bakar
        equals ile Stringleri karşılaştırırsak sadece metin değerlerine bakar

        == ile Stringleri karşılaştırdığımızda beklediğimizden farklı sonuçlar alabilir,
        bu yüzden iki String i karşılaştıracaksak == değil, equals kullanmalıyız

         */
    }
}
