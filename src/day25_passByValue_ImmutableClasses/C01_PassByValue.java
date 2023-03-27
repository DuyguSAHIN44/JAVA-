package day25_passByValue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_PassByValue {
    /*
    JAVA, PASS BY VALUE YU TERCİH ETMİŞTİR
    PASS BY VALUE: Bir methoda parametre olarak gönderdiğimiz
    variablenin değeri methotta değiştirilirse
    bizim main methottaki variablemizin değeri değişmez

    Peki methoda gönderdiğimiz list,array gibi bir objeyse durum nasıl ???
    Pass By Value nasıl çalışır?
    Eğer methotta new diye bir methot ataması yoksa sadece elementler değişiyorsa
    o zaman bizim main methoddaki sayılar da değişmiş olur
    Araba aynı yolcular değişmiş olur
    Ama methodda yeni bir keyword ile değer atanmışsa
    yeni atanan değer methodda kalır
    bizim main methottaki hem listteki hem de arraydeki elementler değişmemiş olur

     */
    public static void main(String[] args) {
        List<Integer>sayılar=new ArrayList<>();
        sayılar.add(3);
        sayılar.add(4);
        sayılar.add(5);
        System.out.println(sayılar); // [3, 4, 5]

        elementleriArttır(sayılar);
        //elementleri arttır methodunu çalıştırdıktan sonra
        System.out.println("element arttır methodundan sonra : " + sayılar);// [6,8,10

        yeniListeAta(sayılar);
        System.out.println("Yeni liste ata methodundan sonra : " + sayılar); // [6, 8, 10]

    }
    public static void elementleriArttır(List<Integer>sayılar){

        // tüm sayıları 2 katına çıkaralım
        for (int i = 0; i < sayılar.size() ; i++) {
            sayılar.set(i,2*sayılar.get(i));
        }
        System.out.println("Elementleri arttır methodu : " + sayılar); // [6, 8, 10]
    }
    public static void yeniListeAta(List<Integer>sayılar){
        // sayılar listesine yeni bir list değeri atayıp
        // sonra 1,2,3 elementlerini ekleyin

        sayılar=new ArrayList<>();
        sayılar.add(1);
        sayılar.add(2);
        sayılar.add(3);

        System.out.println("Yeni liste ata methodunda : " + sayılar); // [1, 2, 3]
    }
}
