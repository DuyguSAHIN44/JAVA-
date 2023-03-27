package day28_deneme;

import day28_accessModifier_encapsuiation.C03_EncapsuleDatalar;

public class AccessModifierKullanımı {


    public static void main(String[] args) {

        C03_EncapsuleDatalar obj=new C03_EncapsuleDatalar();
        System.out.println(obj.a); // read
        obj.a=100; // write yani değiştirebiliyoruz



       /* obj.toplamSatış=600000;

       Başka bir class daki variable veya method a
 ulaşmak istediğimizde ulaşmak istediğimiz
 class üyesinin statik olup olmaması
 erişim yöntemini etkiler.

 Statik ise classİsmi.üyeİsmi yazarken
 Static değilse obje oluşturup objeİsmi.üyeİsmi


 Ulaşmak istediğimiz üyenin access modifier i ise
 o üyeye ulaşıp ulaşamayacağımızı belirler.

 Ulaşabilirsek o datayı okuyabilir veya o dataya
 yeni değer atayabiliriz.


         */
    }
}
