package day43_colections;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class C02_MixSet {
    public static void main(String[] args) {
        Set<Object>mixSet=new HashSet<>();

        mixSet.add(12);
        mixSet.add("Java");
        mixSet.add('S');
        mixSet.add(true);

        int[]arr=new int[3];
        mixSet.add(arr);

        //List<Object> mixList=new ArrayList<>();
      //  mixList.add("Hava");
     //   mixList.add(24);


    }
}
