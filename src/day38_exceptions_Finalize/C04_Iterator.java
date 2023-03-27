package day38_exceptions_Finalize;

import java.util.ArrayList;
import java.util.List;

public class C04_Iterator {
    public static void main(String[] args) {


    /*
    Javada collectin konusunda öğreneceğimiz Set gibi
    bazı yapılar index desteklemez( ekleme, çıkarma , yazdırma yapamayız)

    Bu durumda index olmadığından elementler yazdırmak istersek
     for each loop kullanabiriz ama elementeleri arasında dolaşmak,
     belirli şartları sağlayanları update etmek istersek for each ile yapamayız.

     Hatta List de istenmeyen elementleri silmek istediğimizde
     her sildiğimiz element uzunluğu değiştirdiği için
     kodlar sağlıklı çalışmaz

     Bu sorunları çozmek için Java ITERATOR INTERFACEYI  yi kullanır
     */



        List<Integer>sayılar=new ArrayList<>();

        sayılar.add(5);
        sayılar.add(12);
        sayılar.add(1);
        sayılar.add(4);
        sayılar.add(7);

        // çift olan sayıları silin

        for (int i = 0; i < sayılar.size(); i++) {
            if (sayılar.get(i)%2==0);
            sayılar.remove(i);

        }
        System.out.println(sayılar);

    }
}