package day38_exceptions_Finalize;

import java.io.PrintStream;
import java.util.Arrays;

public class C03_Iterator {
    public static void main(String[] args) {

        int[]arr={3,8,1,9,15};

        //tüm elementleri yazdır
        // for each loop

        for (int each:arr
        ){
            System.out.print(each+ "  "); // 3,8,1,9,15
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");

        }

        // Index kullanmadan tüm elementleri 3 artırıp kaydedin
        // Index istemediği için normal loop kullanamayız
        // For each loop kullanırız

        for (int each:arr
        ){
            each=each+3;
            System.out.println(each+" ");
        }
        System.out.println(Arrays.toString(arr));// değişmedi --[3, 8, 1, 9, 15]

        // Bunu değiştirebilmemiz için ya index yada hiç
        // Java da bazı yapılar index desteklemez 10. elementi 2 artır diyemeyiz

    }
}
