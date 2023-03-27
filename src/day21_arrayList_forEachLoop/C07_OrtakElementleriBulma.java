package day21_arrayList_forEachLoop;

import day20_arraylists.C04_KullanıcıyaListeOluşturmak;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C07_OrtakElementleriBulma {
    public static void main(String[] args) {

        // SORU 3) Verilen String bir listede
       // istenmeyen harf içeren içeren elementleri silip// kalan kısmını list olarak bize döndüren bir method oluşturun

        List<String> liste= C04_KullanıcıyaListeOluşturmak.kullanıcıyaListOluşturma();
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen kullanılmasını istemediğinizbir harf girin");
        String istenmeyenHarf= scan.next().substring(0,1);

       List<String>ayıklanmışList= istenmeyenHarfİçerenleriSil(liste,istenmeyenHarf);
        System.out.println(ayıklanmışList);

    }
    public static  List<String>istenmeyenHarfİçerenleriSil(List<String>liste, String istenmeyenHarf) {


    // Mesela listemiz Ali,Veli,Ayşe ve Fatma ; istenmeyen harf ise a olsun.
    // For Loop ile elementleri ele alırken remove yaparsak
    // List in uzunluğu değişeceği için sorun yaşarız
    //farklı bir list oluşturup, silinmeyecekleri yeni listeye kaydedelim.

        List<String>kalanlarListesi=new ArrayList<>();
        for (int  i=0; i< liste.size(); i++){
          if(!liste.get(i).contains(istenmeyenHarf)) {
              kalanlarListesi.add(liste.get(i));
          }
        }
        return kalanlarListesi;

        }

}
