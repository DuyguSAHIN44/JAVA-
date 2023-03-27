package day24_staticBlocks;

public class C01_StaticBlocks {


    C01_StaticBlocks(){

        System.out.println("Constructor çalıştı ");
    }
    public static void main(String[] args) {

        System.out.println("Main method çalıştı");

        System.out.println("=========");

        C01_StaticBlocks OBJ1=new C01_StaticBlocks(); // Statik olmayan blok çalıştı
    }
    static {
        /*
        Statik bloklar classlar, ilk çalışmaya  başladığında çalışır.

        Genel olarak class için gerekli olan ön ayarlamaları yapmak için kullanılır.

        Birden fazla static blok varsa yukarıdan aşağıya doğru çalışır
         */
        System.out.println("Statik blok çalıştı");
    }

    static {

        System.out.println("Alttaki static blok çalış");
    }
    {
        // statik olmayan bloklar ise obje oluşturulurken
        //const. dan önce çalışır
        //obje için yapılması gereken ön ayarlamaları yapmak için kullanılır
        System.out.println("Statik olmayan blok çalıştı");
    }
}
