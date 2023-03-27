package day36_exceptions;

public class C07_ExceptionsTürleri {
    public static void main(String[] args) {

        String str=null;
        System.out.println(str); // null DEĞER ATAMADAN KULLANAMAYIZ --null yazar yazdırırsak null yazar AMA CONCAT de hata verir
      //  System.out.println(str.concat("Java"));---HATA VERDİ  --NULL POINTER EXCEPTİON verir



        String str1="34";
        String str2="23";

        //  String olarak sayıların toplamını yazınız

        System.out.println(Integer.parseInt(str1)+Integer.parseInt(str2)); // 57

        //yanlışlıkla  String str="23a"; yazsak hata verir--NUMBER FORMAT EXCEPTION



        String str4= "Java Candır";

        Object obj =str4; // baba old için kabul eder OBCECT STR NIN BABASIDIR KABUL ETTİ



            Integer a = (Integer) obj; // burda casting yaptık-- AMA İÇERİĞE UYGUN OLMADIĞI İÇİN HATA VERİR



    }
}
