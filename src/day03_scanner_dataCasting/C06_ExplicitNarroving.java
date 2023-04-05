package day03_scanner_dataCasting;

public class C06_ExplicitNarroving {
    public static void main(String[] args) {

        double db1=45.32;

       // int in1=db1; PROBLEM YAPTI
        int in1= (int) db1; // int---double Küçük kovayı BÜYÜK kovaya koyuyoruz. Sorumluluğu üzerimize alıyoruz

        System.out.println(in1); // 45

        db1=3987876765d;
         in1=(int)db1; //  int----double
        System.out.println(in1); //2147483647

        in1= 34;
        byte by1=(byte) in1; // byte ın sınırları -128 ile 127 arası
        System.out.println(by1); // 34

        in1=130;
        by1=(byte) in1;
        System.out.println(by1); //-126----(127 den sonra - lere geçip -128,-127,-126. oluyor 3 adım sonrası


    }
}
