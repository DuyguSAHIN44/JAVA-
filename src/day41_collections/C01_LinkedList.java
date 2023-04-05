package day41_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01_LinkedList {
    public static void main(String[] args) {


        /*
        Collections; objeleri bir arada tutan yapılardır
        Günlük hayatta karşılaşılan durumlar
        ile ilgili oluşan ihtiyaçlara gore yapılan farklı
        collections yapıları vardı
        r
        Hangı coll. kullanacağımıza nasıl kara veririz?
        Özelliğine göre karar veririz. Örneğin rast gele seçeceksek set kull
        3 ana collections vardır:
        1)List:
        2)Queue
        3)Set
        3 interface ile kuralları belirleniyor
        İnterface lerde obje oluşturamadağımız için bu objeleri
        child class lardan constructorlarını kullanıyoruz.
        Özellikleri const lar belirlemez. DATA TÜRÜ olarak seçtiğimiz collectionslar belirler.

         */
        LinkedList<String>Linked1=new LinkedList<>();
        List<String>Linked2=new LinkedList<>();
        Queue<String>Linked3=new LinkedList<>();
        Deque < String>Linked4=new LinkedList<>();

    }
}
