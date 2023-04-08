package day45_maps_THE_END;

import java.util.TreeMap;

public class C01_TreeMapMethodları {
    public static void main(String[] args) {


        TreeMap<String, Integer> deneme = new TreeMap<>();

        deneme.put("F",20);
        deneme.put("T",30);
        deneme.put("A",10);
        deneme.put("M",25);
        deneme.put("Z",30);

        System.out.println(deneme.tailMap("F"));//{F=20, M=25, T=30, Z=30}
        System.out.println(deneme.tailMap("C"));
        System.out.println(deneme.tailMap("O"));//{T=30, Z=30}

        // Varsa verilen key den başlayıp sona kadar yazar
        // verilen key yoksa, olsaydı neerede olurdu bulup, sonrakini döndürür

        System.out.println(deneme.tailMap("M",false));// {T=30, Z=30}

        // Java da başlangıç değerleri inclusive dir
        //Eğer tail alırken verdiğimiz key inin dahil olmasını istemezsek,
        //false parametresi yazabiliriz
        System.out.println(deneme.headMap("M"));//{A=10, F=20}
        System.out.println(deneme.headMap("O"));

        System.out.println(deneme.pollLastEntry());
        System.out.println(deneme);

        System.out.println(deneme.pollFirstEntry());//A=10
        System.out.println(deneme);//{F=20, M=25, T=30}

        //ilk veya son entry silip, sildiği entry i bize döndürür

        System.out.println(deneme.higherKey("M"));//T
        System.out.println(deneme.higherKey("C"));// F
        System.out.println(deneme.higherEntry("F"));//M=25

        // Verdiğimiz key den büyük olan ilk key/entry yi döndürür

        System.out.println(deneme.lowerKey("M"));// F
        System.out.println(deneme.lowerKey("Z"));// T
        System.out.println(deneme.lowerEntry("K"));//F=20

        // Verdiğimiz key den küçük puan olan ilk key/entry i döndürür

        System.out.println(deneme.floorKey("M"));// M --M yi yuvarlar büyük eşit küçük eşit
        System.out.println(deneme.floorKey("K"));// F
        System.out.println(deneme.ceilingKey("K"));//M
        System.out.println(deneme.ceilingKey("T"));//T Var zataen onu döndürüyor

        // higher ve lower dan farkları büyük eşit, küçük eşit gibi düşünmeleridir

        System.out.println(deneme.descendingMap());//{T=30, M=25, F=20}
        System.out.println(deneme.subMap("K", "O"));//{M=25}
        System.out.println(deneme.subMap("F","O"));//{F=20, M=25}
        //Başlangıç key inclusive, bitiş key exclusive olarak
        // aralarındaki entry leri döndürür
    }
}