package day09_switch_stringManipulation;

public class C07_lenght {
    public static void main(String[] args) {

        String str="Java gün geçtikçe güzelleşiyor";

        // bu cümledeki karakter sayısını yazdırın
        System.out.println(str.length()); // 30

        // bu cümledeki son karakteri yazdırın
        System.out.println(str.charAt(str.length()-1)); // r


        // sondan 3. karakteri yazdırın
        System.out.println(str.charAt(str.length()-3)); // y
    }
}
