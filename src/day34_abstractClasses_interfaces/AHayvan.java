package day34_abstractClasses_interfaces;

public abstract class AHayvan {

    /*
    Bir class ı abstract class yapmak için deklarasyona
    abstract keyword unu yazmak yeterlidir

    Abst. classlar , class old için. const. vardır
    ama abst

    Abst. class larda bugüne kadar kullandığımız
    yapıda methotlar oluşturabiliriz ancak
    bunlar child classlar tarafından uyarlanmak(override)
    zorunda olmaz

    Child classları uyarlamaya mecbur etmek istediğimiz
    methodları da abstr. yapmalıyız

    Bir methodu abst. yapmak için yine declaration ina
    astr. yazmak yeterlidir

     */
    public abstract void hareket() ;
    public abstract void solunum() ;
    public abstract void beslenme() ;

    public abstract void cogalma() ;
    public abstract void ömür();
}
