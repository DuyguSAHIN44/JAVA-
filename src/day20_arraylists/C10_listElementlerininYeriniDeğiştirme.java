package day20_arraylists;

import java.util.ArrayList;
import java.util.List;

public class C10_listElementlerininYeriniDeğiştirme {
    public static void main(String[] args) {

        List<Integer> sayılar=new ArrayList<>();
        sayılar.add(3);
        sayılar.add(5);
        sayılar.add(1);
        sayılar.add(4);
        sayılar.add(3);
        sayılar.add(7);
        sayılar.add(10);

        //2.indexdeki element ile 5. indexdeki elementlerin yerini değiştirin

        System.out.println(sayılar); // [3, 5, 1, 4, 3, 7, 10]
        // önce bir tanesini temp  variable e atayalım
        int temp=sayılar.get(2);
        //2. index e5. indexdeki değeri atayalım
        sayılar.set(2,sayılar.get(5)); // add yeni sayı olarak ekler bundan dolayı onu yapmadık
        //5. indexe temdeki değeri atayalım
        sayılar.set(5,temp); // [3, 5, 7, 4, 3, 1, 10]

        System.out.println(sayılar);


        //ödev: verilen bir listede, istenen 2 indexdeki elementlerin yerini değiştiren
        //yeni listeyi bize döndüren bir method oluşturun



    }
}
