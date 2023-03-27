package day22_constructors;

public class C03_HemşireRunner {
    public static void main(String[] args) {


        C02_Hemşire hemşire1=new C02_Hemşire();
        /*
        bir obje oluştururken parametre olarak hiç bir değer girilmezse
        oluturulan obje, oluşturulduğu class daki variable lere atanan
        değerleri alır. Eğer obje oluşturulan class da
        değer ataması yoksa java default değerleri atar.
         */

        System.out.println(hemşire1.isim); // null // isim atanmamış
        System.out.println(hemşire1.evliMi); // hiçlik
        System.out.println(hemşire1.yaş); // 0
        System.out.println(hemşire1.izindeMi); // false

        hemşire1.isim="Tuba";
        hemşire1.yaş=29;

        System.out.println(hemşire1.isim); // Tuba
        System.out.println(hemşire1.yaş); // 29
    }
}
