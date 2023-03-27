package day22_constructors;

public class C05_DoktorRunner {

    public static void main(String[] args) {


        /*
    Constructor çalışmadan
     */


        C04_Doktor doktor1=new C04_Doktor(); // Parametresiz constructor çalıştı

        doktor1.isim="Kemal";
        doktor1.yaş=40;

        System.out.println(doktor1.isim); // Kemal
        System.out.println(doktor1.yaş); // 40
        System.out.println(doktor1.soyisim); // null


        C04_Doktor doktor2=new C04_Doktor(); // gidip C04 deki Doktor class ındaki kalıba bakar

        C04_Doktor doktor3;
       // System.out.println(doktor3.yaş);  Constructor çalışmadan bir obje oluşturulup
        //değer atanması mümkün değildir.

        System.out.println("variable a atanmayan obje için yaş " +new C04_Doktor().yaş); // variable a atanmayan obje için yaş 0





    }

}
