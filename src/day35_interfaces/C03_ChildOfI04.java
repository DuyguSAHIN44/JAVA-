package day35_interfaces;

public class C03_ChildOfI04 implements I04_Interface_İstisnalar {
    @Override
    public void toplama() {

    }

    public static void main(String[] args) {


        C03_ChildOfI04 obj=new C03_ChildOfI04();
        obj.ekİşler();// default olana ulaştık

        I04_Interface_İstisnalar.açıklama();// bu methodu implement etmek mecburi değil

    }
}