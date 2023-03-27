package day35_interfaces;

public interface I01_Interface {

    static int sayı=10;
    final String str="Java Candır";
    public static final boolean b =true;

    /*
    Interface de tüm variable lar (yazılmasa bile)
    public, static ve final dir
    Final old için sonradan değiştirme imkanı yoktur,
    oluştururken değer atanmalıdır
    Bu özellikler standart olarak tüm variable lara
     tanımlandığından,
     bu tanımlamaları yapmak gerekli değildir(intelliJ gri yaptı)
     */

    void toplam();
    public void çıkarma();
    abstract String ekleme();
    public abstract int faktöriyel();
    /*
    Tüm methodlarda standart olarak
    public ve abstrac tır. (Yazılmaasa bile)

     */






}
