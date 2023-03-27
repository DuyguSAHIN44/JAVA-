package day24_staticBlocks;

public class C02_PassByValue {
    public static void main(String[] args) {

        /*
        Java PassByValue de kendisini değil değerini atar.
         Methodda olan methodda kalır.
          O methodda yapılan değişiklikler o methodda kalır.

         */



        double fiyat = 200;

          /*
          Java da aynı isimde iki valiable OLUŞTURAMAYIZ.
           */

        //  int fiyat=500;

        //  String fiyat="Java güzeldir";

        /*
        Java aynı method içerisinde aynı isimde
        birden fazla VALİABLE OLUŞTURMASINA İZİN VERMEZ.
         */
        indirimYap10(fiyat); // 180
        System.out.println("Method call dan sonra fiyat : " + fiyat); // 200.0 (fiyat aynı)
        indirimYap25(fiyat); //150.0
        System.out.println("2.method call dan sonra fiyat : " + fiyat); //200 ( fiyat aynı)
        System.out.println("Return yapılan methoddan dönen fiyat: " + indirimliFiyatıGetir10(fiyat));  //180
        System.out.println("3.method call dan sonra fiyat : " + fiyat); // 200 (yine değişiklik olmadı, aynı kaldı)


        /*
        Main methoddaki fiyatı kalıcı olarak değiştirmek istersek,
        main method içerisinde atama yapmalıyız.
         */

        fiyat=indirimliFiyatıGetir10(fiyat);
        System.out.println("Main methodda atama yapıldıktan sonra fiyat: " +fiyat); // 180

    }

    public static void indirimYap10(double fiyat) {
        fiyat = fiyat * 0.9;
        System.out.println("%10 indirimli fiyat : " + fiyat); // %10 indirimli fiyat : 180.0
    }

    /*
    Atama varsa kalıcı değişiklik olur.Ama hangi
    fiyat değişti? Burada scopları farklı olan iki tane variable oluştu. Ancak farklı scop olursa
    aynı ismde variableye izin verdi

     */

    public static void indirimYap25(double fiyat) {
        fiyat = fiyat * 0.75;
        System.out.println("%25 indirimli fiyat . " + fiyat);
    }

    public static double indirimliFiyatıGetir10(double fiyat) {

        fiyat=fiyat * 0.9;

        return fiyat;


    }


}
