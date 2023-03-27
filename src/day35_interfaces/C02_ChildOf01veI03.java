package day35_interfaces;

public class C02_ChildOf01veI03 implements I01_Interface,I03_Interface{

    /*
    Interface nın en büyük artısı
      bir class ın birden fazla interface i
      implement edebilmesidir

      Bir classı extends ile de başka class a child yapabiliriz

      Ancak bir den fazla interface yi implement ederken dikkat etmeliz.
      Eğer implement etmek istediğimiz farklı interface lerde
      aynı isimde fakat farklı return type ı olan method lar
      varsa iki method u aynı anda implement edemeyeceğimiz
      o iki interface nın birini imprament edebiliriz
     */
    @Override
    public void toplam() {}

    @Override
    public void çıkarma() {}

    @Override
    public String ekleme() {return null;}

    @Override
    public int faktöriyel() {return 0;}

    @Override
    public void bölme() {

    }

    public static void main(String[] args) {
        C02_ChildOf01veI03 obj=new C02_ChildOf01veI03();

        System.out.println(I01_Interface.str);
        System.out.println(I03_Interface.str);

        System.out.println(I02_Interface.str);

    }
}
