package day38_exceptions_Finalize;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C06_List_Iterator {
    public static void main(String[] args) {
        List<Integer> sayılar=new ArrayList<>();

        sayılar.add(61);
        sayılar.add(12);
        sayılar.add(14);
        sayılar.add(4);
        sayılar.add(72);

        // tüm elementleri index
        ListIterator lit= sayılar.listIterator();

        while (lit.hasNext()){
            Integer sayı=(Integer) lit.next();
            lit.set(sayı+3);
            System.out.println(sayılar);
        }

    }
}
