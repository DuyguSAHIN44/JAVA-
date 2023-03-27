package day19_ArrayLists;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class C05_TekrarlardanKurtulmak {
    public static void main(String[] args) {
        /*
        verilen bir arrayden tekrar eden sayıları silip
        her bir elementin sadece 1 kez kullanıldığı bir hale dönüştürün.
         */

        int[] arr={3,4,5,6,3,4,2,3,5,4,6,5,4,3,5,7}; //ARRAY DE UZUNLUĞU DEĞİŞTİREMİYORUZ

        // Bir tane boş list oluşturalım
        // Array de her bir elemenı ele alalım
        //Ele aldığımız element List te yoksa ekleyelim, varsa eklemeyelim
        // böylece benzersiz elementlerden oluşan bir list oluşturalım

        List<Integer> benzersizElementList=new ArrayList<>();
        for (int i=0; i< arr.length; i++){

            if (!benzersizElementList.contains(arr [i])){
                benzersizElementList.add(arr[i]);

                }
            }

            System.out.println(benzersizElementList); // [3, 4, 5, 6, 2, 7]

        // İstenen listeyi list olarak ele aldık
        // Bunu arr ye direkt atayamayız

        arr=new int[benzersizElementList.size()]; // [0,0,0,0,0,0]

        for (int i =0; i< arr.length; i++){
            arr[i]=benzersizElementList.get(i);

        }
        System.out.println(Arrays.toString(arr)); // [3, 4, 5, 6, 2, 7]


    }
}
