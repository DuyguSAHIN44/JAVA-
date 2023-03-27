package day32_inheritance_data_Typ_Kullanımı;

public class EChild extends DParent{
    String str="Child";
    void method1(){

        System.out.println("Child method 1");
    }
    // Override: geçersiz kılma
    // Overridden: geçersiz kılınan
    /*
    Burada EN GÜNCELE BAKILIR (Methodla oluşturulurken)

     */
    public static void main(String[] args) {

        EChild childC=new EChild();//
        childC.method1(); // Child method 1
        System.out.println(childC.str); // Child

        DParent childP= new EChild();
        System.out.println(childP.str);// Parent

        childP.method1();//Child method 1(  METHOD İLE YAPIYORSAK EN GÜNCEL çalışır)
        // ORTAK ÖZELLİKTE METHOD VE VARİABLE BİRBİRİNDEN FARKLI (İHTİLAFA DÜŞMÜŞLER:))
        // VARİABLE: YUKARI ÇIKAR, METHOD: DİNAMİKTİR .EN GÜNCEL (overrıde a bakar)
    }
}
