package day03_scanner_dataCasting;

public class C05_DataCasting {
    public static void main(String[] args) {

        /*
        Bazı primitive data türleri başka hiç bir data türünden değer kabul etmes
        Bazı primitive data türleri özel şartlar ile başka türdeki dataları değer olarak kabul eder
         */

        boolean bl=false;
        bl=true;

        //bl="true";
        //bl=20;
        //  bl='m';

        char ch='4';
        ch='%';
        ch=99;

        int sayı1=20;
        short sayı2=16;
        double sayı3=24;

        sayı1=sayı2;

       // sayı1=sayı3;

        //sayı2=sayı1; short--int --int daha geniş old için PRONLEM

        sayı3=sayı1;// double---int

        sayı3=sayı2; //double--short

        sayı1=ch;
       // sayı2=ch;
        sayı3=ch;
    }
}
