package day34_abstractClasses_interfaces;

public class DGöçmenKuşlar extends BKuşlar{

    /*
    Sadece ayrımı belirtmek için abst olmayan class lara
    CONCRETE Class denir

    1- Abstrac. bir class
    parent ı olan abst. class daki
    abst. methodleri Implement etmek zorunda değildir

    isterse implement edip  body li hale getirir
    isterse yok sayar

    2- Ast. bir silsileden sonra gelen ilk concrete class
    (kardeş class) parent veya grandParents olan abst
    class larda concreta yapılmayan tüm abst.
    classları implement ETMEK ZORUNDADIR.



     */

    @Override
    public void hareket() {

    }

    @Override
    public void beslenme() {

    }

    @Override
    public void ömür() {

    }
}
