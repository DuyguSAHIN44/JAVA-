package day09_switch_stringManipulation;

public class C05_Concat {

    public static void main(String[] args) {

        String str1="Java";
        String str2="Candır";
        String str3=" ";

        // Yukarıdaki variable leri kullanarak "Java Candır" yazdırın

        System.out.println(str1+str3+str2); // Java Candır ---İSTERSEK BÖYLE YAPARIZ
        System.out.println(str1.concat(str3).concat(str2)); // Java Candır --İSTERSEK BÖYLE YAPARIZ


    }
}
