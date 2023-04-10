package day08_nestedİfElse_ternary;

public class C10_NestedTernary {
    public static void main(String[] args) {

        // Kullanıcıdan bir tamsayı alın
        // Sayı pozitifse, çift sayı veya çift sayı değil seçeneklerinden uygun olanı yazdırın
        // sayı pozitif değilse, 3 basamaklı veya 3 basamaklı değil seçeneklerinden
        // uygun olanı yazdırın

        int sayı=20;
        System.out.println(sayı>0
                          ? sayı % 2==0 ? "Çift sayı" : "Tek sayı"
                          : sayı>-1000 && sayı<-99 ? "Üç basamaklı" :" üç basamaklı değil" );
    }
}
