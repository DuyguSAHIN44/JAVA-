package day38_exceptions_Finalize;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C05_Iterator {
    public static void main(String[] args) {

        List<Integer> sayılar=new ArrayList<>();

        sayılar.add(61);
        sayılar.add(12);
        sayılar.add(14);
        sayılar.add(4);
        sayılar.add(72);

        // çift olan sayıları silin

        Iterator it1= sayılar.iterator();

        // iterator interface old için method oluşmaz Bundan dolayı sayılar.iterator deriz

        while (it1.hasNext()){ // yanında adam var olduğu sürece ilerle

         Integer sayı=(Integer)it1.next();// burda casting yaptık ÇÜNKÜ it.1.next Object istiyor ama karşılığı integer bundan dolayı casting yaptık

            if (sayı%2==0){

            }

         it1.remove();
            System.out.println(sayılar);


        }




    }
}
