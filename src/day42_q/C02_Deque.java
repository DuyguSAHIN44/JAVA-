package day42_q;

import java.util.Deque;
import java.util.LinkedList;

public class C02_Deque {
    public static void main(String[] args) {

        /*
        Deque Double and Queue  BAŞTAN VE SONDAN EKLER
        Çift taraflı kuyruk
         */

        Deque<String>hrfler=new LinkedList<>();
        hrfler.add("j");
        hrfler.add("K");
        System.out.println(hrfler); // [j, K]

        hrfler.addFirst("B"); //  özellikle başa ekler
        System.out.println(hrfler); // [B, j, K]

        System.out.println(hrfler.remove()); // B yi sildim diyor
        System.out.println(hrfler); // [j, K]

        hrfler.addFirst("T" );// T,J,K
        hrfler.addLast("T");//T,J,K,T
        hrfler.add("L");//T,J,K,T,L
        System.out.println(hrfler); // [T, j, K, T, L]

        //2. T yi silelim
        System.out.println(hrfler.removeLastOccurrence("T")); // son gördüğün T yi sil demiştik
        System.out.println(hrfler); // [T, j, K, L]

        System.out.println(hrfler.removeLastOccurrence("R"));// false R yi sil dedik ama olmadığı için false verdi
        System.out.println(hrfler); // [T, j, K, L]

        System.out.println(hrfler.peekLast()); // L ---son harfi verdi son gördüğün harfi al
        System.out.println(hrfler.hashCode());//3530232 hash kodunu verdi

        LinkedList karakterler=new LinkedList<>();
        karakterler.add("*");
        karakterler.add("?");
        System.out.println(karakterler);// [*, ?]

        karakterler.push("&");
        System.out.println(karakterler); // [&, *, ?] en baştakini itti ve yerleşti:))


        LinkedList<String>kopya=(LinkedList<String>)karakterler.clone();
        System.out.println(kopya);


    }
}
