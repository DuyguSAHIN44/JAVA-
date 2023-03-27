package day35_interfaces;

public interface I04_Interface_İstisnalar {

    void toplama();
    static void açıklama(){
        System.out.println(" Bu method u implement etmek mecburi değil");
    }

    default void ekİşler(){
        System.out.println(" Default keyword ile body si olan method oluşturulabilir");

    }


}
