package day06_bağımsızİfCümleleri;

import java.util.Scanner;

public class C07_İfElseStatements {
    public static void main(String[] args) {

        // Soru 4: Kullanıcıdan bir karakter girmesini isteyin,
        // girilen karakterin büyük harf olup olmadığını yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char karakter=scan.next().charAt(0);

        if (karakter>=65 && karakter<=90){ // 2. YÖNTEM---------if( 'A'<=karakter && <='Z' )
            System.out.println("Girilen karakter büyük harf");
        }else {
            System.out.println("Girilen karakter büyük harf değil");
        }
    }
}
