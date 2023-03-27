package day28_deneme;

import day28_accessModifier_encapsuiation.C03_EncapsuleDatalar;

public class EncapsuletionKullanımı {
    public static void main(String[] args) {

        System.out.println(C03_EncapsuleDatalar.getIsim());

        C03_EncapsuleDatalar obj=new C03_EncapsuleDatalar();
        obj.setSatışTutarı(100); // write yetkisi
        obj.setSatışTutarı(200);
        obj.setSatışTutarı(300);

        System.out.println("Toplam satış : " + obj.getToplamSatış());



       // System.out.println(obj.SatışTutarı(); // acsess modfier i default oldugu için (default değil) okuyamama ve yazamam
       // obj.SatışTutarı();= 100; // acsess modfier i default oldugu için(public değil) okuyamam ve yazamam




    }
}
 /*


C03 class ındaki
isim variablenin değeri görülsün ama değiştirilemezsin
Satış tutarı ise değer girilebilsin
ama girilen değerler sonradan görülemesin

Eğer bir variable için read veya write
özelliklerinin
birbirinden ayrılması
isteniyorsa öncellikle
access modifier ile kimsenin
ulaşamamasını sağlayın

Private yaparak kimsenin ulaşamayacağını garantiye aldıktan
sonra READ vermek istediklerimiz için getter(),
WRİTE yetkisi vermek istediklerimiz için setter() oluşturmalıyız

  */