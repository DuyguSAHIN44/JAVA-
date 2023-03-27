package day33_poliymorhism;

public class BChild extends AParent{
    void method1(){
        super.method1();
        /*
        Burada super. olursa hem child classtaki
        hem super class daki method çalışır
         */

    }
    void method2(){
        /*
        Bir method override edildiğinde child class ta
        @Override notasyonu KULLANILABİLİR

        Kullanmak veya kullanmamak arasında pratikte şöyle bir sonuç oluşur

        Eğer notasyon kullanılırsa java
        2 method arasındaki ilişki takip edilir
        parent classtaki method silinirse
        notasyon CTE verir

        Notasyon yoksa parent classtaki overriden method silinirse bir uyarı verilmez
        CTE oluşmaz

         */

        }
    Integer method3(){

        // Overriden ile overriding methodların isim ve signıtureleri aynı olmalıdır
        // Return typ ve access modifier,
        // SIGNITURE(Method ismi, Parametre sayısı ve parametre türü)
        // a dahil değildir
        // Ancak overriding de bunlarla dahil kurallar vardır
        /*
        1- access mofifier kuralı

           child parent ı kısıtlayamaz  (GENİŞDEN DARA=Public,Protected, Default,Private(private olursa overriding olmaz))
           (child(default olduğunda),parent(public) olursa kısıtlar buna izin yok.

           Eğer overriden ve overring methodları
        PRIVATE yaparsak
        bu iki method BAĞIMSIZ OLARAK calışır
        Aralarında override işlemi olmaz

        2- RETURN TYPE KURALLARI

          Return type primitive (küçük int,küçük double,küçük boolen gibi) veya void ise
          iki method un return typleri AYNI olmalıdır
          (int ise int olmalıdır)

          Non primitive olduğunda ya aynı olmalı(INTEGER INTEGER)
          Veya parent classtaki return type child classtaki
          return type ın parent ıOLMALIDIR.
          (COVARIANT denir buna)

         */

        return 5;
    }
}
