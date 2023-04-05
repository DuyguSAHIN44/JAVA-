package day42_q;

import java.util.LinkedList;
import java.util.Queue;

public class C01_Queue {
    public static void main(String[] args) {

        Queue<String>harfler=new LinkedList<>();
        harfler.add("A");
        harfler.add("B");
        harfler.add("C");
        harfler.add("A");

        System.out.println(harfler); // [A, B, C, A]
     // 2. index e D ekleyelim
        // Queue özelliğnden dolayı her zaman sadece sona ekler

        System.out.println(harfler.remove()); // A hangi harfi sildiğini gösterdi
        System.out.println(harfler);// [B, C, A]

        System.out.println(harfler.remove()); // B ilk gördüğünü sildi

        // Q da sadece sona ekleyebiliriz başka ekleme yapamayız

        harfler.add("K");
        harfler.add("L");

        System.out.println(harfler.element()); // C ilk elemenı sildi
        System.out.println(harfler); // [C, A, K, L]
        System.out.println(harfler.peek()); // null değer dönderiri
        System.out.println(harfler); // elementle peek ile aynı görevi yapıyor

        Queue<String>karakterler=new LinkedList<>();
        System.out.println(karakterler.peek()); // içi boşsa null değerler veriri

        //System.out.println(karakterler.element()); // boşsa exception fırlatıyor

        System.out.println(harfler.poll());
        System.out.println(harfler);//[A, K, L]

        System.out.println(karakterler.poll()); // null



        System.out.println(karakterler.offer("*"));
        System.out.println(karakterler); // [*]
    }
}
