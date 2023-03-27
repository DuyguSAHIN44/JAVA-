package day20_arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_KullanıcıyaListeOluşturmak {

    public static void main(String[] args) {
        // kullanıcıdan istediği kadar isim alıp
        // Q ya bastığında girdiği isimleri bize liste olarak döndürecek bir method oluşturunt

        System.out.println(kullanıcıyaListOluşturma());
    }

    public static List<String> kullanıcıyaListOluşturma() {
        List<String> isimler = new ArrayList<>();
        String girilenisim = "";
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Listeye eklenmek için bir isim girin" +
                    "\nBitirmek için Q ya basın");
            girilenisim = scan.nextLine();

            if (!girilenisim.equalsIgnoreCase("q")) {
                isimler.add(girilenisim);
            }

        } while (!girilenisim.equalsIgnoreCase("Q"));
        return isimler;


    }
}

