package day11_StringManipulations_ForLoop;

public class C06_replace {
    public static void main(String[] args) {

        /*
         Soru 2 : Kullanicinin belirli bir formatta verdigi
        String fiyatlari toplayip yazdirin.

        input1 : “15.30 €” , input2 : “11.40 €”
        output : 26.70 €

         */

        String input1="15.30 €";
        String input2="11.40 €";

        // input larda digit olmayan her şeyi yok edelim

       input1= input1.replaceAll("\\D","");
       input2= input2.replaceAll("\\D","");

        System.out.println(input1);// 1530

        //digit olmayanları kaldırdık ama String oldukları için toplayamayız
        // double i parse a çevirmeliyiz

        double inp1=Double.parseDouble(input1);
        double inp2=Double.parseDouble(input2);

        System.out.println(inp1); // 1530.0

        System.out.println((inp1+inp2)/100+" €"); // 26.7 €-- VİRGÜLLÜ OLSUN DİYE /100 YAPTIK





    }
}